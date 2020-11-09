package com.qingmeng.qiuzhidi.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class UmsRecruitResumeRelation implements Serializable {
    private Long id;

    @ApiModelProperty(value = "招聘id")
    private Long recruitId;

    @ApiModelProperty(value = "简历id")
    private Long resumeId;

    @ApiModelProperty(value = "1-待选 2-面试中 3-通过 4-失败")
    private Integer type;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRecruitId() {
        return recruitId;
    }

    public void setRecruitId(Long recruitId) {
        this.recruitId = recruitId;
    }

    public Long getResumeId() {
        return resumeId;
    }

    public void setResumeId(Long resumeId) {
        this.resumeId = resumeId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", recruitId=").append(recruitId);
        sb.append(", resumeId=").append(resumeId);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
