package cn.ims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class pageController {

    @RequestMapping("/login.do")
    public ModelAndView login() {
        ModelAndView model = new ModelAndView();
        model.setViewName("login");
        return model;
    }

//    @RequestMapping("/register.do")
//    public String register() {
//        return "register";
//    }

    @RequestMapping("/index.do")
    public String index() {
        return "index";
    }

    @RequestMapping("/index_v2.do")
    public String index_v2() {
        return "index_v2";
    }

    @RequestMapping("/uploadresume.do")
    public String uploadresume() {
        return "uploadresume";
    }

    @RequestMapping("/resume_detail")
    public String resume_detail() {
        return "resume_detail";
    }

}
