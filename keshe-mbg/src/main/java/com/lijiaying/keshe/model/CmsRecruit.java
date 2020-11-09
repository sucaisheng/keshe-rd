package com.qingmeng.qiuzhidi.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class CmsRecruit implements Serializable {
    private Long id;

    @ApiModelProperty(value = "职位名称")
    private String recruitName;

    @ApiModelProperty(value = "薪资范围")
    private String recruitSalary;

    @ApiModelProperty(value = "工作地点")
    private String recruitWorkspace;

    @ApiModelProperty(value = "发布日期")
    private Date releaseDate;

    @ApiModelProperty(value = "部门")
    private String department;

    @ApiModelProperty(value = "职位类型：0 - 实习  1 - 校招  2 - 社招 ")
    private Integer type;

    @ApiModelProperty(value = "企业id")
    private Long companyId;

    @ApiModelProperty(value = "是否关闭： 0 - 进行中  1 - 已关闭")
    private Integer isClose;

    @ApiModelProperty(value = "是否删除 ： 0 - 未删除  1 - 已删除")
    private Integer isDelete;

    @ApiModelProperty(value = "职位描述")
    private String jobDescription;

    @ApiModelProperty(value = "技能要求")
    private String skillRequired;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRecruitName() {
        return recruitName;
    }

    public void setRecruitName(String recruitName) {
        this.recruitName = recruitName;
    }

    public String getRecruitSalary() {
        return recruitSalary;
    }

    public void setRecruitSalary(String recruitSalary) {
        this.recruitSalary = recruitSalary;
    }

    public String getRecruitWorkspace() {
        return recruitWorkspace;
    }

    public void setRecruitWorkspace(String recruitWorkspace) {
        this.recruitWorkspace = recruitWorkspace;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Integer getIsClose() {
        return isClose;
    }

    public void setIsClose(Integer isClose) {
        this.isClose = isClose;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getSkillRequired() {
        return skillRequired;
    }

    public void setSkillRequired(String skillRequired) {
        this.skillRequired = skillRequired;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", recruitName=").append(recruitName);
        sb.append(", recruitSalary=").append(recruitSalary);
        sb.append(", recruitWorkspace=").append(recruitWorkspace);
        sb.append(", releaseDate=").append(releaseDate);
        sb.append(", department=").append(department);
        sb.append(", type=").append(type);
        sb.append(", companyId=").append(companyId);
        sb.append(", isClose=").append(isClose);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", jobDescription=").append(jobDescription);
        sb.append(", skillRequired=").append(skillRequired);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}