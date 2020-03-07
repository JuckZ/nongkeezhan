package com.nongkeezhan.nkez.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProfessorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProfessorExample() {
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

        public Criteria andProfessorIdIsNull() {
            addCriterion("professor_id is null");
            return (Criteria) this;
        }

        public Criteria andProfessorIdIsNotNull() {
            addCriterion("professor_id is not null");
            return (Criteria) this;
        }

        public Criteria andProfessorIdEqualTo(String value) {
            addCriterion("professor_id =", value, "professorId");
            return (Criteria) this;
        }

        public Criteria andProfessorIdNotEqualTo(String value) {
            addCriterion("professor_id <>", value, "professorId");
            return (Criteria) this;
        }

        public Criteria andProfessorIdGreaterThan(String value) {
            addCriterion("professor_id >", value, "professorId");
            return (Criteria) this;
        }

        public Criteria andProfessorIdGreaterThanOrEqualTo(String value) {
            addCriterion("professor_id >=", value, "professorId");
            return (Criteria) this;
        }

        public Criteria andProfessorIdLessThan(String value) {
            addCriterion("professor_id <", value, "professorId");
            return (Criteria) this;
        }

        public Criteria andProfessorIdLessThanOrEqualTo(String value) {
            addCriterion("professor_id <=", value, "professorId");
            return (Criteria) this;
        }

        public Criteria andProfessorIdLike(String value) {
            addCriterion("professor_id like", value, "professorId");
            return (Criteria) this;
        }

        public Criteria andProfessorIdNotLike(String value) {
            addCriterion("professor_id not like", value, "professorId");
            return (Criteria) this;
        }

        public Criteria andProfessorIdIn(List<String> values) {
            addCriterion("professor_id in", values, "professorId");
            return (Criteria) this;
        }

        public Criteria andProfessorIdNotIn(List<String> values) {
            addCriterion("professor_id not in", values, "professorId");
            return (Criteria) this;
        }

        public Criteria andProfessorIdBetween(String value1, String value2) {
            addCriterion("professor_id between", value1, value2, "professorId");
            return (Criteria) this;
        }

        public Criteria andProfessorIdNotBetween(String value1, String value2) {
            addCriterion("professor_id not between", value1, value2, "professorId");
            return (Criteria) this;
        }

        public Criteria andProfessorNameIsNull() {
            addCriterion("professor_name is null");
            return (Criteria) this;
        }

        public Criteria andProfessorNameIsNotNull() {
            addCriterion("professor_name is not null");
            return (Criteria) this;
        }

        public Criteria andProfessorNameEqualTo(String value) {
            addCriterion("professor_name =", value, "professorName");
            return (Criteria) this;
        }

        public Criteria andProfessorNameNotEqualTo(String value) {
            addCriterion("professor_name <>", value, "professorName");
            return (Criteria) this;
        }

        public Criteria andProfessorNameGreaterThan(String value) {
            addCriterion("professor_name >", value, "professorName");
            return (Criteria) this;
        }

        public Criteria andProfessorNameGreaterThanOrEqualTo(String value) {
            addCriterion("professor_name >=", value, "professorName");
            return (Criteria) this;
        }

        public Criteria andProfessorNameLessThan(String value) {
            addCriterion("professor_name <", value, "professorName");
            return (Criteria) this;
        }

        public Criteria andProfessorNameLessThanOrEqualTo(String value) {
            addCriterion("professor_name <=", value, "professorName");
            return (Criteria) this;
        }

        public Criteria andProfessorNameLike(String value) {
            addCriterion("professor_name like", value, "professorName");
            return (Criteria) this;
        }

        public Criteria andProfessorNameNotLike(String value) {
            addCriterion("professor_name not like", value, "professorName");
            return (Criteria) this;
        }

        public Criteria andProfessorNameIn(List<String> values) {
            addCriterion("professor_name in", values, "professorName");
            return (Criteria) this;
        }

        public Criteria andProfessorNameNotIn(List<String> values) {
            addCriterion("professor_name not in", values, "professorName");
            return (Criteria) this;
        }

        public Criteria andProfessorNameBetween(String value1, String value2) {
            addCriterion("professor_name between", value1, value2, "professorName");
            return (Criteria) this;
        }

        public Criteria andProfessorNameNotBetween(String value1, String value2) {
            addCriterion("professor_name not between", value1, value2, "professorName");
            return (Criteria) this;
        }

        public Criteria andProfessorPositionIsNull() {
            addCriterion("professor_position is null");
            return (Criteria) this;
        }

        public Criteria andProfessorPositionIsNotNull() {
            addCriterion("professor_position is not null");
            return (Criteria) this;
        }

        public Criteria andProfessorPositionEqualTo(String value) {
            addCriterion("professor_position =", value, "professorPosition");
            return (Criteria) this;
        }

        public Criteria andProfessorPositionNotEqualTo(String value) {
            addCriterion("professor_position <>", value, "professorPosition");
            return (Criteria) this;
        }

        public Criteria andProfessorPositionGreaterThan(String value) {
            addCriterion("professor_position >", value, "professorPosition");
            return (Criteria) this;
        }

        public Criteria andProfessorPositionGreaterThanOrEqualTo(String value) {
            addCriterion("professor_position >=", value, "professorPosition");
            return (Criteria) this;
        }

        public Criteria andProfessorPositionLessThan(String value) {
            addCriterion("professor_position <", value, "professorPosition");
            return (Criteria) this;
        }

        public Criteria andProfessorPositionLessThanOrEqualTo(String value) {
            addCriterion("professor_position <=", value, "professorPosition");
            return (Criteria) this;
        }

        public Criteria andProfessorPositionLike(String value) {
            addCriterion("professor_position like", value, "professorPosition");
            return (Criteria) this;
        }

        public Criteria andProfessorPositionNotLike(String value) {
            addCriterion("professor_position not like", value, "professorPosition");
            return (Criteria) this;
        }

        public Criteria andProfessorPositionIn(List<String> values) {
            addCriterion("professor_position in", values, "professorPosition");
            return (Criteria) this;
        }

        public Criteria andProfessorPositionNotIn(List<String> values) {
            addCriterion("professor_position not in", values, "professorPosition");
            return (Criteria) this;
        }

        public Criteria andProfessorPositionBetween(String value1, String value2) {
            addCriterion("professor_position between", value1, value2, "professorPosition");
            return (Criteria) this;
        }

        public Criteria andProfessorPositionNotBetween(String value1, String value2) {
            addCriterion("professor_position not between", value1, value2, "professorPosition");
            return (Criteria) this;
        }

        public Criteria andProfessorYjfxIsNull() {
            addCriterion("professor_yjfx is null");
            return (Criteria) this;
        }

        public Criteria andProfessorYjfxIsNotNull() {
            addCriterion("professor_yjfx is not null");
            return (Criteria) this;
        }

        public Criteria andProfessorYjfxEqualTo(String value) {
            addCriterion("professor_yjfx =", value, "professorYjfx");
            return (Criteria) this;
        }

        public Criteria andProfessorYjfxNotEqualTo(String value) {
            addCriterion("professor_yjfx <>", value, "professorYjfx");
            return (Criteria) this;
        }

        public Criteria andProfessorYjfxGreaterThan(String value) {
            addCriterion("professor_yjfx >", value, "professorYjfx");
            return (Criteria) this;
        }

        public Criteria andProfessorYjfxGreaterThanOrEqualTo(String value) {
            addCriterion("professor_yjfx >=", value, "professorYjfx");
            return (Criteria) this;
        }

        public Criteria andProfessorYjfxLessThan(String value) {
            addCriterion("professor_yjfx <", value, "professorYjfx");
            return (Criteria) this;
        }

        public Criteria andProfessorYjfxLessThanOrEqualTo(String value) {
            addCriterion("professor_yjfx <=", value, "professorYjfx");
            return (Criteria) this;
        }

        public Criteria andProfessorYjfxLike(String value) {
            addCriterion("professor_yjfx like", value, "professorYjfx");
            return (Criteria) this;
        }

        public Criteria andProfessorYjfxNotLike(String value) {
            addCriterion("professor_yjfx not like", value, "professorYjfx");
            return (Criteria) this;
        }

        public Criteria andProfessorYjfxIn(List<String> values) {
            addCriterion("professor_yjfx in", values, "professorYjfx");
            return (Criteria) this;
        }

        public Criteria andProfessorYjfxNotIn(List<String> values) {
            addCriterion("professor_yjfx not in", values, "professorYjfx");
            return (Criteria) this;
        }

        public Criteria andProfessorYjfxBetween(String value1, String value2) {
            addCriterion("professor_yjfx between", value1, value2, "professorYjfx");
            return (Criteria) this;
        }

        public Criteria andProfessorYjfxNotBetween(String value1, String value2) {
            addCriterion("professor_yjfx not between", value1, value2, "professorYjfx");
            return (Criteria) this;
        }

        public Criteria andProfessorZlIsNull() {
            addCriterion("professor_zl is null");
            return (Criteria) this;
        }

        public Criteria andProfessorZlIsNotNull() {
            addCriterion("professor_zl is not null");
            return (Criteria) this;
        }

        public Criteria andProfessorZlEqualTo(String value) {
            addCriterion("professor_zl =", value, "professorZl");
            return (Criteria) this;
        }

        public Criteria andProfessorZlNotEqualTo(String value) {
            addCriterion("professor_zl <>", value, "professorZl");
            return (Criteria) this;
        }

        public Criteria andProfessorZlGreaterThan(String value) {
            addCriterion("professor_zl >", value, "professorZl");
            return (Criteria) this;
        }

        public Criteria andProfessorZlGreaterThanOrEqualTo(String value) {
            addCriterion("professor_zl >=", value, "professorZl");
            return (Criteria) this;
        }

        public Criteria andProfessorZlLessThan(String value) {
            addCriterion("professor_zl <", value, "professorZl");
            return (Criteria) this;
        }

        public Criteria andProfessorZlLessThanOrEqualTo(String value) {
            addCriterion("professor_zl <=", value, "professorZl");
            return (Criteria) this;
        }

        public Criteria andProfessorZlLike(String value) {
            addCriterion("professor_zl like", value, "professorZl");
            return (Criteria) this;
        }

        public Criteria andProfessorZlNotLike(String value) {
            addCriterion("professor_zl not like", value, "professorZl");
            return (Criteria) this;
        }

        public Criteria andProfessorZlIn(List<String> values) {
            addCriterion("professor_zl in", values, "professorZl");
            return (Criteria) this;
        }

        public Criteria andProfessorZlNotIn(List<String> values) {
            addCriterion("professor_zl not in", values, "professorZl");
            return (Criteria) this;
        }

        public Criteria andProfessorZlBetween(String value1, String value2) {
            addCriterion("professor_zl between", value1, value2, "professorZl");
            return (Criteria) this;
        }

        public Criteria andProfessorZlNotBetween(String value1, String value2) {
            addCriterion("professor_zl not between", value1, value2, "professorZl");
            return (Criteria) this;
        }

        public Criteria andProfessorPictureIsNull() {
            addCriterion("professor_picture is null");
            return (Criteria) this;
        }

        public Criteria andProfessorPictureIsNotNull() {
            addCriterion("professor_picture is not null");
            return (Criteria) this;
        }

        public Criteria andProfessorPictureEqualTo(String value) {
            addCriterion("professor_picture =", value, "professorPicture");
            return (Criteria) this;
        }

        public Criteria andProfessorPictureNotEqualTo(String value) {
            addCriterion("professor_picture <>", value, "professorPicture");
            return (Criteria) this;
        }

        public Criteria andProfessorPictureGreaterThan(String value) {
            addCriterion("professor_picture >", value, "professorPicture");
            return (Criteria) this;
        }

        public Criteria andProfessorPictureGreaterThanOrEqualTo(String value) {
            addCriterion("professor_picture >=", value, "professorPicture");
            return (Criteria) this;
        }

        public Criteria andProfessorPictureLessThan(String value) {
            addCriterion("professor_picture <", value, "professorPicture");
            return (Criteria) this;
        }

        public Criteria andProfessorPictureLessThanOrEqualTo(String value) {
            addCriterion("professor_picture <=", value, "professorPicture");
            return (Criteria) this;
        }

        public Criteria andProfessorPictureLike(String value) {
            addCriterion("professor_picture like", value, "professorPicture");
            return (Criteria) this;
        }

        public Criteria andProfessorPictureNotLike(String value) {
            addCriterion("professor_picture not like", value, "professorPicture");
            return (Criteria) this;
        }

        public Criteria andProfessorPictureIn(List<String> values) {
            addCriterion("professor_picture in", values, "professorPicture");
            return (Criteria) this;
        }

        public Criteria andProfessorPictureNotIn(List<String> values) {
            addCriterion("professor_picture not in", values, "professorPicture");
            return (Criteria) this;
        }

        public Criteria andProfessorPictureBetween(String value1, String value2) {
            addCriterion("professor_picture between", value1, value2, "professorPicture");
            return (Criteria) this;
        }

        public Criteria andProfessorPictureNotBetween(String value1, String value2) {
            addCriterion("professor_picture not between", value1, value2, "professorPicture");
            return (Criteria) this;
        }

        public Criteria andProfessorCategoryIsNull() {
            addCriterion("professor_category is null");
            return (Criteria) this;
        }

        public Criteria andProfessorCategoryIsNotNull() {
            addCriterion("professor_category is not null");
            return (Criteria) this;
        }

        public Criteria andProfessorCategoryEqualTo(String value) {
            addCriterion("professor_category =", value, "professorCategory");
            return (Criteria) this;
        }

        public Criteria andProfessorCategoryNotEqualTo(String value) {
            addCriterion("professor_category <>", value, "professorCategory");
            return (Criteria) this;
        }

        public Criteria andProfessorCategoryGreaterThan(String value) {
            addCriterion("professor_category >", value, "professorCategory");
            return (Criteria) this;
        }

        public Criteria andProfessorCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("professor_category >=", value, "professorCategory");
            return (Criteria) this;
        }

        public Criteria andProfessorCategoryLessThan(String value) {
            addCriterion("professor_category <", value, "professorCategory");
            return (Criteria) this;
        }

        public Criteria andProfessorCategoryLessThanOrEqualTo(String value) {
            addCriterion("professor_category <=", value, "professorCategory");
            return (Criteria) this;
        }

        public Criteria andProfessorCategoryLike(String value) {
            addCriterion("professor_category like", value, "professorCategory");
            return (Criteria) this;
        }

        public Criteria andProfessorCategoryNotLike(String value) {
            addCriterion("professor_category not like", value, "professorCategory");
            return (Criteria) this;
        }

        public Criteria andProfessorCategoryIn(List<String> values) {
            addCriterion("professor_category in", values, "professorCategory");
            return (Criteria) this;
        }

        public Criteria andProfessorCategoryNotIn(List<String> values) {
            addCriterion("professor_category not in", values, "professorCategory");
            return (Criteria) this;
        }

        public Criteria andProfessorCategoryBetween(String value1, String value2) {
            addCriterion("professor_category between", value1, value2, "professorCategory");
            return (Criteria) this;
        }

        public Criteria andProfessorCategoryNotBetween(String value1, String value2) {
            addCriterion("professor_category not between", value1, value2, "professorCategory");
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