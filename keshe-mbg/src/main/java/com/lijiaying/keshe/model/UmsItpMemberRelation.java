package com.qingmeng.qiuzhidi.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class UmsItpMemberRelation implements Serializable {
    private Long id;

    @ApiModelProperty(value = "内推编号")
    private Long interpolateId;

    @ApiModelProperty(value = "求职者编号")
    private Long memberId;

    @ApiModelProperty(value = "个人简介编号")
    private Long resumeId;

    @ApiModelProperty(value = "内推人id")
    private Long pushPeopleId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInterpolateId() {
        return interpolateId;
    }

    public void setInterpolateId(Long interpolateId) {
        this.interpolateId = interpolateId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getResumeId() {
        return resumeId;
    }

    public void setResumeId(Long resumeId) {
        this.resumeId = resumeId;
    }

    public Long getPushPeopleId() {
        return pushPeopleId;
    }

    public void setPushPeopleId(Long pushPeopleId) {
        this.pushPeopleId = pushPeopleId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", interpolateId=").append(interpolateId);
        sb.append(", memberId=").append(memberId);
        sb.append(", resumeId=").append(resumeId);
        sb.append(", pushPeopleId=").append(pushPeopleId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}