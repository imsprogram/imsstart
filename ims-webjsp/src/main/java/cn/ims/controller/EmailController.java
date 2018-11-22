package cn.ims.controller;

import cn.ims.ims.demo.entity.po.OrderInfo;
import cn.ims.ims.demo.service.OrderService;
import cn.ims.util.MailUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;


@RestController
public class EmailController {
    @Autowired
    private OrderService orderService;
    @RequestMapping("/sendEmail")
    @ResponseBody
    public String sendEmail(OrderInfo orderInfo) throws JsonProcessingException, MessagingException {
        System.out.print(orderInfo.getOrder_time()+"--"+orderInfo.getOrder_email()+orderInfo.getOrder_username());
        //发送邮件
        MailUtil mailUtil=new MailUtil();
        String deliver = "291685399@qq.com";
        String carbonCopy = "1209109647@qq.com";
        String subject = "面试邀请";
        String content = orderInfo.getOrder_username()+"您好，我公司国网商旅事业部人力资源收到您的简历，感谢您对我们公司的信任和选择。经过人力资源部初步筛选，因此正式通知您于"+orderInfo.getOrder_time()+"来我公司面试";
        mailUtil.sendMail(deliver,orderInfo.getOrder_email(),carbonCopy,subject,content);
        //将信息插入数据库
        if (orderService.order(orderInfo)){
            return "success";
        }
        return "fail";
    }
}

