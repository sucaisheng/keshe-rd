package com.qingmeng.qiuzhidi.model;

import java.util.ArrayList;
import java.util.List;

public class UmsResumeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UmsResumeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroudIsNull() {
            addCriterion("education_backgroud is null");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroudIsNotNull() {
            addCriterion("education_backgroud is not null");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroudEqualTo(String value) {
            addCriterion("education_backgroud =", value, "educationBackgroud");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroudNotEqualTo(String value) {
            addCriterion("education_backgroud <>", value, "educationBackgroud");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroudGreaterThan(String value) {
            addCriterion("education_backgroud >", value, "educationBackgroud");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroudGreaterThanOrEqualTo(String value) {
            addCriterion("education_backgroud >=", value, "educationBackgroud");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroudLessThan(String value) {
            addCriterion("education_backgroud <", value, "educationBackgroud");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroudLessThanOrEqualTo(String value) {
            addCriterion("education_backgroud <=", value, "educationBackgroud");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroudLike(String value) {
            addCriterion("education_backgroud like", value, "educationBackgroud");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroudNotLike(String value) {
            addCriterion("education_backgroud not like", value, "educationBackgroud");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroudIn(List<String> values) {
            addCriterion("education_backgroud in", values, "educationBackgroud");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroudNotIn(List<String> values) {
            addCriterion("education_backgroud not in", values, "educationBackgroud");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroudBetween(String value1, String value2) {
            addCriterion("education_backgroud between", value1, value2, "educationBackgroud");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroudNotBetween(String value1, String value2) {
            addCriterion("education_backgroud not between", value1, value2, "educationBackgroud");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolIsNull() {
            addCriterion("graduation_school is null");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolIsNotNull() {
            addCriterion("graduation_school is not null");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolEqualTo(String value) {
            addCriterion("graduation_school =", value, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolNotEqualTo(String value) {
            addCriterion("graduation_school <>", value, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolGreaterThan(String value) {
            addCriterion("graduation_school >", value, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("graduation_school >=", value, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolLessThan(String value) {
            addCriterion("graduation_school <", value, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolLessThanOrEqualTo(String value) {
            addCriterion("graduation_school <=", value, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolLike(String value) {
            addCriterion("graduation_school like", value, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolNotLike(String value) {
            addCriterion("graduation_school not like", value, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolIn(List<String> values) {
            addCriterion("graduation_school in", values, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolNotIn(List<String> values) {
            addCriterion("graduation_school not in", values, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolBetween(String value1, String value2) {
            addCriterion("graduation_school between", value1, value2, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolNotBetween(String value1, String value2) {
            addCriterion("graduation_school not between", value1, value2, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andPositionAppliedIsNull() {
            addCriterion("position_applied is null");
            return (Criteria) this;
        }

        public Criteria andPositionAppliedIsNotNull() {
            addCriterion("position_applied is not null");
            return (Criteria) this;
        }

        public Criteria andPositionAppliedEqualTo(String value) {
            addCriterion("position_applied =", value, "positionApplied");
            return (Criteria) this;
        }

        public Criteria andPositionAppliedNotEqualTo(String value) {
            addCriterion("position_applied <>", value, "positionApplied");
            return (Criteria) this;
        }

        public Criteria andPositionAppliedGreaterThan(String value) {
            addCriterion("position_applied >", value, "positionApplied");
            return (Criteria) this;
        }

        public Criteria andPositionAppliedGreaterThanOrEqualTo(String value) {
            addCriterion("position_applied >=", value, "positionApplied");
            return (Criteria) this;
        }

        public Criteria andPositionAppliedLessThan(String value) {
            addCriterion("position_applied <", value, "positionApplied");
            return (Criteria) this;
        }

        public Criteria andPositionAppliedLessThanOrEqualTo(String value) {
            addCriterion("position_applied <=", value, "positionApplied");
            return (Criteria) this;
        }

        public Criteria andPositionAppliedLike(String value) {
            addCriterion("position_applied like", value, "positionApplied");
            return (Criteria) this;
        }

        public Criteria andPositionAppliedNotLike(String value) {
            addCriterion("position_applied not like", value, "positionApplied");
            return (Criteria) this;
        }

        public Criteria andPositionAppliedIn(List<String> values) {
            addCriterion("position_applied in", values, "positionApplied");
            return (Criteria) this;
        }

        public Criteria andPositionAppliedNotIn(List<String> values) {
            addCriterion("position_applied not in", values, "positionApplied");
            return (Criteria) this;
        }

        public Criteria andPositionAppliedBetween(String value1, String value2) {
            addCriterion("position_applied between", value1, value2, "positionApplied");
            return (Criteria) this;
        }

        public Criteria andPositionAppliedNotBetween(String value1, String value2) {
            addCriterion("position_applied not between", value1, value2, "positionApplied");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andSelfDescriptionIsNull() {
            addCriterion("self_description is null");
            return (Criteria) this;
        }

        public Criteria andSelfDescriptionIsNotNull() {
            addCriterion("self_description is not null");
            return (Criteria) this;
        }

        public Criteria andSelfDescriptionEqualTo(String value) {
            addCriterion("self_description =", value, "selfDescription");
            return (Criteria) this;
        }

        public Criteria andSelfDescriptionNotEqualTo(String value) {
            addCriterion("self_description <>", value, "selfDescription");
            return (Criteria) this;
        }

        public Criteria andSelfDescriptionGreaterThan(String value) {
            addCriterion("self_description >", value, "selfDescription");
            return (Criteria) this;
        }

        public Criteria andSelfDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("self_description >=", value, "selfDescription");
            return (Criteria) this;
        }

        public Criteria andSelfDescriptionLessThan(String value) {
            addCriterion("self_description <", value, "selfDescription");
            return (Criteria) this;
        }

        public Criteria andSelfDescriptionLessThanOrEqualTo(String value) {
            addCriterion("self_description <=", value, "selfDescription");
            return (Criteria) this;
        }

        public Criteria andSelfDescriptionLike(String value) {
            addCriterion("self_description like", value, "selfDescription");
            return (Criteria) this;
        }

        public Criteria andSelfDescriptionNotLike(String value) {
            addCriterion("self_description not like", value, "selfDescription");
            return (Criteria) this;
        }

        public Criteria andSelfDescriptionIn(List<String> values) {
            addCriterion("self_description in", values, "selfDescription");
            return (Criteria) this;
        }

        public Criteria andSelfDescriptionNotIn(List<String> values) {
            addCriterion("self_description not in", values, "selfDescription");
            return (Criteria) this;
        }

        public Criteria andSelfDescriptionBetween(String value1, String value2) {
            addCriterion("self_description between", value1, value2, "selfDescription");
            return (Criteria) this;
        }

        public Criteria andSelfDescriptionNotBetween(String value1, String value2) {
            addCriterion("self_description not between", value1, value2, "selfDescription");
            return (Criteria) this;
        }

        public Criteria andUploadResumeIsNull() {
            addCriterion("upload_resume is null");
            return (Criteria) this;
        }

        public Criteria andUploadResumeIsNotNull() {
            addCriterion("upload_resume is not null");
            return (Criteria) this;
        }

        public Criteria andUploadResumeEqualTo(String value) {
            addCriterion("upload_resume =", value, "uploadResume");
            return (Criteria) this;
        }

        public Criteria andUploadResumeNotEqualTo(String value) {
            addCriterion("upload_resume <>", value, "uploadResume");
            return (Criteria) this;
        }

        public Criteria andUploadResumeGreaterThan(String value) {
            addCriterion("upload_resume >", value, "uploadResume");
            return (Criteria) this;
        }

        public Criteria andUploadResumeGreaterThanOrEqualTo(String value) {
            addCriterion("upload_resume >=", value, "uploadResume");
            return (Criteria) this;
        }

        public Criteria andUploadResumeLessThan(String value) {
            addCriterion("upload_resume <", value, "uploadResume");
            return (Criteria) this;
        }

        public Criteria andUploadResumeLessThanOrEqualTo(String value) {
            addCriterion("upload_resume <=", value, "uploadResume");
            return (Criteria) this;
        }

        public Criteria andUploadResumeLike(String value) {
            addCriterion("upload_resume like", value, "uploadResume");
            return (Criteria) this;
        }

        public Criteria andUploadResumeNotLike(String value) {
            addCriterion("upload_resume not like", value, "uploadResume");
            return (Criteria) this;
        }

        public Criteria andUploadResumeIn(List<String> values) {
            addCriterion("upload_resume in", values, "uploadResume");
            return (Criteria) this;
        }

        public Criteria andUploadResumeNotIn(List<String> values) {
            addCriterion("upload_resume not in", values, "uploadResume");
            return (Criteria) this;
        }

        public Criteria andUploadResumeBetween(String value1, String value2) {
            addCriterion("upload_resume between", value1, value2, "uploadResume");
            return (Criteria) this;
        }

        public Criteria andUploadResumeNotBetween(String value1, String value2) {
            addCriterion("upload_resume not between", value1, value2, "uploadResume");
            return (Criteria) this;
        }

        public Criteria andAttachmentResumeIsNull() {
            addCriterion("attachment_resume is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentResumeIsNotNull() {
            addCriterion("attachment_resume is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentResumeEqualTo(String value) {
            addCriterion("attachment_resume =", value, "attachmentResume");
            return (Criteria) this;
        }

        public Criteria andAttachmentResumeNotEqualTo(String value) {
            addCriterion("attachment_resume <>", value, "attachmentResume");
            return (Criteria) this;
        }

        public Criteria andAttachmentResumeGreaterThan(String value) {
            addCriterion("attachment_resume >", value, "attachmentResume");
            return (Criteria) this;
        }

        public Criteria andAttachmentResumeGreaterThanOrEqualTo(String value) {
            addCriterion("attachment_resume >=", value, "attachmentResume");
            return (Criteria) this;
        }

        public Criteria andAttachmentResumeLessThan(String value) {
            addCriterion("attachment_resume <", value, "attachmentResume");
            return (Criteria) this;
        }

        public Criteria andAttachmentResumeLessThanOrEqualTo(String value) {
            addCriterion("attachment_resume <=", value, "attachmentResume");
            return (Criteria) this;
        }

        public Criteria andAttachmentResumeLike(String value) {
            addCriterion("attachment_resume like", value, "attachmentResume");
            return (Criteria) this;
        }

        public Criteria andAttachmentResumeNotLike(String value) {
            addCriterion("attachment_resume not like", value, "attachmentResume");
            return (Criteria) this;
        }

        public Criteria andAttachmentResumeIn(List<String> values) {
            addCriterion("attachment_resume in", values, "attachmentResume");
            return (Criteria) this;
        }

        public Criteria andAttachmentResumeNotIn(List<String> values) {
            addCriterion("attachment_resume not in", values, "attachmentResume");
            return (Criteria) this;
        }

        public Criteria andAttachmentResumeBetween(String value1, String value2) {
            addCriterion("attachment_resume between", value1, value2, "attachmentResume");
            return (Criteria) this;
        }

        public Criteria andAttachmentResumeNotBetween(String value1, String value2) {
            addCriterion("attachment_resume not between", value1, value2, "attachmentResume");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Long value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Long value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Long value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Long value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Long value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Long value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Long> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Long> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Long value1, Long value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Long value1, Long value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
