package com.qingmeng.qiuzhidi.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UmsFeedback implements Serializable {
    private Long id;

    @ApiModelProperty(value = "反馈类型")
    private Integer feedbackTypeId;

    @ApiModelProperty(value = "提交的日期")
    private Date createTime;

    @ApiModelProperty(value = "反馈图片地址")
    private String feedbackImg;

    @ApiModelProperty(value = "联系电话")
    private String phone;

    @ApiModelProperty(value = "审核状态： 0 - 未审核  1 - 审核通过  2 - 审核未通过")
    private Integer status;

    @ApiModelProperty(value = "是否删除：  0 - 未删除  1 - 已删除")
    private Integer isDelete;

    @ApiModelProperty(value = "反馈意见图文")
    private String feedbackDetails;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getFeedbackTypeId() {
        return feedbackTypeId;
    }

    public void setFeedbackTypeId(Integer feedbackTypeId) {
        this.feedbackTypeId = feedbackTypeId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getFeedbackImg() {
        return feedbackImg;
    }

    public void setFeedbackImg(String feedbackImg) {
        this.feedbackImg = feedbackImg;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getFeedbackDetails() {
        return feedbackDetails;
    }

    public void setFeedbackDetails(String feedbackDetails) {
        this.feedbackDetails = feedbackDetails;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", feedbackTypeId=").append(feedbackTypeId);
        sb.append(", createTime=").append(createTime);
        sb.append(", feedbackImg=").append(feedbackImg);
        sb.append(", phone=").append(phone);
        sb.append(", status=").append(status);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", feedbackDetails=").append(feedbackDetails);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}