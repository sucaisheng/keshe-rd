package com.qingmeng.qiuzhidi.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class UmsPushPeople implements Serializable {
    private Long id;

    @ApiModelProperty(value = "内推人名字")
    private String pushPeopleName;

    @ApiModelProperty(value = "内推人职位")
    private String pushPeoplePosition;

    @ApiModelProperty(value = "内推人公司")
    private String pushPeopleCompany;

    @ApiModelProperty(value = "内推人自我介绍")
    private String pushPeopleDescripes;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPushPeopleName() {
        return pushPeopleName;
    }

    public void setPushPeopleName(String pushPeopleName) {
        this.pushPeopleName = pushPeopleName;
    }

    public String getPushPeoplePosition() {
        return pushPeoplePosition;
    }

    public void setPushPeoplePosition(String pushPeoplePosition) {
        this.pushPeoplePosition = pushPeoplePosition;
    }

    public String getPushPeopleCompany() {
        return pushPeopleCompany;
    }

    public void setPushPeopleCompany(String pushPeopleCompany) {
        this.pushPeopleCompany = pushPeopleCompany;
    }

    public String getPushPeopleDescripes() {
        return pushPeopleDescripes;
    }

    public void setPushPeopleDescripes(String pushPeopleDescripes) {
        this.pushPeopleDescripes = pushPeopleDescripes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pushPeopleName=").append(pushPeopleName);
        sb.append(", pushPeoplePosition=").append(pushPeoplePosition);
        sb.append(", pushPeopleCompany=").append(pushPeopleCompany);
        sb.append(", pushPeopleDescripes=").append(pushPeopleDescripes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}