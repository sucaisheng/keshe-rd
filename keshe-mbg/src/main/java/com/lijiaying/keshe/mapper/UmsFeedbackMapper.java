package com.qingmeng.qiuzhidi.mapper;

import com.qingmeng.qiuzhidi.model.UmsFeedback;
import com.qingmeng.qiuzhidi.model.UmsFeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsFeedbackMapper {
    long countByExample(UmsFeedbackExample example);

    int deleteByExample(UmsFeedbackExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsFeedback record);

    int insertSelective(UmsFeedback record);

    List<UmsFeedback> selectByExampleWithBLOBs(UmsFeedbackExample example);

    List<UmsFeedback> selectByExample(UmsFeedbackExample example);

    UmsFeedback selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsFeedback record, @Param("example") UmsFeedbackExample example);

    int updateByExampleWithBLOBs(@Param("record") UmsFeedback record, @Param("example") UmsFeedbackExample example);

    int updateByExample(@Param("record") UmsFeedback record, @Param("example") UmsFeedbackExample example);

    int updateByPrimaryKeySelective(UmsFeedback record);

    int updateByPrimaryKeyWithBLOBs(UmsFeedback record);

    int updateByPrimaryKey(UmsFeedback record);
}