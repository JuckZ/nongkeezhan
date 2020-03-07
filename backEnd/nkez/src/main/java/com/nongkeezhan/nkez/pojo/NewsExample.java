package com.nongkeezhan.nkez.pojo;

import java.util.ArrayList;
import java.util.List;

public class NewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsExample() {
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

        public Criteria andNewsIdIsNull() {
            addCriterion("news_id is null");
            return (Criteria) this;
        }

        public Criteria andNewsIdIsNotNull() {
            addCriterion("news_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewsIdEqualTo(String value) {
            addCriterion("news_id =", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotEqualTo(String value) {
            addCriterion("news_id <>", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThan(String value) {
            addCriterion("news_id >", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThanOrEqualTo(String value) {
            addCriterion("news_id >=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThan(String value) {
            addCriterion("news_id <", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThanOrEqualTo(String value) {
            addCriterion("news_id <=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLike(String value) {
            addCriterion("news_id like", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotLike(String value) {
            addCriterion("news_id not like", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdIn(List<String> values) {
            addCriterion("news_id in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotIn(List<String> values) {
            addCriterion("news_id not in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdBetween(String value1, String value2) {
            addCriterion("news_id between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotBetween(String value1, String value2) {
            addCriterion("news_id not between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNull() {
            addCriterion("news_title is null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNotNull() {
            addCriterion("news_title is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleEqualTo(String value) {
            addCriterion("news_title =", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotEqualTo(String value) {
            addCriterion("news_title <>", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThan(String value) {
            addCriterion("news_title >", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("news_title >=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThan(String value) {
            addCriterion("news_title <", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThanOrEqualTo(String value) {
            addCriterion("news_title <=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLike(String value) {
            addCriterion("news_title like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotLike(String value) {
            addCriterion("news_title not like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIn(List<String> values) {
            addCriterion("news_title in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotIn(List<String> values) {
            addCriterion("news_title not in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleBetween(String value1, String value2) {
            addCriterion("news_title between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotBetween(String value1, String value2) {
            addCriterion("news_title not between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsBodyIsNull() {
            addCriterion("news_body is null");
            return (Criteria) this;
        }

        public Criteria andNewsBodyIsNotNull() {
            addCriterion("news_body is not null");
            return (Criteria) this;
        }

        public Criteria andNewsBodyEqualTo(String value) {
            addCriterion("news_body =", value, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyNotEqualTo(String value) {
            addCriterion("news_body <>", value, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyGreaterThan(String value) {
            addCriterion("news_body >", value, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyGreaterThanOrEqualTo(String value) {
            addCriterion("news_body >=", value, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyLessThan(String value) {
            addCriterion("news_body <", value, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyLessThanOrEqualTo(String value) {
            addCriterion("news_body <=", value, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyLike(String value) {
            addCriterion("news_body like", value, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyNotLike(String value) {
            addCriterion("news_body not like", value, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyIn(List<String> values) {
            addCriterion("news_body in", values, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyNotIn(List<String> values) {
            addCriterion("news_body not in", values, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyBetween(String value1, String value2) {
            addCriterion("news_body between", value1, value2, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyNotBetween(String value1, String value2) {
            addCriterion("news_body not between", value1, value2, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsPictureIsNull() {
            addCriterion("news_picture is null");
            return (Criteria) this;
        }

        public Criteria andNewsPictureIsNotNull() {
            addCriterion("news_picture is not null");
            return (Criteria) this;
        }

        public Criteria andNewsPictureEqualTo(String value) {
            addCriterion("news_picture =", value, "newsPicture");
            return (Criteria) this;
        }

        public Criteria andNewsPictureNotEqualTo(String value) {
            addCriterion("news_picture <>", value, "newsPicture");
            return (Criteria) this;
        }

        public Criteria andNewsPictureGreaterThan(String value) {
            addCriterion("news_picture >", value, "newsPicture");
            return (Criteria) this;
        }

        public Criteria andNewsPictureGreaterThanOrEqualTo(String value) {
            addCriterion("news_picture >=", value, "newsPicture");
            return (Criteria) this;
        }

        public Criteria andNewsPictureLessThan(String value) {
            addCriterion("news_picture <", value, "newsPicture");
            return (Criteria) this;
        }

        public Criteria andNewsPictureLessThanOrEqualTo(String value) {
            addCriterion("news_picture <=", value, "newsPicture");
            return (Criteria) this;
        }

        public Criteria andNewsPictureLike(String value) {
            addCriterion("news_picture like", value, "newsPicture");
            return (Criteria) this;
        }

        public Criteria andNewsPictureNotLike(String value) {
            addCriterion("news_picture not like", value, "newsPicture");
            return (Criteria) this;
        }

        public Criteria andNewsPictureIn(List<String> values) {
            addCriterion("news_picture in", values, "newsPicture");
            return (Criteria) this;
        }

        public Criteria andNewsPictureNotIn(List<String> values) {
            addCriterion("news_picture not in", values, "newsPicture");
            return (Criteria) this;
        }

        public Criteria andNewsPictureBetween(String value1, String value2) {
            addCriterion("news_picture between", value1, value2, "newsPicture");
            return (Criteria) this;
        }

        public Criteria andNewsPictureNotBetween(String value1, String value2) {
            addCriterion("news_picture not between", value1, value2, "newsPicture");
            return (Criteria) this;
        }

        public Criteria andNewsSourceIsNull() {
            addCriterion("news_source is null");
            return (Criteria) this;
        }

        public Criteria andNewsSourceIsNotNull() {
            addCriterion("news_source is not null");
            return (Criteria) this;
        }

        public Criteria andNewsSourceEqualTo(String value) {
            addCriterion("news_source =", value, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceNotEqualTo(String value) {
            addCriterion("news_source <>", value, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceGreaterThan(String value) {
            addCriterion("news_source >", value, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceGreaterThanOrEqualTo(String value) {
            addCriterion("news_source >=", value, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceLessThan(String value) {
            addCriterion("news_source <", value, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceLessThanOrEqualTo(String value) {
            addCriterion("news_source <=", value, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceLike(String value) {
            addCriterion("news_source like", value, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceNotLike(String value) {
            addCriterion("news_source not like", value, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceIn(List<String> values) {
            addCriterion("news_source in", values, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceNotIn(List<String> values) {
            addCriterion("news_source not in", values, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceBetween(String value1, String value2) {
            addCriterion("news_source between", value1, value2, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceNotBetween(String value1, String value2) {
            addCriterion("news_source not between", value1, value2, "newsSource");
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