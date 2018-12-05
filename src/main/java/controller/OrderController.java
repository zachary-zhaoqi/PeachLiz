package controller;

import dao.InventorySpecificationDAO;
import dao.impl.InventorySpecificationDaOImpl;
import model.InventorySpecification;
import model.Order;
import model.PageModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class OrderController {

    /**
     * @param whereName 属性名
     * @param whereValue 属性值
     * */
    @RequestMapping("/queryOrder")
    public ModelAndView queryOrder(String whereName, String whereValue){
        ModelAndView modelAndView=new ModelAndView();
        PageModel<Order> pageModel;

        try {
            //处理字符串乱码问题
            whereName= new String(whereName.getBytes("ISO8859-1"), StandardCharsets.UTF_8);
            whereValue= new String(whereValue.getBytes("ISO8859-1"), StandardCharsets.UTF_8);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        // TODO: 2018/12/5 陈亮 类似C:\Users\starr\workspace\PeachLiz\src\main\java\controller\InventoryController.java 中的queryInventory

        return modelAndView;
    }
}
