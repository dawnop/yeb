package com.dawnop.server.controller;

import com.dawnop.server.pojo.MailParam;
import com.dawnop.server.pojo.RespBean;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMailController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostMapping
    public RespBean sendMail(@RequestBody MailParam mailParam) {
        rabbitTemplate.convertAndSend("mail.hello", mailParam);
        return RespBean.success("发送成功");
    }
}
