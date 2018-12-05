package controller;

import dao.CommodityDAO;
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
     *
     * 通过某一个属性(商品的型号)来查询产品，若属性值为空则查询全部库存。
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
}
