package controller;

import dao.CommodityDAO;
import dao.impl.CommodityDAOImpl;
import model.Commodity;
import model.PageModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;

@Controller
public class CommodityController {
    /**
     * @param commodityAttribute 属性名
     * @param commodityAttributeDetails 属性值
     *
     * 通过某一个属性来查询产品，若属性值为空则查询全部产品。
     * */
    @RequestMapping("/queryCommodity")
    public ModelAndView queryCommodity(String commodityAttribute,String commodityAttributeDetails){

        ModelAndView modelAndView=new ModelAndView();

        try {
            //处理字符串乱码问题
            commodityAttribute= new String(commodityAttribute.getBytes("ISO8859-1"), StandardCharsets.UTF_8);
            commodityAttributeDetails= new String(commodityAttributeDetails.getBytes("ISO8859-1"), StandardCharsets.UTF_8);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

       if (null==commodityAttributeDetails||"".equals(commodityAttributeDetails)){
            commodityAttributeDetails="%";
        }

        //todo 条件筛选
        CommodityDAO commodityDAO=new CommodityDAOImpl();

        PageModel<Commodity> pageModel;


        try {pageModel= new PageModel<>(1, commodityDAO.getTotalRecord(commodityAttribute, commodityAttributeDetails), 8);
            pageModel.setWhereName(new String[]{commodityAttribute});
            pageModel.setWhereValue(new String[]{commodityAttributeDetails});
            pageModel.setList(commodityDAO.getCommityPageList(commodityAttribute,commodityAttributeDetails,pageModel.getIndex(),pageModel.getPageSize()));
            modelAndView.setViewName("commodity/manage");
            modelAndView.addObject("PageModel",pageModel);
        } catch (Exception e) {
            e.printStackTrace();
            modelAndView.setViewName("error");
            modelAndView.addObject("errormessage",e.getMessage());
        }

        return modelAndView;
    }

    @RequestMapping("/updatePageList")
    public ModelAndView updatePageList(int pageNumber,int totalRecord,int pageSize){
        CommodityDAO commodityDAO = new CommodityDAOImpl();
        PageModel<Commodity> pageModel;
        ModelAndView modelAndView=new ModelAndView();
        try {
            pageModel= new PageModel<>(pageNumber, totalRecord, pageSize);
            pageModel.setList(commodityDAO.getCommityPageList(pageModel.getWhereName()[0], pageModel.getWhereValue()[0], pageModel.getIndex(),pageModel.getPageSize()));
            modelAndView.setViewName("commodity/manage");
            modelAndView.addObject("PageModel",pageModel);
        } catch (Exception e) {
            e.printStackTrace();
            modelAndView.setViewName("error");
            modelAndView.addObject("errormessage",e.getMessage());
        }

        return modelAndView;
    }

    @RequestMapping("/addCommodity")
    public ModelAndView addCommodity(Commodity commodity) throws SQLException {
        //todo：上传图片的问题
        //todo:添加数据

        ModelAndView modelAndView=new ModelAndView();
        CommodityDAO commodityDAO=new CommodityDAOImpl();
        try {
            commodityDAO.addCommodity(commodity);
        } catch (SQLException e) {
            e.printStackTrace();
            modelAndView.setViewName("error");
            modelAndView.addObject("errormessage",e.getMessage());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return new ModelAndView();
    }

    @RequestMapping("/editCommodity")
    public ModelAndView editCommodity(Commodity commodity){

        ModelAndView modelAndView=new ModelAndView();
        try {
//            //处理字符串乱码问题
//            commodity.setCategory(new String(commodity.getCategory().getBytes("ISO8859-1"), StandardCharsets.UTF_8));
            CommodityDAO commodityDAO = new CommodityDAOImpl();
            commodityDAO.editCommodity(commodity);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            modelAndView.setViewName("error");
            modelAndView.addObject("errormessage",e.getMessage());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new ModelAndView();
    }

    public String turnString(String s) throws UnsupportedEncodingException {
        s=new String(s.getBytes("ISO8859-1"), StandardCharsets.UTF_8);
        return s;
    }
    /**
     * @param idcommodity 商品数据库id
     * 将该商品设置为冻结状态。
     * */
    @RequestMapping("/removeCommodity")
    public ModelAndView removeCommodity(int idcommodity) throws SQLException {
        //todo：赵奇
        ModelAndView modelAndView=new ModelAndView();
        CommodityDAO commodityDAO = new CommodityDAOImpl();
        try {
            commodityDAO.removeCommodity(idcommodity);
        } catch (SQLException e) {
            e.printStackTrace();
            modelAndView.setViewName("error");
            modelAndView.addObject("errormessage",e.getMessage());
        }
        return new ModelAndView();
    }

}
