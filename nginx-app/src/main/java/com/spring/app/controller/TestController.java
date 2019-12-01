package com.spring.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * @author xuweizhi
 * @since 2019/12/01 13:46
 */
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("/index")
    public String testIndex() {
        return "app";
    }
}
