package com.qingmeng.qiuzhidi.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class UmsResume implements Serializable {
    private Long id;

    @ApiModelProperty(value = "名字")
    private String name;

    @ApiModelProperty(value = "性别：0 - 男 1 - 女")
    private Integer sex;

    @ApiModelProperty(value = "出生日期")
    private String birthday;

    @ApiModelProperty(value = "最高学历")
    private String educationBackgroud;

    @ApiModelProperty(value = "毕业院校")
    private String graduationSchool;

    @ApiModelProperty(value = "应聘职位")
    private String positionApplied;

    @ApiModelProperty(value = "联系电话")
    private String phone;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "自我描述")
    private String selfDescription;

    @ApiModelProperty(value = "上传的简历路径")
    private String uploadResume;

    @ApiModelProperty(value = "附件的简历路径")
    private String attachmentResume;

    @ApiModelProperty(value = "用户id")
    private Long memberId;

    @ApiModelProperty(value = "是否删除 0 - 不删除 1 - 删除")
    private Integer isDelete;

    @ApiModelProperty(value = "实习经历")
    private String internshipExperience;

    @ApiModelProperty(value = "项目经验")
    private String projectExperience;

    @ApiModelProperty(value = "个人技能")
    private String personalSkills;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEducationBackgroud() {
        return educationBackgroud;
    }

    public void setEducationBackgroud(String educationBackgroud) {
        this.educationBackgroud = educationBackgroud;
    }

    public String getGraduationSchool() {
        return graduationSchool;
    }

    public void setGraduationSchool(String graduationSchool) {
        this.graduationSchool = graduationSchool;
    }

    public String getPositionApplied() {
        return positionApplied;
    }

    public void setPositionApplied(String positionApplied) {
        this.positionApplied = positionApplied;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSelfDescription() {
        return selfDescription;
    }

    public void setSelfDescription(String selfDescription) {
        this.selfDescription = selfDescription;
    }

    public String getUploadResume() {
        return uploadResume;
    }

    public void setUploadResume(String uploadResume) {
        this.uploadResume = uploadResume;
    }

    public String getAttachmentResume() {
        return attachmentResume;
    }

    public void setAttachmentResume(String attachmentResume) {
        this.attachmentResume = attachmentResume;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getInternshipExperience() {
        return internshipExperience;
    }

    public void setInternshipExperience(String internshipExperience) {
        this.internshipExperience = internshipExperience;
    }

    public String getProjectExperience() {
        return projectExperience;
    }

    public void setProjectExperience(String projectExperience) {
        this.projectExperience = projectExperience;
    }

    public String getPersonalSkills() {
        return personalSkills;
    }

    public void setPersonalSkills(String personalSkills) {
        this.personalSkills = personalSkills;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", educationBackgroud=").append(educationBackgroud);
        sb.append(", graduationSchool=").append(graduationSchool);
        sb.append(", positionApplied=").append(positionApplied);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", selfDescription=").append(selfDescription);
        sb.append(", uploadResume=").append(uploadResume);
        sb.append(", attachmentResume=").append(attachmentResume);
        sb.append(", memberId=").append(memberId);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", internshipExperience=").append(internshipExperience);
        sb.append(", projectExperience=").append(projectExperience);
        sb.append(", personalSkills=").append(personalSkills);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}