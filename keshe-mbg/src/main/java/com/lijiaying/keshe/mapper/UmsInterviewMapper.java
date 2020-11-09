package com.qingmeng.qiuzhidi.mapper;

import com.qingmeng.qiuzhidi.model.UmsInterview;
import com.qingmeng.qiuzhidi.model.UmsInterviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsInterviewMapper {
    long countByExample(UmsInterviewExample example);

    int deleteByExample(UmsInterviewExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsInterview record);

    int insertSelective(UmsInterview record);

    List<UmsInterview> selectByExample(UmsInterviewExample example);

    UmsInterview selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsInterview record, @Param("example") UmsInterviewExample example);

    int updateByExample(@Param("record") UmsInterview record, @Param("example") UmsInterviewExample example);

    int updateByPrimaryKeySelective(UmsInterview record);

    int updateByPrimaryKey(UmsInterview record);
}