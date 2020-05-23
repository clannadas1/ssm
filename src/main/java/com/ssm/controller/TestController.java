package com.ssm.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * description
 *
 * @author TK-CL 2020/04/19 21:15
 */
@Controller
@RequestMapping("/test")
public class TestController {

    private static Logger logger = Logger.getLogger(TestController.class);
    @RequestMapping("/exmp")
    public String test() {

        System.out.println("测试");
        logger.error("测试logger");
        return "test";
    }





}
