package cn.ims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("/index");
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/")
    public String demo() {
        return "index";
    }
}
