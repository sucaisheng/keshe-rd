package com.qingmeng.qiuzhidi.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class UmsInterview implements Serializable {
    private Long id;

    @ApiModelProperty(value = "面试指导职位")
    private String interviewPosition;

    @ApiModelProperty(value = "本次收费")
    private BigDecimal interviewPrice;

    @ApiModelProperty(value = "用户id")
    private Long memberId;

    @ApiModelProperty(value = "认证状态： 0 - 未认证  1 - 已认证")
    private Integer interviewStatus;

    @ApiModelProperty(value = "发布日期")
    private Date createTime;

    @ApiModelProperty(value = "浏览次数")
    private Long browseNumber;

    @ApiModelProperty(value = "0 - 未删除 1 - 已删除")
    private Integer isDelete;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInterviewPosition() {
        return interviewPosition;
    }

    public void setInterviewPosition(String interviewPosition) {
        this.interviewPosition = interviewPosition;
    }

    public BigDecimal getInterviewPrice() {
        return interviewPrice;
    }

    public void setInterviewPrice(BigDecimal interviewPrice) {
        this.interviewPrice = interviewPrice;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Integer getInterviewStatus() {
        return interviewStatus;
    }

    public void setInterviewStatus(Integer interviewStatus) {
        this.interviewStatus = interviewStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getBrowseNumber() {
        return browseNumber;
    }

    public void setBrowseNumber(Long browseNumber) {
        this.browseNumber = browseNumber;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", interviewPosition=").append(interviewPosition);
        sb.append(", interviewPrice=").append(interviewPrice);
        sb.append(", memberId=").append(memberId);
        sb.append(", interviewStatus=").append(interviewStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", browseNumber=").append(browseNumber);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}