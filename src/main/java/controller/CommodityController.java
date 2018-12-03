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
import java.util.ArrayList;
import java.util.List;

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
<<<<<<< HEAD
        List<Commodity> commodityList = getCommodities();
        ModelAndView modelAndView=new ModelAndView("commodity/manage","commodityList",commodityList);
        return modelAndView;
    }

    private List<Commodity> getCommodities() {
        List<Commodity> commodityList = new ArrayList<>();
        Commodity commodity = new Commodity();
        int idcommodity = 1;
        String category = "category";
        String model ="model";
        String picture="/assets/commoditypic/1.jpg";
        String color="color";
        String topfabric="topfabric";
        String underfabric="underfabric";
        double factoryprice =0.1;
        double retailprice =0.2;
        String remark = "remark";
        String status ="status";

        for (int i = 0;i<100;i++)
        {
            commodity.setIdcommodity(i+idcommodity);
            commodity.setCategory(category+i);
            commodity.setModel(model+i);
            commodity.setPicture(picture);
            commodity.setColor(color+i);
            commodity.setTopfabric(topfabric+i);
            commodity.setUnderfabric(underfabric+i);
            commodity.setFactoryprice(factoryprice+i);
            commodity.setRetailprice(retailprice+i);
            commodity.setRemark(remark+i);
            commodity.setStatus(status+i);

            commodityList.add(commodity);
        }
        return commodityList;
    }

=======

        CommodityDAO commodityDAO=new CommodityDAOImpl();

        PageModel<Commodity> pageModel=null;

        try {
            pageModel=new PageModel<Commodity>(1,commodityDAO.getTotalRecord(),8);
            pageModel.setList(commodityDAO.getCommityPageList(pageModel.getIndex(),pageModel.getPageSize()));
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
        PageModel<Commodity> pageModel=null;
        ModelAndView modelAndView=new ModelAndView();
        try {
            pageModel=new PageModel<Commodity>(pageNumber,totalRecord,pageSize);
            pageModel.setList(commodityDAO.getCommityPageList(pageModel.getIndex(),pageModel.getPageSize()));
            modelAndView.setViewName("commodity/manage");
            modelAndView.addObject("PageModel",pageModel);
        } catch (Exception e) {
            e.printStackTrace();
            modelAndView.setViewName("error");
            modelAndView.addObject("errormessage",e.getMessage());
        }

        return new ModelAndView();
    }
    
>>>>>>> ae91ac1de2f998ff3f8657b6ea6f1024208eeb35
    @RequestMapping("/addCommodity")
    public ModelAndView addCommodity(Commodity commodity){
        //todo：上传图片的问题
        //todo:添加数据

        CommodityDAO commodityDAO=new CommodityDAOImpl();
        commodityDAO.addCommodity(commodity);

        return new ModelAndView();
    }

    @RequestMapping("/editCommodity")
    public ModelAndView editCommodity(Commodity commodity){
        //todo：上传图片的问题
        try {
<<<<<<< HEAD
            CommodityDAO commodityDAO = new CommodityDAOImpl();
            commodityDAO.editCommodity(commodity);
=======
            //处理字符串乱码问题
            commodity.setCategory(new String(commodity.getCategory().getBytes("ISO8859-1"), StandardCharsets.UTF_8));
>>>>>>> ae91ac1de2f998ff3f8657b6ea6f1024208eeb35
        } catch (UnsupportedEncodingException e) {
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
    public ModelAndView removeCommodity(int idcommodity){
        //todo：赵奇
        CommodityDAO commodityDAO = new CommodityDAOImpl();
        commodityDAO.removeCommodity(idcommodity);
        return new ModelAndView();
    }

}
