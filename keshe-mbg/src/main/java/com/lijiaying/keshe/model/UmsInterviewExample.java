package com.qingmeng.qiuzhidi.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UmsInterviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UmsInterviewExample() {
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

        public Criteria andInterviewPositionIsNull() {
            addCriterion("interview_position is null");
            return (Criteria) this;
        }

        public Criteria andInterviewPositionIsNotNull() {
            addCriterion("interview_position is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewPositionEqualTo(String value) {
            addCriterion("interview_position =", value, "interviewPosition");
            return (Criteria) this;
        }

        public Criteria andInterviewPositionNotEqualTo(String value) {
            addCriterion("interview_position <>", value, "interviewPosition");
            return (Criteria) this;
        }

        public Criteria andInterviewPositionGreaterThan(String value) {
            addCriterion("interview_position >", value, "interviewPosition");
            return (Criteria) this;
        }

        public Criteria andInterviewPositionGreaterThanOrEqualTo(String value) {
            addCriterion("interview_position >=", value, "interviewPosition");
            return (Criteria) this;
        }

        public Criteria andInterviewPositionLessThan(String value) {
            addCriterion("interview_position <", value, "interviewPosition");
            return (Criteria) this;
        }

        public Criteria andInterviewPositionLessThanOrEqualTo(String value) {
            addCriterion("interview_position <=", value, "interviewPosition");
            return (Criteria) this;
        }

        public Criteria andInterviewPositionLike(String value) {
            addCriterion("interview_position like", value, "interviewPosition");
            return (Criteria) this;
        }

        public Criteria andInterviewPositionNotLike(String value) {
            addCriterion("interview_position not like", value, "interviewPosition");
            return (Criteria) this;
        }

        public Criteria andInterviewPositionIn(List<String> values) {
            addCriterion("interview_position in", values, "interviewPosition");
            return (Criteria) this;
        }

        public Criteria andInterviewPositionNotIn(List<String> values) {
            addCriterion("interview_position not in", values, "interviewPosition");
            return (Criteria) this;
        }

        public Criteria andInterviewPositionBetween(String value1, String value2) {
            addCriterion("interview_position between", value1, value2, "interviewPosition");
            return (Criteria) this;
        }

        public Criteria andInterviewPositionNotBetween(String value1, String value2) {
            addCriterion("interview_position not between", value1, value2, "interviewPosition");
            return (Criteria) this;
        }

        public Criteria andInterviewPriceIsNull() {
            addCriterion("interview_price is null");
            return (Criteria) this;
        }

        public Criteria andInterviewPriceIsNotNull() {
            addCriterion("interview_price is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewPriceEqualTo(BigDecimal value) {
            addCriterion("interview_price =", value, "interviewPrice");
            return (Criteria) this;
        }

        public Criteria andInterviewPriceNotEqualTo(BigDecimal value) {
            addCriterion("interview_price <>", value, "interviewPrice");
            return (Criteria) this;
        }

        public Criteria andInterviewPriceGreaterThan(BigDecimal value) {
            addCriterion("interview_price >", value, "interviewPrice");
            return (Criteria) this;
        }

        public Criteria andInterviewPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interview_price >=", value, "interviewPrice");
            return (Criteria) this;
        }

        public Criteria andInterviewPriceLessThan(BigDecimal value) {
            addCriterion("interview_price <", value, "interviewPrice");
            return (Criteria) this;
        }

        public Criteria andInterviewPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interview_price <=", value, "interviewPrice");
            return (Criteria) this;
        }

        public Criteria andInterviewPriceIn(List<BigDecimal> values) {
            addCriterion("interview_price in", values, "interviewPrice");
            return (Criteria) this;
        }

        public Criteria andInterviewPriceNotIn(List<BigDecimal> values) {
            addCriterion("interview_price not in", values, "interviewPrice");
            return (Criteria) this;
        }

        public Criteria andInterviewPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interview_price between", value1, value2, "interviewPrice");
            return (Criteria) this;
        }

        public Criteria andInterviewPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interview_price not between", value1, value2, "interviewPrice");
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

        public Criteria andInterviewStatusIsNull() {
            addCriterion("interview_status is null");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusIsNotNull() {
            addCriterion("interview_status is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusEqualTo(Integer value) {
            addCriterion("interview_status =", value, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusNotEqualTo(Integer value) {
            addCriterion("interview_status <>", value, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusGreaterThan(Integer value) {
            addCriterion("interview_status >", value, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("interview_status >=", value, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusLessThan(Integer value) {
            addCriterion("interview_status <", value, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusLessThanOrEqualTo(Integer value) {
            addCriterion("interview_status <=", value, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusIn(List<Integer> values) {
            addCriterion("interview_status in", values, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusNotIn(List<Integer> values) {
            addCriterion("interview_status not in", values, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusBetween(Integer value1, Integer value2) {
            addCriterion("interview_status between", value1, value2, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("interview_status not between", value1, value2, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberIsNull() {
            addCriterion("browse_number is null");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberIsNotNull() {
            addCriterion("browse_number is not null");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberEqualTo(Long value) {
            addCriterion("browse_number =", value, "browseNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberNotEqualTo(Long value) {
            addCriterion("browse_number <>", value, "browseNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberGreaterThan(Long value) {
            addCriterion("browse_number >", value, "browseNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("browse_number >=", value, "browseNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberLessThan(Long value) {
            addCriterion("browse_number <", value, "browseNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberLessThanOrEqualTo(Long value) {
            addCriterion("browse_number <=", value, "browseNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberIn(List<Long> values) {
            addCriterion("browse_number in", values, "browseNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberNotIn(List<Long> values) {
            addCriterion("browse_number not in", values, "browseNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberBetween(Long value1, Long value2) {
            addCriterion("browse_number between", value1, value2, "browseNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberNotBetween(Long value1, Long value2) {
            addCriterion("browse_number not between", value1, value2, "browseNumber");
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