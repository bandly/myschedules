package com.xuhe.myschedules;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/measure")
public class MeasureColumnController {

    @RequestMapping("/measure_list")
    public String helloHtml(Map<String, Object> map) {

        map.put("hello", "from TemplateController.helloHtml");
        return "/measure_list";
    }
}
