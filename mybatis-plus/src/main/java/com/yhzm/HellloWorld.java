package com.yhzm;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellloWorld {


    @ResponseBody
    @RequestMapping("/helloWorld")
    public String hello() {
        return "helloWorld";
    }
}
