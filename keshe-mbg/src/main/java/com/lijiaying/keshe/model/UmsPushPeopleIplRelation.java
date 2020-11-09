package com.qingmeng.qiuzhidi.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class UmsPushPeopleIplRelation implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "内推信息id")
    private Integer interpolateId;

    @ApiModelProperty(value = "内推人id")
    private Integer pushPeopleId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInterpolateId() {
        return interpolateId;
    }

    public void setInterpolateId(Integer interpolateId) {
        this.interpolateId = interpolateId;
    }

    public Integer getPushPeopleId() {
        return pushPeopleId;
    }

    public void setPushPeopleId(Integer pushPeopleId) {
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
        sb.append(", pushPeopleId=").append(pushPeopleId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}