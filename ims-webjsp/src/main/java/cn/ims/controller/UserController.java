package cn.ims.controller;

import cn.ims.ims.demo.entity.po.UserInfo;
import cn.ims.ims.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/loginController.do")
    public ModelAndView loginController(HttpServletRequest request) {
        //从请求中获取参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //调用service方法
        UserInfo userInfo = userService.login(username);

        //跳转页面
        ModelAndView modelAndView = new ModelAndView();
        if (password.equals(userInfo.getPassword())) {//登录成功
            //根据不同的权限跳转到不同的页面
//            if (userInfo.getPower() == 1) {
//                modelAndView.setViewName("register");//TODO 跳转hr页面
//                System.out.println("跳转到hr页面");
//            } else if (userInfo.getPower() == 2) {
//                modelAndView.setViewName("register");//TODO 跳转面试官页面
//                System.out.println("跳转到面试官页面");
//            } else if (userInfo.getPower() == 3) {
//                modelAndView.setViewName("register");//TODO 跳转超级管理员页面
//                System.out.println("跳转到超级管理员页面");
//            }
//            modelAndView.addObject("power", userInfo.getPower());

            modelAndView.setViewName("index");
            modelAndView.addObject("userInfo", userInfo);
            return modelAndView;
        } else {//登录失败
            modelAndView.setViewName("login");
            System.out.println("登录失败！！");
            return modelAndView;
        }
    }

//    @RequestMapping("/registerController.do")
//    public ModelAndView registerController(HttpServletRequest request) throws ParseException {
//        //从请求中获取参数
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        String power = request.getParameter("power");
//        Date date = new Date();
//        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String createTime = format.format(date);
////        Date create_time = new Date(createTime);
////        Date update_time = new Date(createTime);
//        Date create_time = format.parse(createTime);
//        Date update_time = format.parse(createTime);
//
//        //封装成UserInfo对象
//        UserInfo userInfo = new UserInfo();
//        userInfo.setUsername(username);
//        userInfo.setPassword(password);
//        userInfo.setPower(Integer.valueOf(power));
//        userInfo.setCreate_time(create_time);
//        userInfo.setUpdate_time(update_time);
//
//        //调用service方法
//        int temp = userService.register(userInfo);
//
//        //跳转页面
//        ModelAndView modelAndView = new ModelAndView();
//        if (temp >= 1) {//注册成功
//            modelAndView.setViewName("");//TODO 跳转到相应页面
//            modelAndView.addObject("userInfo", userInfo);//TODO 添加属性
//            return modelAndView;
//        } else {//注册失败
//            modelAndView.setViewName("register");
//            return modelAndView;
//        }
//    }

}
