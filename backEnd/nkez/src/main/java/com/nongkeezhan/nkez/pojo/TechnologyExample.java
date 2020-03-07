package com.nongkeezhan.nkez.pojo;

import java.util.ArrayList;
import java.util.List;

public class TechnologyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TechnologyExample() {
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

        public Criteria andTechologyIdIsNull() {
            addCriterion("techology_id is null");
            return (Criteria) this;
        }

        public Criteria andTechologyIdIsNotNull() {
            addCriterion("techology_id is not null");
            return (Criteria) this;
        }

        public Criteria andTechologyIdEqualTo(String value) {
            addCriterion("techology_id =", value, "techologyId");
            return (Criteria) this;
        }

        public Criteria andTechologyIdNotEqualTo(String value) {
            addCriterion("techology_id <>", value, "techologyId");
            return (Criteria) this;
        }

        public Criteria andTechologyIdGreaterThan(String value) {
            addCriterion("techology_id >", value, "techologyId");
            return (Criteria) this;
        }

        public Criteria andTechologyIdGreaterThanOrEqualTo(String value) {
            addCriterion("techology_id >=", value, "techologyId");
            return (Criteria) this;
        }

        public Criteria andTechologyIdLessThan(String value) {
            addCriterion("techology_id <", value, "techologyId");
            return (Criteria) this;
        }

        public Criteria andTechologyIdLessThanOrEqualTo(String value) {
            addCriterion("techology_id <=", value, "techologyId");
            return (Criteria) this;
        }

        public Criteria andTechologyIdLike(String value) {
            addCriterion("techology_id like", value, "techologyId");
            return (Criteria) this;
        }

        public Criteria andTechologyIdNotLike(String value) {
            addCriterion("techology_id not like", value, "techologyId");
            return (Criteria) this;
        }

        public Criteria andTechologyIdIn(List<String> values) {
            addCriterion("techology_id in", values, "techologyId");
            return (Criteria) this;
        }

        public Criteria andTechologyIdNotIn(List<String> values) {
            addCriterion("techology_id not in", values, "techologyId");
            return (Criteria) this;
        }

        public Criteria andTechologyIdBetween(String value1, String value2) {
            addCriterion("techology_id between", value1, value2, "techologyId");
            return (Criteria) this;
        }

        public Criteria andTechologyIdNotBetween(String value1, String value2) {
            addCriterion("techology_id not between", value1, value2, "techologyId");
            return (Criteria) this;
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

        public Criteria andTechologyTitleIsNull() {
            addCriterion("techology_title is null");
            return (Criteria) this;
        }

        public Criteria andTechologyTitleIsNotNull() {
            addCriterion("techology_title is not null");
            return (Criteria) this;
        }

        public Criteria andTechologyTitleEqualTo(String value) {
            addCriterion("techology_title =", value, "techologyTitle");
            return (Criteria) this;
        }

        public Criteria andTechologyTitleNotEqualTo(String value) {
            addCriterion("techology_title <>", value, "techologyTitle");
            return (Criteria) this;
        }

        public Criteria andTechologyTitleGreaterThan(String value) {
            addCriterion("techology_title >", value, "techologyTitle");
            return (Criteria) this;
        }

        public Criteria andTechologyTitleGreaterThanOrEqualTo(String value) {
            addCriterion("techology_title >=", value, "techologyTitle");
            return (Criteria) this;
        }

        public Criteria andTechologyTitleLessThan(String value) {
            addCriterion("techology_title <", value, "techologyTitle");
            return (Criteria) this;
        }

        public Criteria andTechologyTitleLessThanOrEqualTo(String value) {
            addCriterion("techology_title <=", value, "techologyTitle");
            return (Criteria) this;
        }

        public Criteria andTechologyTitleLike(String value) {
            addCriterion("techology_title like", value, "techologyTitle");
            return (Criteria) this;
        }

        public Criteria andTechologyTitleNotLike(String value) {
            addCriterion("techology_title not like", value, "techologyTitle");
            return (Criteria) this;
        }

        public Criteria andTechologyTitleIn(List<String> values) {
            addCriterion("techology_title in", values, "techologyTitle");
            return (Criteria) this;
        }

        public Criteria andTechologyTitleNotIn(List<String> values) {
            addCriterion("techology_title not in", values, "techologyTitle");
            return (Criteria) this;
        }

        public Criteria andTechologyTitleBetween(String value1, String value2) {
            addCriterion("techology_title between", value1, value2, "techologyTitle");
            return (Criteria) this;
        }

        public Criteria andTechologyTitleNotBetween(String value1, String value2) {
            addCriterion("techology_title not between", value1, value2, "techologyTitle");
            return (Criteria) this;
        }

        public Criteria andTechologyPictureIsNull() {
            addCriterion("techology_picture is null");
            return (Criteria) this;
        }

        public Criteria andTechologyPictureIsNotNull() {
            addCriterion("techology_picture is not null");
            return (Criteria) this;
        }

        public Criteria andTechologyPictureEqualTo(String value) {
            addCriterion("techology_picture =", value, "techologyPicture");
            return (Criteria) this;
        }

        public Criteria andTechologyPictureNotEqualTo(String value) {
            addCriterion("techology_picture <>", value, "techologyPicture");
            return (Criteria) this;
        }

        public Criteria andTechologyPictureGreaterThan(String value) {
            addCriterion("techology_picture >", value, "techologyPicture");
            return (Criteria) this;
        }

        public Criteria andTechologyPictureGreaterThanOrEqualTo(String value) {
            addCriterion("techology_picture >=", value, "techologyPicture");
            return (Criteria) this;
        }

        public Criteria andTechologyPictureLessThan(String value) {
            addCriterion("techology_picture <", value, "techologyPicture");
            return (Criteria) this;
        }

        public Criteria andTechologyPictureLessThanOrEqualTo(String value) {
            addCriterion("techology_picture <=", value, "techologyPicture");
            return (Criteria) this;
        }

        public Criteria andTechologyPictureLike(String value) {
            addCriterion("techology_picture like", value, "techologyPicture");
            return (Criteria) this;
        }

        public Criteria andTechologyPictureNotLike(String value) {
            addCriterion("techology_picture not like", value, "techologyPicture");
            return (Criteria) this;
        }

        public Criteria andTechologyPictureIn(List<String> values) {
            addCriterion("techology_picture in", values, "techologyPicture");
            return (Criteria) this;
        }

        public Criteria andTechologyPictureNotIn(List<String> values) {
            addCriterion("techology_picture not in", values, "techologyPicture");
            return (Criteria) this;
        }

        public Criteria andTechologyPictureBetween(String value1, String value2) {
            addCriterion("techology_picture between", value1, value2, "techologyPicture");
            return (Criteria) this;
        }

        public Criteria andTechologyPictureNotBetween(String value1, String value2) {
            addCriterion("techology_picture not between", value1, value2, "techologyPicture");
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