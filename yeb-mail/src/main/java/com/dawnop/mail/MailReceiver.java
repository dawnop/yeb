package com.dawnop.mail;

import com.dawnop.server.pojo.MailParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.Date;


@Component
public class MailReceiver {

    private static final Logger LOGGER = LoggerFactory.getLogger(MailReceiver.class);

    @Autowired
    private JavaMailSender javaMailSender;
    @Autowired
    private MailProperties mailProperties;
    @Autowired
    private TemplateEngine templateEngine;

    @RabbitListener(queues = "mail.hello")
    public void handler(MailParam mailParam) {
        MimeMessage msg = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(msg);
        try {
            // 发件人
            helper.setFrom(mailProperties.getUsername());
            // 收件人
            helper.setTo(mailParam.getMailAddress());
            // 主题
            helper.setSubject("Hello");
            // 日期
            helper.setSentDate(new Date());

            // 给 thymeleaf 模板设置参数
            Context context = new Context();
            context.setVariable("nickname", mailParam.getNickname());
            context.setVariable("content", mailParam.getContent());
            String mail = templateEngine.process("mail", context);
            // 设置内容
            helper.setText(mail, true);
            // 发送邮件
            javaMailSender.send(msg);
        } catch (MessagingException e) {
            LOGGER.error("邮件发送失败=========>{}", e.getMessage());
        }
    }

}
