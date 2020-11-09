package com.qingmeng.qiuzhidi.mapper;

import com.qingmeng.qiuzhidi.model.UmsInterpolate;
import com.qingmeng.qiuzhidi.model.UmsInterpolateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsInterpolateMapper {
    long countByExample(UmsInterpolateExample example);

    int deleteByExample(UmsInterpolateExample example);

    int deleteByPrimaryKey(Long interpolateId);

    int insert(UmsInterpolate record);

    int insertSelective(UmsInterpolate record);

    List<UmsInterpolate> selectByExample(UmsInterpolateExample example);

    UmsInterpolate selectByPrimaryKey(Long interpolateId);

    int updateByExampleSelective(@Param("record") UmsInterpolate record, @Param("example") UmsInterpolateExample example);

    int updateByExample(@Param("record") UmsInterpolate record, @Param("example") UmsInterpolateExample example);

    int updateByPrimaryKeySelective(UmsInterpolate record);

    int updateByPrimaryKey(UmsInterpolate record);
}