package com.qingmeng.qiuzhidi.mapper;

import com.qingmeng.qiuzhidi.model.UmsRecruitResumeRelation;
import com.qingmeng.qiuzhidi.model.UmsRecruitResumeRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;





public interface UmsRecruitResumeRelationMapper {
    Integer getTypeByRecruitIdAndResumeId(@Param("recruitId") Long recruit_id, @Param("resumeId") Long resume_id);

    long countByExample(UmsRecruitResumeRelationExample example);

    int deleteByExample(UmsRecruitResumeRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsRecruitResumeRelation record);

    int insertSelective(UmsRecruitResumeRelation record);

    List<UmsRecruitResumeRelation> selectByExample(UmsRecruitResumeRelationExample example);

    UmsRecruitResumeRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsRecruitResumeRelation record, @Param("example") UmsRecruitResumeRelationExample example);

    int updateByExample(@Param("record") UmsRecruitResumeRelation record, @Param("example") UmsRecruitResumeRelationExample example);

    int updateByPrimaryKeySelective(UmsRecruitResumeRelation record);

    int updateByPrimaryKey(UmsRecruitResumeRelation record);
}
