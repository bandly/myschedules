package com.xuhe.myschedules;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TemplateController {
    @RequestMapping("/hello")
    public String helloHtml(Map<String, Object> map) {

        map.put("hello", "from TemplateController.helloHtml");
        return "/hello";
    }
}
