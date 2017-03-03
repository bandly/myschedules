package com.amugua.data.conf.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("track/bd")
public class TrackBuriedPointEventController {

    @RequestMapping("/event_list")
    public String buriedPointIdList(Map<String, Object> map) {
        map.put("hello", "from TemplateController.helloHtml");
        return "/track/bd/event_list";
    }
}
