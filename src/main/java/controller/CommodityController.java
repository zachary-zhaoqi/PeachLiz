package controller;

import model.Commodity;
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
        //todo：上传图片的问题
        try {
            //处理字符串乱码问题
            commodityAttribute= new String(commodityAttribute.getBytes("ISO8859-1"), StandardCharsets.UTF_8);
            commodityAttributeDetails= new String(commodityAttributeDetails.getBytes("ISO8859-1"), StandardCharsets.UTF_8);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
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
        ModelAndView modelAndView=new ModelAndView("commodity/manage","commodityList",commodityList);
        return modelAndView;
    }

    @RequestMapping("/addCommodity")
    public ModelAndView addCommodity(Commodity commodity){
        //todo：上传图片的问题

        return new ModelAndView();
    }

    @RequestMapping("/editCommodity")
    public ModelAndView editCommodity(String category,String model,String picture,String color,
                                     String topfabric,String underfabric,String factoryprice,
                                     String retailprice,String remark,String status){
        //todo：上传图片的问题
        try {
            //处理字符串乱码问题
            category= new String(category.getBytes("ISO8859-1"), StandardCharsets.UTF_8);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return new ModelAndView();
    }

    /**
     * @param idcommodity 商品数据库id
     * 将该商品设置为冻结状态。
     * */
    @RequestMapping("/removeCommodity")
    public ModelAndView removeCommodity(int idcommodity){
        //todo：赵奇

        return new ModelAndView();
    }

}
