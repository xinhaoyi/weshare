package com.yxh.weshare.bean.pojo;

import java.util.ArrayList;
import java.util.List;

public class CategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CategoryExample() {
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

        public Criteria andWsCategoryIdIsNull() {
            addCriterion("ws_category_id is null");
            return (Criteria) this;
        }

        public Criteria andWsCategoryIdIsNotNull() {
            addCriterion("ws_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andWsCategoryIdEqualTo(Integer value) {
            addCriterion("ws_category_id =", value, "wsCategoryId");
            return (Criteria) this;
        }

        public Criteria andWsCategoryIdNotEqualTo(Integer value) {
            addCriterion("ws_category_id <>", value, "wsCategoryId");
            return (Criteria) this;
        }

        public Criteria andWsCategoryIdGreaterThan(Integer value) {
            addCriterion("ws_category_id >", value, "wsCategoryId");
            return (Criteria) this;
        }

        public Criteria andWsCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ws_category_id >=", value, "wsCategoryId");
            return (Criteria) this;
        }

        public Criteria andWsCategoryIdLessThan(Integer value) {
            addCriterion("ws_category_id <", value, "wsCategoryId");
            return (Criteria) this;
        }

        public Criteria andWsCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("ws_category_id <=", value, "wsCategoryId");
            return (Criteria) this;
        }

        public Criteria andWsCategoryIdIn(List<Integer> values) {
            addCriterion("ws_category_id in", values, "wsCategoryId");
            return (Criteria) this;
        }

        public Criteria andWsCategoryIdNotIn(List<Integer> values) {
            addCriterion("ws_category_id not in", values, "wsCategoryId");
            return (Criteria) this;
        }

        public Criteria andWsCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("ws_category_id between", value1, value2, "wsCategoryId");
            return (Criteria) this;
        }

        public Criteria andWsCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ws_category_id not between", value1, value2, "wsCategoryId");
            return (Criteria) this;
        }

        public Criteria andWsCategoryNameIsNull() {
            addCriterion("ws_category_name is null");
            return (Criteria) this;
        }

        public Criteria andWsCategoryNameIsNotNull() {
            addCriterion("ws_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andWsCategoryNameEqualTo(String value) {
            addCriterion("ws_category_name =", value, "wsCategoryName");
            return (Criteria) this;
        }

        public Criteria andWsCategoryNameNotEqualTo(String value) {
            addCriterion("ws_category_name <>", value, "wsCategoryName");
            return (Criteria) this;
        }

        public Criteria andWsCategoryNameGreaterThan(String value) {
            addCriterion("ws_category_name >", value, "wsCategoryName");
            return (Criteria) this;
        }

        public Criteria andWsCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("ws_category_name >=", value, "wsCategoryName");
            return (Criteria) this;
        }

        public Criteria andWsCategoryNameLessThan(String value) {
            addCriterion("ws_category_name <", value, "wsCategoryName");
            return (Criteria) this;
        }

        public Criteria andWsCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("ws_category_name <=", value, "wsCategoryName");
            return (Criteria) this;
        }

        public Criteria andWsCategoryNameLike(String value) {
            addCriterion("ws_category_name like", value, "wsCategoryName");
            return (Criteria) this;
        }

        public Criteria andWsCategoryNameNotLike(String value) {
            addCriterion("ws_category_name not like", value, "wsCategoryName");
            return (Criteria) this;
        }

        public Criteria andWsCategoryNameIn(List<String> values) {
            addCriterion("ws_category_name in", values, "wsCategoryName");
            return (Criteria) this;
        }

        public Criteria andWsCategoryNameNotIn(List<String> values) {
            addCriterion("ws_category_name not in", values, "wsCategoryName");
            return (Criteria) this;
        }

        public Criteria andWsCategoryNameBetween(String value1, String value2) {
            addCriterion("ws_category_name between", value1, value2, "wsCategoryName");
            return (Criteria) this;
        }

        public Criteria andWsCategoryNameNotBetween(String value1, String value2) {
            addCriterion("ws_category_name not between", value1, value2, "wsCategoryName");
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