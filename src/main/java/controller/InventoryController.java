package controller;

import dao.CommodityDAO;
import dao.InventoryOperationDAO;
import dao.InventorySpecificationDAO;
import dao.impl.CommodityDAOImpl;
import dao.impl.InventorySpecificationDaOImpl;
import model.Commodity;
import model.InventorySpecification;
import model.PageModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

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
    public ModelAndView queryInventory(String whereName,String whereValue){
        // TODO: 2018/12/5 与commodityController中的查询太像了，想着提取一下
        ModelAndView modelAndView=new ModelAndView();
        PageModel<InventorySpecification> pageModel;
        try {
            //处理字符串乱码问题
            whereName= new String(whereName.getBytes("ISO8859-1"), StandardCharsets.UTF_8);
            whereValue= new String(whereValue.getBytes("ISO8859-1"), StandardCharsets.UTF_8);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        if (null==whereValue||"".equals(whereValue)){
            whereValue="%";
        }
        InventorySpecificationDAO inventorySpecificationDAO=new InventorySpecificationDaOImpl();

        try {
            pageModel= new PageModel<>(1, inventorySpecificationDAO.getTotalRecord(whereName, whereValue), 8);
            pageModel.setWhereName(whereName);
            pageModel.setWhereValue(whereValue);
            pageModel.setList(inventorySpecificationDAO.getPageList(whereName,whereValue,pageModel.getIndex(),pageModel.getPageSize()));
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
    public ModelAndView addInventorySpecification(String commodityModel,String Specification,int number) throws Exception {


        CommodityDAO commodityDAO = new CommodityDAOImpl();
        InventorySpecificationDAO inventorySpecificationDAO = new InventorySpecificationDaOImpl();
        String name = "model";
        int idcommodity = commodityDAO.getId(name,commodityModel);
        inventorySpecificationDAO.addInventorySpecification(idcommodity,Specification,number);

        // TODO: 剩下部分留个todo给我，赵奇
        return null;
    }
}
