package controller;

import model.Order;
import model.PageModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

@Controller
public class OrderController {

    /**
     * @param whereName 属性名
     * @param whereValue 属性值
     * */
    @RequestMapping("/queryOrder")
    public ModelAndView queryOrder(String whereName, String whereValue){
        ModelAndView modelAndView=new ModelAndView();
        PageModel<Order> pageModel;

        if (null==whereValue||"".equals(whereValue)){
            whereValue="%";
        }




        return modelAndView;
    }
}
