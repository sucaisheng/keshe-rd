package com.qingmeng.qiuzhidi.mapper;

import com.qingmeng.qiuzhidi.model.CmsCompany;
import com.qingmeng.qiuzhidi.model.CmsCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsCompanyMapper {
    long countByExample(CmsCompanyExample example);

    int deleteByExample(CmsCompanyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsCompany record);

    int insertSelective(CmsCompany record);

    List<CmsCompany> selectByExample(CmsCompanyExample example);

    CmsCompany selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsCompany record, @Param("example") CmsCompanyExample example);

    int updateByExample(@Param("record") CmsCompany record, @Param("example") CmsCompanyExample example);

    int updateByPrimaryKeySelective(CmsCompany record);

    int updateByPrimaryKey(CmsCompany record);
}