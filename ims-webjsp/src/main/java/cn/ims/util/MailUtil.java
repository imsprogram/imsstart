package cn.ims.util;

import org.springframework.stereotype.Component;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Component
public class MailUtil {

    public void sendMail(String deliver,String receiver,String carbonCopy ,String subject,String content) throws AddressException, MessagingException {
        /*** 1.得到Session ***/
        Properties props = new Properties();
        props.setProperty("mail.host", "smtp.qq.com");// 设置邮件服务器地址。qq邮箱服务器地址为smtp.qq.com
        props.setProperty("mail.smtp.auth", "true"); // 设置邮件服务器是否需要登录认证
        Authenticator auth = new Authenticator() { // 创建认证器
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("291685399", "aeinvhqntmykcaeh"); // 用户名和密码qq邮箱的用户名为qq号，密码为IMAP/SMTP服务授权码
            }
        };
        Session session = Session.getInstance(props, auth); // 获取Session对象

        /*** 2.创建邮件对象MimeMessage ***/
        MimeMessage msg = new MimeMessage(session); // 创建邮件对象
        msg.setFrom(new InternetAddress(deliver)); // 设置发件人的邮箱账号
        msg.addRecipient(MimeMessage.RecipientType.TO, new InternetAddress(receiver)); // 设置收件人的邮箱账号
        msg.addRecipient(MimeMessage.RecipientType.CC, new InternetAddress(carbonCopy)); // 设置收件人（抄送）
        msg.addRecipient(MimeMessage.RecipientType.BCC, new InternetAddress(carbonCopy));// 设置收件人（暗送）
        msg.setSubject(subject); // 设置发送的邮件的标题
        msg.setContent(content, "text/html;charset=utf-8"); // 指定邮件内容，以及内容的MIME类型

        /*** 3.发送邮件 ***/
        Transport.send(msg);
    }
}

