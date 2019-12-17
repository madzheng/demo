package com.tooltest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: pengjun
 * @Date: 2019/12/16 20:30
 * @Description: TODO
 **/
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String toIndex(){
        return "/welcome";
    }

    @RequestMapping("/secondPage")
    public String toHello(){
        return "/hello";
    }

}
