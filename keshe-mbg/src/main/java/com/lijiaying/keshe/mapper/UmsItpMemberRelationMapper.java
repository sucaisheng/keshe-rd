package com.qingmeng.qiuzhidi.mapper;

import com.qingmeng.qiuzhidi.model.UmsItpMemberRelation;
import com.qingmeng.qiuzhidi.model.UmsItpMemberRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsItpMemberRelationMapper {
    long countByExample(UmsItpMemberRelationExample example);

    int deleteByExample(UmsItpMemberRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsItpMemberRelation record);

    int insertSelective(UmsItpMemberRelation record);

    List<UmsItpMemberRelation> selectByExample(UmsItpMemberRelationExample example);

    UmsItpMemberRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsItpMemberRelation record, @Param("example") UmsItpMemberRelationExample example);

    int updateByExample(@Param("record") UmsItpMemberRelation record, @Param("example") UmsItpMemberRelationExample example);

    int updateByPrimaryKeySelective(UmsItpMemberRelation record);

    int updateByPrimaryKey(UmsItpMemberRelation record);
}