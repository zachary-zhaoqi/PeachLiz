package controller;

import dao.CommodityDAO;
import dao.PageModelDAO;
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
     * @param whereName 属性名
     * @param whereValue 属性值
     *
     * 通过某一个属性来查询产品，若属性值为空则查询全部产品。
     * */
    @RequestMapping("/queryCommodity")
    public ModelAndView queryCommodity(String whereName,String whereValue){

        ModelAndView modelAndView=new ModelAndView();
        PageModel<Commodity> pageModel;
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

        PageModelDAO pageModelDAO=new CommodityDAOImpl();


        try {
            pageModel= new PageModel<>(1, pageModelDAO.getTotalRecord(whereName, whereValue), 8);
            pageModel.setWhereName(whereName);
            pageModel.setWhereValue(whereValue);
            pageModel.setList(pageModelDAO.getPageList(whereName,whereValue,pageModel.getIndex(),pageModel.getPageSize()));
            modelAndView.setViewName("commodity/manage");
            modelAndView.addObject("PageModel",pageModel);
        } catch (Exception e) {
            e.printStackTrace();
            modelAndView.setViewName("error");
            modelAndView.addObject("errormessage",e.getMessage());
        }

        return modelAndView;
    }

    @RequestMapping("/updateCommodityPageList")
    public ModelAndView updatePageList(int pageNumber,int totalRecord,int pageSize,String commodityAttribute,String commodityAttributeDetails){
        PageModelDAO pageModelDAO = new CommodityDAOImpl();
        PageModel<Commodity> pageModel;
        ModelAndView modelAndView=new ModelAndView();
        if (null==commodityAttributeDetails||"".equals(commodityAttributeDetails)){
            commodityAttributeDetails="%";
        }
        try {
            pageModel= new PageModel<>(pageNumber, totalRecord, pageSize);
            pageModel.setWhereName(commodityAttribute);
            pageModel.setWhereValue(commodityAttributeDetails);
            pageModel.setList(pageModelDAO.getPageList(pageModel.getWhereName(), pageModel.getWhereValue(), pageModel.getIndex(),pageModel.getPageSize()));
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
        //todo：陈亮 在这里处理中文乱码问题 例子如下
//        try {
//            //处理字符串乱码问题
//            whereName= new String(whereName.getBytes("ISO8859-1"), StandardCharsets.UTF_8);
//            whereValue= new String(whereValue.getBytes("ISO8859-1"), StandardCharsets.UTF_8);
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }


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
