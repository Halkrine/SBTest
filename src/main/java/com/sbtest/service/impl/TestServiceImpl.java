package com.sbtest.service.impl;

import com.sbtest.dto.TestDto;
import com.sbtest.mapper.TestMapper;
import com.sbtest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService {


    @Autowired
    TestMapper mapper;

    public List<TestDto> getList(){
        List<TestDto> rtnList = mapper.getList();

        return rtnList;
    }
}
