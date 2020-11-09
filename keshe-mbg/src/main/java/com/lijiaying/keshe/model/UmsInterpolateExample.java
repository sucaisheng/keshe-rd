package com.qingmeng.qiuzhidi.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UmsInterpolateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UmsInterpolateExample() {
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

        public Criteria andCompaniesIsNull() {
            addCriterion("companies is null");
            return (Criteria) this;
        }

        public Criteria andCompaniesIsNotNull() {
            addCriterion("companies is not null");
            return (Criteria) this;
        }

        public Criteria andCompaniesEqualTo(String value) {
            addCriterion("companies =", value, "companies");
            return (Criteria) this;
        }

        public Criteria andCompaniesNotEqualTo(String value) {
            addCriterion("companies <>", value, "companies");
            return (Criteria) this;
        }

        public Criteria andCompaniesGreaterThan(String value) {
            addCriterion("companies >", value, "companies");
            return (Criteria) this;
        }

        public Criteria andCompaniesGreaterThanOrEqualTo(String value) {
            addCriterion("companies >=", value, "companies");
            return (Criteria) this;
        }

        public Criteria andCompaniesLessThan(String value) {
            addCriterion("companies <", value, "companies");
            return (Criteria) this;
        }

        public Criteria andCompaniesLessThanOrEqualTo(String value) {
            addCriterion("companies <=", value, "companies");
            return (Criteria) this;
        }

        public Criteria andCompaniesLike(String value) {
            addCriterion("companies like", value, "companies");
            return (Criteria) this;
        }

        public Criteria andCompaniesNotLike(String value) {
            addCriterion("companies not like", value, "companies");
            return (Criteria) this;
        }

        public Criteria andCompaniesIn(List<String> values) {
            addCriterion("companies in", values, "companies");
            return (Criteria) this;
        }

        public Criteria andCompaniesNotIn(List<String> values) {
            addCriterion("companies not in", values, "companies");
            return (Criteria) this;
        }

        public Criteria andCompaniesBetween(String value1, String value2) {
            addCriterion("companies between", value1, value2, "companies");
            return (Criteria) this;
        }

        public Criteria andCompaniesNotBetween(String value1, String value2) {
            addCriterion("companies not between", value1, value2, "companies");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(Float value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(Float value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(Float value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(Float value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(Float value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(Float value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<Float> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<Float> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(Float value1, Float value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(Float value1, Float value2) {
            addCriterion("salary not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andDescribesIsNull() {
            addCriterion("describes is null");
            return (Criteria) this;
        }

        public Criteria andDescribesIsNotNull() {
            addCriterion("describes is not null");
            return (Criteria) this;
        }

        public Criteria andDescribesEqualTo(String value) {
            addCriterion("describes =", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesNotEqualTo(String value) {
            addCriterion("describes <>", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesGreaterThan(String value) {
            addCriterion("describes >", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesGreaterThanOrEqualTo(String value) {
            addCriterion("describes >=", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesLessThan(String value) {
            addCriterion("describes <", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesLessThanOrEqualTo(String value) {
            addCriterion("describes <=", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesLike(String value) {
            addCriterion("describes like", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesNotLike(String value) {
            addCriterion("describes not like", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesIn(List<String> values) {
            addCriterion("describes in", values, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesNotIn(List<String> values) {
            addCriterion("describes not in", values, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesBetween(String value1, String value2) {
            addCriterion("describes between", value1, value2, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesNotBetween(String value1, String value2) {
            addCriterion("describes not between", value1, value2, "describes");
            return (Criteria) this;
        }

        public Criteria andInterpolateStateIsNull() {
            addCriterion("interpolate_state is null");
            return (Criteria) this;
        }

        public Criteria andInterpolateStateIsNotNull() {
            addCriterion("interpolate_state is not null");
            return (Criteria) this;
        }

        public Criteria andInterpolateStateEqualTo(Long value) {
            addCriterion("interpolate_state =", value, "interpolateState");
            return (Criteria) this;
        }

        public Criteria andInterpolateStateNotEqualTo(Long value) {
            addCriterion("interpolate_state <>", value, "interpolateState");
            return (Criteria) this;
        }

        public Criteria andInterpolateStateGreaterThan(Long value) {
            addCriterion("interpolate_state >", value, "interpolateState");
            return (Criteria) this;
        }

        public Criteria andInterpolateStateGreaterThanOrEqualTo(Long value) {
            addCriterion("interpolate_state >=", value, "interpolateState");
            return (Criteria) this;
        }

        public Criteria andInterpolateStateLessThan(Long value) {
            addCriterion("interpolate_state <", value, "interpolateState");
            return (Criteria) this;
        }

        public Criteria andInterpolateStateLessThanOrEqualTo(Long value) {
            addCriterion("interpolate_state <=", value, "interpolateState");
            return (Criteria) this;
        }

        public Criteria andInterpolateStateIn(List<Long> values) {
            addCriterion("interpolate_state in", values, "interpolateState");
            return (Criteria) this;
        }

        public Criteria andInterpolateStateNotIn(List<Long> values) {
            addCriterion("interpolate_state not in", values, "interpolateState");
            return (Criteria) this;
        }

        public Criteria andInterpolateStateBetween(Long value1, Long value2) {
            addCriterion("interpolate_state between", value1, value2, "interpolateState");
            return (Criteria) this;
        }

        public Criteria andInterpolateStateNotBetween(Long value1, Long value2) {
            addCriterion("interpolate_state not between", value1, value2, "interpolateState");
            return (Criteria) this;
        }

        public Criteria andPushIplPeopleIsNull() {
            addCriterion("push_ipl_people is null");
            return (Criteria) this;
        }

        public Criteria andPushIplPeopleIsNotNull() {
            addCriterion("push_ipl_people is not null");
            return (Criteria) this;
        }

        public Criteria andPushIplPeopleEqualTo(Long value) {
            addCriterion("push_ipl_people =", value, "pushIplPeople");
            return (Criteria) this;
        }

        public Criteria andPushIplPeopleNotEqualTo(Long value) {
            addCriterion("push_ipl_people <>", value, "pushIplPeople");
            return (Criteria) this;
        }

        public Criteria andPushIplPeopleGreaterThan(Long value) {
            addCriterion("push_ipl_people >", value, "pushIplPeople");
            return (Criteria) this;
        }

        public Criteria andPushIplPeopleGreaterThanOrEqualTo(Long value) {
            addCriterion("push_ipl_people >=", value, "pushIplPeople");
            return (Criteria) this;
        }

        public Criteria andPushIplPeopleLessThan(Long value) {
            addCriterion("push_ipl_people <", value, "pushIplPeople");
            return (Criteria) this;
        }

        public Criteria andPushIplPeopleLessThanOrEqualTo(Long value) {
            addCriterion("push_ipl_people <=", value, "pushIplPeople");
            return (Criteria) this;
        }

        public Criteria andPushIplPeopleIn(List<Long> values) {
            addCriterion("push_ipl_people in", values, "pushIplPeople");
            return (Criteria) this;
        }

        public Criteria andPushIplPeopleNotIn(List<Long> values) {
            addCriterion("push_ipl_people not in", values, "pushIplPeople");
            return (Criteria) this;
        }

        public Criteria andPushIplPeopleBetween(Long value1, Long value2) {
            addCriterion("push_ipl_people between", value1, value2, "pushIplPeople");
            return (Criteria) this;
        }

        public Criteria andPushIplPeopleNotBetween(Long value1, Long value2) {
            addCriterion("push_ipl_people not between", value1, value2, "pushIplPeople");
            return (Criteria) this;
        }

        public Criteria andResumeStateIsNull() {
            addCriterion("resume_state is null");
            return (Criteria) this;
        }

        public Criteria andResumeStateIsNotNull() {
            addCriterion("resume_state is not null");
            return (Criteria) this;
        }

        public Criteria andResumeStateEqualTo(Long value) {
            addCriterion("resume_state =", value, "resumeState");
            return (Criteria) this;
        }

        public Criteria andResumeStateNotEqualTo(Long value) {
            addCriterion("resume_state <>", value, "resumeState");
            return (Criteria) this;
        }

        public Criteria andResumeStateGreaterThan(Long value) {
            addCriterion("resume_state >", value, "resumeState");
            return (Criteria) this;
        }

        public Criteria andResumeStateGreaterThanOrEqualTo(Long value) {
            addCriterion("resume_state >=", value, "resumeState");
            return (Criteria) this;
        }

        public Criteria andResumeStateLessThan(Long value) {
            addCriterion("resume_state <", value, "resumeState");
            return (Criteria) this;
        }

        public Criteria andResumeStateLessThanOrEqualTo(Long value) {
            addCriterion("resume_state <=", value, "resumeState");
            return (Criteria) this;
        }

        public Criteria andResumeStateIn(List<Long> values) {
            addCriterion("resume_state in", values, "resumeState");
            return (Criteria) this;
        }

        public Criteria andResumeStateNotIn(List<Long> values) {
            addCriterion("resume_state not in", values, "resumeState");
            return (Criteria) this;
        }

        public Criteria andResumeStateBetween(Long value1, Long value2) {
            addCriterion("resume_state between", value1, value2, "resumeState");
            return (Criteria) this;
        }

        public Criteria andResumeStateNotBetween(Long value1, Long value2) {
            addCriterion("resume_state not between", value1, value2, "resumeState");
            return (Criteria) this;
        }

        public Criteria andIssueTimeIsNull() {
            addCriterion("issue_time is null");
            return (Criteria) this;
        }

        public Criteria andIssueTimeIsNotNull() {
            addCriterion("issue_time is not null");
            return (Criteria) this;
        }

        public Criteria andIssueTimeEqualTo(Date value) {
            addCriterion("issue_time =", value, "issueTime");
            return (Criteria) this;
        }

        public Criteria andIssueTimeNotEqualTo(Date value) {
            addCriterion("issue_time <>", value, "issueTime");
            return (Criteria) this;
        }

        public Criteria andIssueTimeGreaterThan(Date value) {
            addCriterion("issue_time >", value, "issueTime");
            return (Criteria) this;
        }

        public Criteria andIssueTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("issue_time >=", value, "issueTime");
            return (Criteria) this;
        }

        public Criteria andIssueTimeLessThan(Date value) {
            addCriterion("issue_time <", value, "issueTime");
            return (Criteria) this;
        }

        public Criteria andIssueTimeLessThanOrEqualTo(Date value) {
            addCriterion("issue_time <=", value, "issueTime");
            return (Criteria) this;
        }

        public Criteria andIssueTimeIn(List<Date> values) {
            addCriterion("issue_time in", values, "issueTime");
            return (Criteria) this;
        }

        public Criteria andIssueTimeNotIn(List<Date> values) {
            addCriterion("issue_time not in", values, "issueTime");
            return (Criteria) this;
        }

        public Criteria andIssueTimeBetween(Date value1, Date value2) {
            addCriterion("issue_time between", value1, value2, "issueTime");
            return (Criteria) this;
        }

        public Criteria andIssueTimeNotBetween(Date value1, Date value2) {
            addCriterion("issue_time not between", value1, value2, "issueTime");
            return (Criteria) this;
        }

        public Criteria andResponseNumberIsNull() {
            addCriterion("response_number is null");
            return (Criteria) this;
        }

        public Criteria andResponseNumberIsNotNull() {
            addCriterion("response_number is not null");
            return (Criteria) this;
        }

        public Criteria andResponseNumberEqualTo(Integer value) {
            addCriterion("response_number =", value, "responseNumber");
            return (Criteria) this;
        }

        public Criteria andResponseNumberNotEqualTo(Integer value) {
            addCriterion("response_number <>", value, "responseNumber");
            return (Criteria) this;
        }

        public Criteria andResponseNumberGreaterThan(Integer value) {
            addCriterion("response_number >", value, "responseNumber");
            return (Criteria) this;
        }

        public Criteria andResponseNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("response_number >=", value, "responseNumber");
            return (Criteria) this;
        }

        public Criteria andResponseNumberLessThan(Integer value) {
            addCriterion("response_number <", value, "responseNumber");
            return (Criteria) this;
        }

        public Criteria andResponseNumberLessThanOrEqualTo(Integer value) {
            addCriterion("response_number <=", value, "responseNumber");
            return (Criteria) this;
        }

        public Criteria andResponseNumberIn(List<Integer> values) {
            addCriterion("response_number in", values, "responseNumber");
            return (Criteria) this;
        }

        public Criteria andResponseNumberNotIn(List<Integer> values) {
            addCriterion("response_number not in", values, "responseNumber");
            return (Criteria) this;
        }

        public Criteria andResponseNumberBetween(Integer value1, Integer value2) {
            addCriterion("response_number between", value1, value2, "responseNumber");
            return (Criteria) this;
        }

        public Criteria andResponseNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("response_number not between", value1, value2, "responseNumber");
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