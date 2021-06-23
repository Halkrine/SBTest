package com.sbtest.service.impl;

import com.sbtest.dto.TestDto;
import com.sbtest.mapper.TestMapper;
import com.sbtest.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService {
    private final Logger log = LoggerFactory.getLogger(TestServiceImpl.class);

    @Autowired
    TestMapper mapper;

    public List<TestDto> getList(){
        List<TestDto> rtnList = mapper.getList();
        log.info("info TEST");
        log.debug("debug TEST");
        log.debug(rtnList.toString());
        return rtnList;
    }
}
