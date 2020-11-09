package com.qingmeng.qiuzhidi.mapper;

import com.qingmeng.qiuzhidi.model.UmsFeedbackType;
import com.qingmeng.qiuzhidi.model.UmsFeedbackTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsFeedbackTypeMapper {
    long countByExample(UmsFeedbackTypeExample example);

    int deleteByExample(UmsFeedbackTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UmsFeedbackType record);

    int insertSelective(UmsFeedbackType record);

    List<UmsFeedbackType> selectByExample(UmsFeedbackTypeExample example);

    UmsFeedbackType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UmsFeedbackType record, @Param("example") UmsFeedbackTypeExample example);

    int updateByExample(@Param("record") UmsFeedbackType record, @Param("example") UmsFeedbackTypeExample example);

    int updateByPrimaryKeySelective(UmsFeedbackType record);

    int updateByPrimaryKey(UmsFeedbackType record);
}