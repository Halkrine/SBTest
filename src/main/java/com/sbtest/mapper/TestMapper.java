package com.sbtest.mapper;

import com.sbtest.dto.TestDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface TestMapper {
    public List<TestDto> getList();
}
