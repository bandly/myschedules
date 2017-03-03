package com.xuhe.myschedules;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/schedules/web")
public class WebSchedulesController {

    @RequestMapping("/index")
    @ResponseBody
    public String test(HttpServletRequest req) {
        System.out.println("ksldfkjsld");
        return null;
    }
}
