package com.sbtest.service;

import com.sbtest.dto.TestDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface TestService {

    public List<TestDto> getList();
}
