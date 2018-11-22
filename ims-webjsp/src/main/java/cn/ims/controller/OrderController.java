package cn.ims.controller;

import cn.ims.ims.demo.entity.po.OrderInfo;
import cn.ims.ims.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 预约
     *
     * @param orderInfo
     * @return
     */
    @RequestMapping("/orderInterview")
    @ResponseBody
    public String order(OrderInfo orderInfo) {
        System.out.print(orderInfo.getOrder_email() + "--" + orderInfo.getOrder_username() + orderInfo.getOrder_time());
        if (orderService.order(orderInfo)) {
            return "success";
        }
        return "fail";
    }

    /**
     * 取消预约
     *
     * @param id
     * @return
     */
    @RequestMapping("/cancelOrder")
    @ResponseBody
    public String order(@RequestParam long id) {
        if (orderService.cancelOrder(id)) {
            return "success";
        }
        return "fail";
    }

    //查询所有预约
    @RequestMapping("/selectOrder")
    public String selectOrder(Model model, @RequestParam("id") String id) {
        System.out.print("id是：" + id);
        String id1 = id.substring(0, id.indexOf("?"));
        System.out.print("id1是：" + id1);
        int i = Integer.parseInt(id1);
        List<OrderInfo> list = orderService.selectOrder(i);
        model.addAttribute("k", i);
        model.addAttribute("list", list);
        return "order";
    }
}
