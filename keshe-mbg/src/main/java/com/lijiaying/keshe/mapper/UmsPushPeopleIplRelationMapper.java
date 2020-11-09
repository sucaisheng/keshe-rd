package com.qingmeng.qiuzhidi.mapper;

import com.qingmeng.qiuzhidi.model.UmsPushPeopleIplRelation;
import com.qingmeng.qiuzhidi.model.UmsPushPeopleIplRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsPushPeopleIplRelationMapper {
    long countByExample(UmsPushPeopleIplRelationExample example);

    int deleteByExample(UmsPushPeopleIplRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UmsPushPeopleIplRelation record);

    int insertSelective(UmsPushPeopleIplRelation record);

    List<UmsPushPeopleIplRelation> selectByExample(UmsPushPeopleIplRelationExample example);

    UmsPushPeopleIplRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UmsPushPeopleIplRelation record, @Param("example") UmsPushPeopleIplRelationExample example);

    int updateByExample(@Param("record") UmsPushPeopleIplRelation record, @Param("example") UmsPushPeopleIplRelationExample example);

    int updateByPrimaryKeySelective(UmsPushPeopleIplRelation record);

    int updateByPrimaryKey(UmsPushPeopleIplRelation record);
}