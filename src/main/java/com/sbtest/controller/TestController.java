package com.sbtest.controller;

import com.sbtest.dto.TestDto;
import com.sbtest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping(value="/api/test")
    public String getTest(){
        return "test";
    }

    @GetMapping(value="/api/getList")
    public String getList(){
        List<TestDto> dto = (List<TestDto>) testService.getList();

        return dto.toString();
    }

}
