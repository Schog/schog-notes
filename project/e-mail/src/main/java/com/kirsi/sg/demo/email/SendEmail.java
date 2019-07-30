package com.kirsi.sg.demo.email;

import lombok.Data;
import org.apache.commons.mail.HtmlEmail;

import java.util.Random;

/**
 * 邮件发送
 * @author schog
 * @since 2019-07-30
 */
public class SendEmail {

    public static void main(String[] args) {
        EmailConfig config = new EmailConfig();
        SendEmail sendEmail = new SendEmail();
        User user = new User();
        sendEmail.sendMail(config,user);
    }

    public void sendMail(EmailConfig config,User user){
        //模拟验证码生成
        Random random = new Random();
        int code = random.nextInt(10000);
        //模拟验证码存入redis
        System.out.println(code);
        try{
            HtmlEmail email = new HtmlEmail();
            //邮箱的SMTP服务器
            email.setHostName(config.getHostName());
            //设置发送端口号
            email.setSmtpPort(config.getPort());
            //发送字符类型
            email.setCharset(config.getCharset());
            //收件人
            email.addTo(user.getToEmailName());
            //发送人的邮箱和用户名
            email.setFrom(config.getFromEmailName(),config.getFromName());
            //发送人的用户名和密码
            email.setAuthentication(config.getFromEmailName(),config.getFromEmailPassword());
            //发送主题
            email.setSubject(user.getTopic());
            //具体信息
            email.setMsg(user.getMessage());
            //开启加密
            email.setStartTLSEnabled(config.isStartTls());
            email.send();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

@Data
class EmailConfig{
    //邮箱的SMTP服务器
    String hostName;
    //设置发送端口号
    int port;
    //发送字符类型
    String charset;
    //发件人名称
    String fromName;
    //发件人电子邮箱
    String fromEmailName;
    //发件人密码
    String fromEmailPassword;
    //是否开启验证
    boolean startTls;
}
@Data
class User{
    //收件人邮箱
    String toEmailName;
    //邮件标题
    String topic;
    //邮件内容
    String message;
}