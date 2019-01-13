package com.pingan.devopsgaopan.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*

 */
@Api("高攀测试接口")
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @ApiOperation("高攀测试接口")
    @GetMapping("/gaopan")
    public String testDemo(){
        return "hello swagger!!";
    }

}
