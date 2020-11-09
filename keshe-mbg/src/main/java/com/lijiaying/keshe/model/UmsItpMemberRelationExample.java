package com.qingmeng.qiuzhidi.model;

import java.util.ArrayList;
import java.util.List;

public class UmsItpMemberRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UmsItpMemberRelationExample() {
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

        public Criteria andInterpolateIdIsNull() {
            addCriterion("interpolate_id is null");
            return (Criteria) this;
        }

        public Criteria andInterpolateIdIsNotNull() {
            addCriterion("interpolate_id is not null");
            return (Criteria) this;
        }

        public Criteria andInterpolateIdEqualTo(Long value) {
            addCriterion("interpolate_id =", value, "interpolateId");
            return (Criteria) this;
        }

        public Criteria andInterpolateIdNotEqualTo(Long value) {
            addCriterion("interpolate_id <>", value, "interpolateId");
            return (Criteria) this;
        }

        public Criteria andInterpolateIdGreaterThan(Long value) {
            addCriterion("interpolate_id >", value, "interpolateId");
            return (Criteria) this;
        }

        public Criteria andInterpolateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("interpolate_id >=", value, "interpolateId");
            return (Criteria) this;
        }

        public Criteria andInterpolateIdLessThan(Long value) {
            addCriterion("interpolate_id <", value, "interpolateId");
            return (Criteria) this;
        }

        public Criteria andInterpolateIdLessThanOrEqualTo(Long value) {
            addCriterion("interpolate_id <=", value, "interpolateId");
            return (Criteria) this;
        }

        public Criteria andInterpolateIdIn(List<Long> values) {
            addCriterion("interpolate_id in", values, "interpolateId");
            return (Criteria) this;
        }

        public Criteria andInterpolateIdNotIn(List<Long> values) {
            addCriterion("interpolate_id not in", values, "interpolateId");
            return (Criteria) this;
        }

        public Criteria andInterpolateIdBetween(Long value1, Long value2) {
            addCriterion("interpolate_id between", value1, value2, "interpolateId");
            return (Criteria) this;
        }

        public Criteria andInterpolateIdNotBetween(Long value1, Long value2) {
            addCriterion("interpolate_id not between", value1, value2, "interpolateId");
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

        public Criteria andResumeIdIsNull() {
            addCriterion("resume_id is null");
            return (Criteria) this;
        }

        public Criteria andResumeIdIsNotNull() {
            addCriterion("resume_id is not null");
            return (Criteria) this;
        }

        public Criteria andResumeIdEqualTo(Long value) {
            addCriterion("resume_id =", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdNotEqualTo(Long value) {
            addCriterion("resume_id <>", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdGreaterThan(Long value) {
            addCriterion("resume_id >", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("resume_id >=", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdLessThan(Long value) {
            addCriterion("resume_id <", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdLessThanOrEqualTo(Long value) {
            addCriterion("resume_id <=", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdIn(List<Long> values) {
            addCriterion("resume_id in", values, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdNotIn(List<Long> values) {
            addCriterion("resume_id not in", values, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdBetween(Long value1, Long value2) {
            addCriterion("resume_id between", value1, value2, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdNotBetween(Long value1, Long value2) {
            addCriterion("resume_id not between", value1, value2, "resumeId");
            return (Criteria) this;
        }

        public Criteria andPushPeopleIdIsNull() {
            addCriterion("push_people_id is null");
            return (Criteria) this;
        }

        public Criteria andPushPeopleIdIsNotNull() {
            addCriterion("push_people_id is not null");
            return (Criteria) this;
        }

        public Criteria andPushPeopleIdEqualTo(Long value) {
            addCriterion("push_people_id =", value, "pushPeopleId");
            return (Criteria) this;
        }

        public Criteria andPushPeopleIdNotEqualTo(Long value) {
            addCriterion("push_people_id <>", value, "pushPeopleId");
            return (Criteria) this;
        }

        public Criteria andPushPeopleIdGreaterThan(Long value) {
            addCriterion("push_people_id >", value, "pushPeopleId");
            return (Criteria) this;
        }

        public Criteria andPushPeopleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("push_people_id >=", value, "pushPeopleId");
            return (Criteria) this;
        }

        public Criteria andPushPeopleIdLessThan(Long value) {
            addCriterion("push_people_id <", value, "pushPeopleId");
            return (Criteria) this;
        }

        public Criteria andPushPeopleIdLessThanOrEqualTo(Long value) {
            addCriterion("push_people_id <=", value, "pushPeopleId");
            return (Criteria) this;
        }

        public Criteria andPushPeopleIdIn(List<Long> values) {
            addCriterion("push_people_id in", values, "pushPeopleId");
            return (Criteria) this;
        }

        public Criteria andPushPeopleIdNotIn(List<Long> values) {
            addCriterion("push_people_id not in", values, "pushPeopleId");
            return (Criteria) this;
        }

        public Criteria andPushPeopleIdBetween(Long value1, Long value2) {
            addCriterion("push_people_id between", value1, value2, "pushPeopleId");
            return (Criteria) this;
        }

        public Criteria andPushPeopleIdNotBetween(Long value1, Long value2) {
            addCriterion("push_people_id not between", value1, value2, "pushPeopleId");
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