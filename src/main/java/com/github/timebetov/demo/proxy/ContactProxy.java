package com.github.timebetov.demo.proxy;

import com.github.timebetov.demo.config.ProjectConfig;
import com.github.timebetov.demo.model.Contact;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "contact", url = "http://localhost:8080/api/contact",
configuration = ProjectConfig.class)
public interface ContactProxy {

    @RequestMapping(method = RequestMethod.GET, value = "/getMessagesByStatus")
    @Headers(value = "Content-Type: application/json")
    List<Contact> getMessagesByStatus(@RequestParam("status") String status);
}
