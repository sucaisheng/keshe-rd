package com.qingmeng.qiuzhidi.mapper;

import com.qingmeng.qiuzhidi.model.UmsResume;
import com.qingmeng.qiuzhidi.model.UmsResumeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsResumeMapper {
    long countByExample(UmsResumeExample example);

    int deleteByExample(UmsResumeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsResume record);

    int insertSelective(UmsResume record);

    List<UmsResume> selectByExampleWithBLOBs(UmsResumeExample example);

    List<UmsResume> selectByExample(UmsResumeExample example);

    UmsResume selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsResume record, @Param("example") UmsResumeExample example);

    int updateByExampleWithBLOBs(@Param("record") UmsResume record, @Param("example") UmsResumeExample example);

    int updateByExample(@Param("record") UmsResume record, @Param("example") UmsResumeExample example);

    int updateByPrimaryKeySelective(UmsResume record);

    int updateByPrimaryKeyWithBLOBs(UmsResume record);

    int updateByPrimaryKey(UmsResume record);

    Long selectByMemberId(Long member_id);
}
