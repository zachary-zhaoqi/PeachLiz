package controller;

import dao.CommodityDAO;
import dao.InventorySpecificationDAO;
import dao.PageModelDAO;
import dao.impl.CommodityDAOImpl;
import dao.impl.InventorySpecificationDaOImpl;
import model.InventorySpecification;
import model.PageModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;

@Controller
public class InventoryController {


    /**
     * @param whereName 属性名
     * @param whereValue 属性值
     *                   通过某一个商品的型号来查询产品，若值为空则查询全部库存.
     *                   得到为此型号的id（应该是只有一个）
     *                   再通过id查询全部库存数据
     * */
    @RequestMapping("queryInventory")
    public ModelAndView queryInventory(String whereName,String whereValue) throws Exception {
        // TODO: 2018/12/5 与commodityController中的查询太像了，想着提取一下
        ModelAndView modelAndView=new ModelAndView();


        try {
            //处理字符串乱码问题
            whereName= new String(whereName.getBytes("ISO8859-1"), StandardCharsets.UTF_8);
            whereValue= new String(whereValue.getBytes("ISO8859-1"), StandardCharsets.UTF_8);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        if (null==whereValue||"".equals(whereValue)){
            modelAndView.setViewName("error");
            modelAndView.addObject("errormessage",new Exception("请输入产品型号，不能为空哦！").getMessage());
            return modelAndView;
        }

        PageModel<InventorySpecification> pageModel;
        PageModelDAO pageModelDAO=new InventorySpecificationDaOImpl();
        CommodityDAO commodityDAO = new CommodityDAOImpl();

        int idcommodity = commodityDAO.getId(whereName,whereValue);
        String name = "idcommodity";

        try {
            pageModel= new PageModel<>(1, pageModelDAO.getTotalRecord(name, idcommodity), 8);
            pageModel.setWhereName(whereName);
            pageModel.setWhereValue(whereValue);
            pageModel.setList(pageModelDAO.getPageList(name,idcommodity,pageModel.getIndex(),pageModel.getPageSize()));
            modelAndView.setViewName("inventory/manage");
            modelAndView.addObject("PageModel",pageModel);
        } catch (Exception e) {
            e.printStackTrace();
            modelAndView.setViewName("error");
            modelAndView.addObject("errormessage",e.getMessage());
        }

        return modelAndView;
    }

    @RequestMapping("/updateInventoryPageList")
    public ModelAndView updatePageList(int pageNumber,int totalRecord,int pageSize,String whereName,String whereValue) throws Exception {
        PageModelDAO pageModelDAO = new InventorySpecificationDaOImpl();
        PageModel<InventorySpecification> pageModel;
        ModelAndView modelAndView=new ModelAndView();

        CommodityDAO commodityDAO = new CommodityDAOImpl();
        int idcommodity = commodityDAO.getId(whereName,whereValue);
        String name = "idcommodity";


        try {
            pageModel= new PageModel<>(pageNumber, totalRecord, pageSize);
            pageModel.setWhereName(whereName);
            pageModel.setWhereValue(whereValue);
            pageModel.setList(pageModelDAO.getPageList(name, idcommodity, pageModel.getIndex(),pageModel.getPageSize()));
            modelAndView.setViewName("inventory/manage");
            modelAndView.addObject("PageModel",pageModel);
        } catch (Exception e) {
            e.printStackTrace();
            modelAndView.setViewName("error");
            modelAndView.addObject("errormessage",e.getMessage());
        }

        return modelAndView;

    }


    /**
     * @param commodityModel    产品编号
     * @param Specification     产品规格
     * @param number            库存数
     *
     *                          通过产品编号查找产品id
     *                          自动生成库存id，填充相应的数据
     * */
    @RequestMapping("addInventorySpecification")
    public ModelAndView addInventorySpecification(String commodityModel,String Specification,int number) {
        ModelAndView modelAndView=new ModelAndView();

        CommodityDAO commodityDAO = new CommodityDAOImpl();
        InventorySpecificationDAO inventorySpecificationDAO = new InventorySpecificationDaOImpl();
        String name = "model";
        int idcommodity = 0;
        try {
            idcommodity = commodityDAO.getId(name,commodityModel);
        } catch (Exception e) {
            e.printStackTrace();
            modelAndView.setViewName("error");
            modelAndView.addObject("errormessage","产品型号输入错误");
        }

        try {
            inventorySpecificationDAO.addInventorySpecification(idcommodity,Specification,number);
        } catch (SQLException e) {
            e.printStackTrace();
            modelAndView.setViewName("error");
            modelAndView.addObject("errormessage","尺寸输入错误，可能已存在相同尺寸");
        }

        PageModel<InventorySpecification> pageModel;
        PageModelDAO pageModelDAO=new InventorySpecificationDaOImpl();

        try {
            pageModel= new PageModel<>(1, pageModelDAO.getTotalRecord("idcommodity", idcommodity), 8);
            pageModel.setWhereName("model");
            pageModel.setWhereValue(commodityModel);
            pageModel.setList(pageModelDAO.getPageList("idcommodity",idcommodity,pageModel.getIndex(),pageModel.getPageSize()));
            modelAndView.setViewName("inventory/manage");
            modelAndView.addObject("PageModel",pageModel);
        } catch (Exception e) {
            e.printStackTrace();
            modelAndView.setViewName("error");
            modelAndView.addObject("errormessage",e.getMessage());
        }


        return modelAndView;
    }

    /**
     * @param idinventory 库存id
     * @param number 新的库存数量
     *               更新数据库中的库存数量
     */
    public ModelAndView updateInventorySpecification(int idinventory,int number){
        // TODO: 2018/12/6 陈亮  更新完留个todo给我
        InventorySpecificationDAO inventorySpecificationDAO = new InventorySpecificationDaOImpl();
        inventorySpecificationDAO.updateInventorySpecification(idinventory,number);


        return null;
    }
}
