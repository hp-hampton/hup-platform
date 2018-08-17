package com.hup.platform.mail.client;

import com.hup.platform.mail.model.MailRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "platform-mail")
@RequestMapping(value = "/mail")
public interface MailClient {

    @PostMapping
    void sendMail(@RequestBody MailRequest.MailContent mailContent);
}
