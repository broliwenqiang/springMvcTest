package com.lee.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wenqili on 9/11/17.
 */
@Controller
@RequestMapping("/test")
public class Test {
    @RequestMapping("/testMethod")
    public String testMethod(ModelMap mm){
        mm.addAttribute("testString","just for test String");
        return "test";
    }
}
