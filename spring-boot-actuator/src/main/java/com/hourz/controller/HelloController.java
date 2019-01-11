package com.hourz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>测试Hello的接口</p>
 * @author hourz
 * @since 2019-01-11
 */
@RestController
public class HelloController {
	
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}