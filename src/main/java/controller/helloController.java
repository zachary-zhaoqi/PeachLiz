package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class helloController {
    @RequestMapping("/")
    public ModelAndView result(){
        return new ModelAndView("index");
    }
}
