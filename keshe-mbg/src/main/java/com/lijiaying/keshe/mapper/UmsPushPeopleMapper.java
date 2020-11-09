package com.qingmeng.qiuzhidi.mapper;

import com.qingmeng.qiuzhidi.model.UmsPushPeople;
import com.qingmeng.qiuzhidi.model.UmsPushPeopleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsPushPeopleMapper {
    long countByExample(UmsPushPeopleExample example);

    int deleteByExample(UmsPushPeopleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsPushPeople record);

    int insertSelective(UmsPushPeople record);

    List<UmsPushPeople> selectByExample(UmsPushPeopleExample example);

    UmsPushPeople selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsPushPeople record, @Param("example") UmsPushPeopleExample example);

    int updateByExample(@Param("record") UmsPushPeople record, @Param("example") UmsPushPeopleExample example);

    int updateByPrimaryKeySelective(UmsPushPeople record);

    int updateByPrimaryKey(UmsPushPeople record);
}