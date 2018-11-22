package cn.ims.controller;

import cn.ims.ims.demo.entity.po.UserInfo;
import cn.ims.ims.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author:mjt
 * @Description:超级管理员controller
 */
@Controller
public class AdminController {
    @Autowired
    private UserService userService;
    /**
     *进入添加用户页面
     * @return
     */
    @RequestMapping("/insertuser")
    public String insertPage(HttpSession session){
//        int power=(int)session.getAttribute("power");
//        if (power==3)
//            return "insertuser";
//        else{
//            return "404";
//        }
        return "insertuser";
    }
    /**
     *添加用户
     */
    @RequestMapping("/insert")
    @ResponseBody
    public String insertUser(@RequestParam (value="username") String username,@RequestParam(value="password")String password,@RequestParam(value="power")int power)throws ParseException {
        UserInfo userInfo=new UserInfo();
        userInfo.setUsername(username);
        userInfo.setPassword(password);
        userInfo.setPower(power);
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String createTime = format.format(date);
        Date create_time = format.parse(createTime);
        Date update_time = format.parse(createTime);
        userInfo.setCreate_time(create_time);
        userInfo.setUpdate_time(update_time);
        int flag=userService.addUser(userInfo);
        if(flag>=1)
            return "success";
        else
            return "failed";
    }

    /**
     * 查询所有用户
     * @return
     */
    @RequestMapping("/userlist")
    public ModelAndView selectUserList(){
        List<UserInfo> userList=userService.findAllUser();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("userList",userList);
        modelAndView.setViewName("usermanager");
        return modelAndView;
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @RequestMapping("/delete")
    @ResponseBody
    public String deleteUser(@RequestParam Integer id){
        int flag=userService.deleteUserById(id);
        if(flag>=1)
            return "success";
        else
            return "failed";
    }

    /**
     * 进入更新页面
     * @param id
     * @return
     */
    @RequestMapping("/updateUser")
    public ModelAndView updatePage(@RequestParam Integer id){
        UserInfo userInfo=userService.findUserById(id);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("userInfo",userInfo);
        modelAndView.setViewName("updateuser");
        return modelAndView;
    }

    /**
     * 更新用户信息
     * @param
     * @return
     */
    @RequestMapping("/update")
    @ResponseBody
    public String updateUser(@RequestParam(value="id")long id,@RequestParam (value="username") String username,@RequestParam(value="password")String password,@RequestParam(value="power")int power)throws ParseException {
        UserInfo userInfo=new UserInfo();
        userInfo.setId(id);
        userInfo.setUsername(username);
        userInfo.setPassword(password);
        userInfo.setPower(power);
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String updateTime = format.format(date);
        Date update_time = format.parse(updateTime);
        userInfo.setUpdate_time(update_time);
        int flag=userService.updateUser(userInfo);
        if(flag>=1)
            return "success";
        else
            return "failed";
    }
}
