package cn.ims.controller;

import cn.ims.ims.demo.entity.po.OrderInfo;
import cn.ims.ims.demo.service.InformService;
import com.sun.tools.internal.ws.processor.model.Model;
import javafx.animation.Animation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

public class InformController {
    @Autowired
    private InformService informService;
    private OrderInfo orderInfo;


    //查询入职人员
    @RequestMapping("/selectOrder.do")
    public String selectOrder(Map map, @RequestParam("id")String id){
        System.out.print("id是："+id);
        String id1=id.substring(0,id.indexOf("?"));
        System.out.print("id1是："+id1);
        List<OrderInfo> list= informService.selectOrder(id1);
        map.put("x",id1);
        map.put("list",list);
        return "inform";
    }

    /**
     * 拒绝入职
     *
     * @param id
     * @return
     */
    @RequestMapping("/refuseInform")
    @ResponseBody
    public String refuse(@RequestParam long id) {
        if (informService.refuse(id)) {
            return "success";
        }
        return "fail";
    }



    /**
     * 准备入职
     *
     * @param
     * @return
     */
    @RequestMapping("/prepareInform")
    @ResponseBody
    public String prepare( int id) {
        if (informService.prepare(id)) {
            return "success";
        }
        return "fail";
    }



}
