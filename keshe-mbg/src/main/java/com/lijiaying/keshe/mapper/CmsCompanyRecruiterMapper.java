package com.qingmeng.qiuzhidi.mapper;

import com.qingmeng.qiuzhidi.model.CmsCompanyRecruiter;
import com.qingmeng.qiuzhidi.model.CmsCompanyRecruiterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsCompanyRecruiterMapper {
    long countByExample(CmsCompanyRecruiterExample example);

    int deleteByExample(CmsCompanyRecruiterExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsCompanyRecruiter record);

    int insertSelective(CmsCompanyRecruiter record);

    List<CmsCompanyRecruiter> selectByExampleWithBLOBs(CmsCompanyRecruiterExample example);

    List<CmsCompanyRecruiter> selectByExample(CmsCompanyRecruiterExample example);

    CmsCompanyRecruiter selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsCompanyRecruiter record, @Param("example") CmsCompanyRecruiterExample example);

    int updateByExampleWithBLOBs(@Param("record") CmsCompanyRecruiter record, @Param("example") CmsCompanyRecruiterExample example);

    int updateByExample(@Param("record") CmsCompanyRecruiter record, @Param("example") CmsCompanyRecruiterExample example);

    int updateByPrimaryKeySelective(CmsCompanyRecruiter record);

    int updateByPrimaryKeyWithBLOBs(CmsCompanyRecruiter record);

    int updateByPrimaryKey(CmsCompanyRecruiter record);
}