package com.qingmeng.qiuzhidi.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UmsInterpolate implements Serializable {
    @ApiModelProperty(value = "内推编号")
    private Long interpolateId;

    @ApiModelProperty(value = "公司1")
    private String companies;

    @ApiModelProperty(value = "金额")
    private Float salary;

    @ApiModelProperty(value = "职位")
    private String position;

    @ApiModelProperty(value = "内推描述")
    private String describes;

    @ApiModelProperty(value = "内推信息状态0->未响应 1->待确定 2->进行中 3->成功 4->失败")
    private Long interpolateState;

    @ApiModelProperty(value = "内推人id")
    private Long pushIplPeople;

    @ApiModelProperty(value = "个人简历投递状态 0->待投递 1->审核 2->进行 3->决策")
    private Long resumeState;

    @ApiModelProperty(value = "发布时间")
    private Date issueTime;

    @ApiModelProperty(value = "响应人数")
    private Integer responseNumber;

    private static final long serialVersionUID = 1L;

    public Long getInterpolateId() {
        return interpolateId;
    }

    public void setInterpolateId(Long interpolateId) {
        this.interpolateId = interpolateId;
    }

    public String getCompanies() {
        return companies;
    }

    public void setCompanies(String companies) {
        this.companies = companies;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes;
    }

    public Long getInterpolateState() {
        return interpolateState;
    }

    public void setInterpolateState(Long interpolateState) {
        this.interpolateState = interpolateState;
    }

    public Long getPushIplPeople() {
        return pushIplPeople;
    }

    public void setPushIplPeople(Long pushIplPeople) {
        this.pushIplPeople = pushIplPeople;
    }

    public Long getResumeState() {
        return resumeState;
    }

    public void setResumeState(Long resumeState) {
        this.resumeState = resumeState;
    }

    public Date getIssueTime() {
        return issueTime;
    }

    public void setIssueTime(Date issueTime) {
        this.issueTime = issueTime;
    }

    public Integer getResponseNumber() {
        return responseNumber;
    }

    public void setResponseNumber(Integer responseNumber) {
        this.responseNumber = responseNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", interpolateId=").append(interpolateId);
        sb.append(", companies=").append(companies);
        sb.append(", salary=").append(salary);
        sb.append(", position=").append(position);
        sb.append(", describes=").append(describes);
        sb.append(", interpolateState=").append(interpolateState);
        sb.append(", pushIplPeople=").append(pushIplPeople);
        sb.append(", resumeState=").append(resumeState);
        sb.append(", issueTime=").append(issueTime);
        sb.append(", responseNumber=").append(responseNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}