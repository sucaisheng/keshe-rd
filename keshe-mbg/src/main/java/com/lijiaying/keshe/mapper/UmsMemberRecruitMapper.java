package com.qingmeng.qiuzhidi.mapper;

import com.qingmeng.qiuzhidi.model.UmsMemberRecruit;
import com.qingmeng.qiuzhidi.model.UmsMemberRecruitExample;

import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberRecruitMapper {
    long countByExample(UmsMemberRecruitExample example);

    int deleteByExample(UmsMemberRecruitExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberRecruit record);

    int insertSelective(UmsMemberRecruit record);

    List<UmsMemberRecruit> selectByExample(UmsMemberRecruitExample example);

    UmsMemberRecruit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMemberRecruit record, @Param("example") UmsMemberRecruitExample example);

    int updateByExample(@Param("record") UmsMemberRecruit record, @Param("example") UmsMemberRecruitExample example);

    int updateByPrimaryKeySelective(UmsMemberRecruit record);

    int updateByPrimaryKey(UmsMemberRecruit record);

    ArrayList<Long> selectRecruitIdByMemberId(Long memberId);

    ArrayList<Long> selectRecruitIdByResumeIdAndStatus(@Param("status") Integer status,@Param("resumeId") Long resumeId);

}
