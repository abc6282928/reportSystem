package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReportYieldExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportYieldExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andMessageIdIsNull() {
            addCriterion("message_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNotNull() {
            addCriterion("message_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageIdEqualTo(String value) {
            addCriterion("message_id =", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotEqualTo(String value) {
            addCriterion("message_id <>", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThan(String value) {
            addCriterion("message_id >", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThanOrEqualTo(String value) {
            addCriterion("message_id >=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThan(String value) {
            addCriterion("message_id <", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThanOrEqualTo(String value) {
            addCriterion("message_id <=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLike(String value) {
            addCriterion("message_id like", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotLike(String value) {
            addCriterion("message_id not like", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdIn(List<String> values) {
            addCriterion("message_id in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotIn(List<String> values) {
            addCriterion("message_id not in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdBetween(String value1, String value2) {
            addCriterion("message_id between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotBetween(String value1, String value2) {
            addCriterion("message_id not between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andOperationIsNull() {
            addCriterion("operation is null");
            return (Criteria) this;
        }

        public Criteria andOperationIsNotNull() {
            addCriterion("operation is not null");
            return (Criteria) this;
        }

        public Criteria andOperationEqualTo(String value) {
            addCriterion("operation =", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotEqualTo(String value) {
            addCriterion("operation <>", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationGreaterThan(String value) {
            addCriterion("operation >", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationGreaterThanOrEqualTo(String value) {
            addCriterion("operation >=", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLessThan(String value) {
            addCriterion("operation <", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLessThanOrEqualTo(String value) {
            addCriterion("operation <=", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLike(String value) {
            addCriterion("operation like", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotLike(String value) {
            addCriterion("operation not like", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationIn(List<String> values) {
            addCriterion("operation in", values, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotIn(List<String> values) {
            addCriterion("operation not in", values, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationBetween(String value1, String value2) {
            addCriterion("operation between", value1, value2, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotBetween(String value1, String value2) {
            addCriterion("operation not between", value1, value2, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationFinishNoIsNull() {
            addCriterion("operation_finish_no is null");
            return (Criteria) this;
        }

        public Criteria andOperationFinishNoIsNotNull() {
            addCriterion("operation_finish_no is not null");
            return (Criteria) this;
        }

        public Criteria andOperationFinishNoEqualTo(Integer value) {
            addCriterion("operation_finish_no =", value, "operationFinishNo");
            return (Criteria) this;
        }

        public Criteria andOperationFinishNoNotEqualTo(Integer value) {
            addCriterion("operation_finish_no <>", value, "operationFinishNo");
            return (Criteria) this;
        }

        public Criteria andOperationFinishNoGreaterThan(Integer value) {
            addCriterion("operation_finish_no >", value, "operationFinishNo");
            return (Criteria) this;
        }

        public Criteria andOperationFinishNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("operation_finish_no >=", value, "operationFinishNo");
            return (Criteria) this;
        }

        public Criteria andOperationFinishNoLessThan(Integer value) {
            addCriterion("operation_finish_no <", value, "operationFinishNo");
            return (Criteria) this;
        }

        public Criteria andOperationFinishNoLessThanOrEqualTo(Integer value) {
            addCriterion("operation_finish_no <=", value, "operationFinishNo");
            return (Criteria) this;
        }

        public Criteria andOperationFinishNoIn(List<Integer> values) {
            addCriterion("operation_finish_no in", values, "operationFinishNo");
            return (Criteria) this;
        }

        public Criteria andOperationFinishNoNotIn(List<Integer> values) {
            addCriterion("operation_finish_no not in", values, "operationFinishNo");
            return (Criteria) this;
        }

        public Criteria andOperationFinishNoBetween(Integer value1, Integer value2) {
            addCriterion("operation_finish_no between", value1, value2, "operationFinishNo");
            return (Criteria) this;
        }

        public Criteria andOperationFinishNoNotBetween(Integer value1, Integer value2) {
            addCriterion("operation_finish_no not between", value1, value2, "operationFinishNo");
            return (Criteria) this;
        }

        public Criteria andConfirmCountIsNull() {
            addCriterion("confirm_count is null");
            return (Criteria) this;
        }

        public Criteria andConfirmCountIsNotNull() {
            addCriterion("confirm_count is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmCountEqualTo(Integer value) {
            addCriterion("confirm_count =", value, "confirmCount");
            return (Criteria) this;
        }

        public Criteria andConfirmCountNotEqualTo(Integer value) {
            addCriterion("confirm_count <>", value, "confirmCount");
            return (Criteria) this;
        }

        public Criteria andConfirmCountGreaterThan(Integer value) {
            addCriterion("confirm_count >", value, "confirmCount");
            return (Criteria) this;
        }

        public Criteria andConfirmCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("confirm_count >=", value, "confirmCount");
            return (Criteria) this;
        }

        public Criteria andConfirmCountLessThan(Integer value) {
            addCriterion("confirm_count <", value, "confirmCount");
            return (Criteria) this;
        }

        public Criteria andConfirmCountLessThanOrEqualTo(Integer value) {
            addCriterion("confirm_count <=", value, "confirmCount");
            return (Criteria) this;
        }

        public Criteria andConfirmCountIn(List<Integer> values) {
            addCriterion("confirm_count in", values, "confirmCount");
            return (Criteria) this;
        }

        public Criteria andConfirmCountNotIn(List<Integer> values) {
            addCriterion("confirm_count not in", values, "confirmCount");
            return (Criteria) this;
        }

        public Criteria andConfirmCountBetween(Integer value1, Integer value2) {
            addCriterion("confirm_count between", value1, value2, "confirmCount");
            return (Criteria) this;
        }

        public Criteria andConfirmCountNotBetween(Integer value1, Integer value2) {
            addCriterion("confirm_count not between", value1, value2, "confirmCount");
            return (Criteria) this;
        }

        public Criteria andProductOrderIdIsNull() {
            addCriterion("product_order_id is null");
            return (Criteria) this;
        }

        public Criteria andProductOrderIdIsNotNull() {
            addCriterion("product_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductOrderIdEqualTo(String value) {
            addCriterion("product_order_id =", value, "productOrderId");
            return (Criteria) this;
        }

        public Criteria andProductOrderIdNotEqualTo(String value) {
            addCriterion("product_order_id <>", value, "productOrderId");
            return (Criteria) this;
        }

        public Criteria andProductOrderIdGreaterThan(String value) {
            addCriterion("product_order_id >", value, "productOrderId");
            return (Criteria) this;
        }

        public Criteria andProductOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("product_order_id >=", value, "productOrderId");
            return (Criteria) this;
        }

        public Criteria andProductOrderIdLessThan(String value) {
            addCriterion("product_order_id <", value, "productOrderId");
            return (Criteria) this;
        }

        public Criteria andProductOrderIdLessThanOrEqualTo(String value) {
            addCriterion("product_order_id <=", value, "productOrderId");
            return (Criteria) this;
        }

        public Criteria andProductOrderIdLike(String value) {
            addCriterion("product_order_id like", value, "productOrderId");
            return (Criteria) this;
        }

        public Criteria andProductOrderIdNotLike(String value) {
            addCriterion("product_order_id not like", value, "productOrderId");
            return (Criteria) this;
        }

        public Criteria andProductOrderIdIn(List<String> values) {
            addCriterion("product_order_id in", values, "productOrderId");
            return (Criteria) this;
        }

        public Criteria andProductOrderIdNotIn(List<String> values) {
            addCriterion("product_order_id not in", values, "productOrderId");
            return (Criteria) this;
        }

        public Criteria andProductOrderIdBetween(String value1, String value2) {
            addCriterion("product_order_id between", value1, value2, "productOrderId");
            return (Criteria) this;
        }

        public Criteria andProductOrderIdNotBetween(String value1, String value2) {
            addCriterion("product_order_id not between", value1, value2, "productOrderId");
            return (Criteria) this;
        }

        public Criteria andProcessDescribeIsNull() {
            addCriterion("process_describe is null");
            return (Criteria) this;
        }

        public Criteria andProcessDescribeIsNotNull() {
            addCriterion("process_describe is not null");
            return (Criteria) this;
        }

        public Criteria andProcessDescribeEqualTo(String value) {
            addCriterion("process_describe =", value, "processDescribe");
            return (Criteria) this;
        }

        public Criteria andProcessDescribeNotEqualTo(String value) {
            addCriterion("process_describe <>", value, "processDescribe");
            return (Criteria) this;
        }

        public Criteria andProcessDescribeGreaterThan(String value) {
            addCriterion("process_describe >", value, "processDescribe");
            return (Criteria) this;
        }

        public Criteria andProcessDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("process_describe >=", value, "processDescribe");
            return (Criteria) this;
        }

        public Criteria andProcessDescribeLessThan(String value) {
            addCriterion("process_describe <", value, "processDescribe");
            return (Criteria) this;
        }

        public Criteria andProcessDescribeLessThanOrEqualTo(String value) {
            addCriterion("process_describe <=", value, "processDescribe");
            return (Criteria) this;
        }

        public Criteria andProcessDescribeLike(String value) {
            addCriterion("process_describe like", value, "processDescribe");
            return (Criteria) this;
        }

        public Criteria andProcessDescribeNotLike(String value) {
            addCriterion("process_describe not like", value, "processDescribe");
            return (Criteria) this;
        }

        public Criteria andProcessDescribeIn(List<String> values) {
            addCriterion("process_describe in", values, "processDescribe");
            return (Criteria) this;
        }

        public Criteria andProcessDescribeNotIn(List<String> values) {
            addCriterion("process_describe not in", values, "processDescribe");
            return (Criteria) this;
        }

        public Criteria andProcessDescribeBetween(String value1, String value2) {
            addCriterion("process_describe between", value1, value2, "processDescribe");
            return (Criteria) this;
        }

        public Criteria andProcessDescribeNotBetween(String value1, String value2) {
            addCriterion("process_describe not between", value1, value2, "processDescribe");
            return (Criteria) this;
        }

        public Criteria andCurrentYieldIsNull() {
            addCriterion("current_yield is null");
            return (Criteria) this;
        }

        public Criteria andCurrentYieldIsNotNull() {
            addCriterion("current_yield is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentYieldEqualTo(Integer value) {
            addCriterion("current_yield =", value, "currentYield");
            return (Criteria) this;
        }

        public Criteria andCurrentYieldNotEqualTo(Integer value) {
            addCriterion("current_yield <>", value, "currentYield");
            return (Criteria) this;
        }

        public Criteria andCurrentYieldGreaterThan(Integer value) {
            addCriterion("current_yield >", value, "currentYield");
            return (Criteria) this;
        }

        public Criteria andCurrentYieldGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_yield >=", value, "currentYield");
            return (Criteria) this;
        }

        public Criteria andCurrentYieldLessThan(Integer value) {
            addCriterion("current_yield <", value, "currentYield");
            return (Criteria) this;
        }

        public Criteria andCurrentYieldLessThanOrEqualTo(Integer value) {
            addCriterion("current_yield <=", value, "currentYield");
            return (Criteria) this;
        }

        public Criteria andCurrentYieldIn(List<Integer> values) {
            addCriterion("current_yield in", values, "currentYield");
            return (Criteria) this;
        }

        public Criteria andCurrentYieldNotIn(List<Integer> values) {
            addCriterion("current_yield not in", values, "currentYield");
            return (Criteria) this;
        }

        public Criteria andCurrentYieldBetween(Integer value1, Integer value2) {
            addCriterion("current_yield between", value1, value2, "currentYield");
            return (Criteria) this;
        }

        public Criteria andCurrentYieldNotBetween(Integer value1, Integer value2) {
            addCriterion("current_yield not between", value1, value2, "currentYield");
            return (Criteria) this;
        }

        public Criteria andCurrentWasteIsNull() {
            addCriterion("current_waste is null");
            return (Criteria) this;
        }

        public Criteria andCurrentWasteIsNotNull() {
            addCriterion("current_waste is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentWasteEqualTo(Integer value) {
            addCriterion("current_waste =", value, "currentWaste");
            return (Criteria) this;
        }

        public Criteria andCurrentWasteNotEqualTo(Integer value) {
            addCriterion("current_waste <>", value, "currentWaste");
            return (Criteria) this;
        }

        public Criteria andCurrentWasteGreaterThan(Integer value) {
            addCriterion("current_waste >", value, "currentWaste");
            return (Criteria) this;
        }

        public Criteria andCurrentWasteGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_waste >=", value, "currentWaste");
            return (Criteria) this;
        }

        public Criteria andCurrentWasteLessThan(Integer value) {
            addCriterion("current_waste <", value, "currentWaste");
            return (Criteria) this;
        }

        public Criteria andCurrentWasteLessThanOrEqualTo(Integer value) {
            addCriterion("current_waste <=", value, "currentWaste");
            return (Criteria) this;
        }

        public Criteria andCurrentWasteIn(List<Integer> values) {
            addCriterion("current_waste in", values, "currentWaste");
            return (Criteria) this;
        }

        public Criteria andCurrentWasteNotIn(List<Integer> values) {
            addCriterion("current_waste not in", values, "currentWaste");
            return (Criteria) this;
        }

        public Criteria andCurrentWasteBetween(Integer value1, Integer value2) {
            addCriterion("current_waste between", value1, value2, "currentWaste");
            return (Criteria) this;
        }

        public Criteria andCurrentWasteNotBetween(Integer value1, Integer value2) {
            addCriterion("current_waste not between", value1, value2, "currentWaste");
            return (Criteria) this;
        }

        public Criteria andManufactureDateIsNull() {
            addCriterion("manufacture_date is null");
            return (Criteria) this;
        }

        public Criteria andManufactureDateIsNotNull() {
            addCriterion("manufacture_date is not null");
            return (Criteria) this;
        }

        public Criteria andManufactureDateEqualTo(Date value) {
            addCriterionForJDBCDate("manufacture_date =", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("manufacture_date <>", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateGreaterThan(Date value) {
            addCriterionForJDBCDate("manufacture_date >", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("manufacture_date >=", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateLessThan(Date value) {
            addCriterionForJDBCDate("manufacture_date <", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("manufacture_date <=", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateIn(List<Date> values) {
            addCriterionForJDBCDate("manufacture_date in", values, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("manufacture_date not in", values, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("manufacture_date between", value1, value2, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("manufacture_date not between", value1, value2, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andClassesIsNull() {
            addCriterion("classes is null");
            return (Criteria) this;
        }

        public Criteria andClassesIsNotNull() {
            addCriterion("classes is not null");
            return (Criteria) this;
        }

        public Criteria andClassesEqualTo(String value) {
            addCriterion("classes =", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotEqualTo(String value) {
            addCriterion("classes <>", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesGreaterThan(String value) {
            addCriterion("classes >", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesGreaterThanOrEqualTo(String value) {
            addCriterion("classes >=", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLessThan(String value) {
            addCriterion("classes <", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLessThanOrEqualTo(String value) {
            addCriterion("classes <=", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLike(String value) {
            addCriterion("classes like", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotLike(String value) {
            addCriterion("classes not like", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesIn(List<String> values) {
            addCriterion("classes in", values, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotIn(List<String> values) {
            addCriterion("classes not in", values, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesBetween(String value1, String value2) {
            addCriterion("classes between", value1, value2, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotBetween(String value1, String value2) {
            addCriterion("classes not between", value1, value2, "classes");
            return (Criteria) this;
        }

        public Criteria andAccountDateIsNull() {
            addCriterion("account_date is null");
            return (Criteria) this;
        }

        public Criteria andAccountDateIsNotNull() {
            addCriterion("account_date is not null");
            return (Criteria) this;
        }

        public Criteria andAccountDateEqualTo(Date value) {
            addCriterionForJDBCDate("account_date =", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("account_date <>", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateGreaterThan(Date value) {
            addCriterionForJDBCDate("account_date >", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("account_date >=", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateLessThan(Date value) {
            addCriterionForJDBCDate("account_date <", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("account_date <=", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateIn(List<Date> values) {
            addCriterionForJDBCDate("account_date in", values, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("account_date not in", values, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("account_date between", value1, value2, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("account_date not between", value1, value2, "accountDate");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIsNull() {
            addCriterion("message_type is null");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIsNotNull() {
            addCriterion("message_type is not null");
            return (Criteria) this;
        }

        public Criteria andMessageTypeEqualTo(String value) {
            addCriterion("message_type =", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotEqualTo(String value) {
            addCriterion("message_type <>", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeGreaterThan(String value) {
            addCriterion("message_type >", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("message_type >=", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeLessThan(String value) {
            addCriterion("message_type <", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeLessThanOrEqualTo(String value) {
            addCriterion("message_type <=", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeLike(String value) {
            addCriterion("message_type like", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotLike(String value) {
            addCriterion("message_type not like", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIn(List<String> values) {
            addCriterion("message_type in", values, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotIn(List<String> values) {
            addCriterion("message_type not in", values, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeBetween(String value1, String value2) {
            addCriterion("message_type between", value1, value2, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotBetween(String value1, String value2) {
            addCriterion("message_type not between", value1, value2, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("message like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("message not between", value1, value2, "message");
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