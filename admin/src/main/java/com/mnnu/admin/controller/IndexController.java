package com.mnnu.admin.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/demo")
@AllArgsConstructor
@Api(tags = "范例控制器")
public class IndexController {

    @GetMapping("/index")
    @ApiOperation("测试")
    public String test() {
        return "hello";
    }
}

