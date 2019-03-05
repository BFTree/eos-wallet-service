package it.etoken.base.model.market.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CoinsExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table coins
	 * @mbg.generated  Mon Aug 20 16:15:02 CST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table coins
	 * @mbg.generated  Mon Aug 20 16:15:02 CST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table coins
	 * @mbg.generated  Mon Aug 20 16:15:02 CST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table coins
	 * @mbg.generated  Mon Aug 20 16:15:02 CST 2018
	 */
	public CoinsExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table coins
	 * @mbg.generated  Mon Aug 20 16:15:02 CST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table coins
	 * @mbg.generated  Mon Aug 20 16:15:02 CST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table coins
	 * @mbg.generated  Mon Aug 20 16:15:02 CST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table coins
	 * @mbg.generated  Mon Aug 20 16:15:02 CST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table coins
	 * @mbg.generated  Mon Aug 20 16:15:02 CST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table coins
	 * @mbg.generated  Mon Aug 20 16:15:02 CST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table coins
	 * @mbg.generated  Mon Aug 20 16:15:02 CST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table coins
	 * @mbg.generated  Mon Aug 20 16:15:02 CST 2018
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table coins
	 * @mbg.generated  Mon Aug 20 16:15:02 CST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table coins
	 * @mbg.generated  Mon Aug 20 16:15:02 CST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table coins
	 * @mbg.generated  Mon Aug 20 16:15:02 CST 2018
	 */
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

		public Criteria andCreatedateIsNull() {
			addCriterion("createdate is null");
			return (Criteria) this;
		}

		public Criteria andCreatedateIsNotNull() {
			addCriterion("createdate is not null");
			return (Criteria) this;
		}

		public Criteria andCreatedateEqualTo(Date value) {
			addCriterion("createdate =", value, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateNotEqualTo(Date value) {
			addCriterion("createdate <>", value, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateGreaterThan(Date value) {
			addCriterion("createdate >", value, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
			addCriterion("createdate >=", value, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateLessThan(Date value) {
			addCriterion("createdate <", value, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateLessThanOrEqualTo(Date value) {
			addCriterion("createdate <=", value, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateIn(List<Date> values) {
			addCriterion("createdate in", values, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateNotIn(List<Date> values) {
			addCriterion("createdate not in", values, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateBetween(Date value1, Date value2) {
			addCriterion("createdate between", value1, value2, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateNotBetween(Date value1, Date value2) {
			addCriterion("createdate not between", value1, value2, "createdate");
			return (Criteria) this;
		}

		public Criteria andModifydateIsNull() {
			addCriterion("modifydate is null");
			return (Criteria) this;
		}

		public Criteria andModifydateIsNotNull() {
			addCriterion("modifydate is not null");
			return (Criteria) this;
		}

		public Criteria andModifydateEqualTo(Date value) {
			addCriterion("modifydate =", value, "modifydate");
			return (Criteria) this;
		}

		public Criteria andModifydateNotEqualTo(Date value) {
			addCriterion("modifydate <>", value, "modifydate");
			return (Criteria) this;
		}

		public Criteria andModifydateGreaterThan(Date value) {
			addCriterion("modifydate >", value, "modifydate");
			return (Criteria) this;
		}

		public Criteria andModifydateGreaterThanOrEqualTo(Date value) {
			addCriterion("modifydate >=", value, "modifydate");
			return (Criteria) this;
		}

		public Criteria andModifydateLessThan(Date value) {
			addCriterion("modifydate <", value, "modifydate");
			return (Criteria) this;
		}

		public Criteria andModifydateLessThanOrEqualTo(Date value) {
			addCriterion("modifydate <=", value, "modifydate");
			return (Criteria) this;
		}

		public Criteria andModifydateIn(List<Date> values) {
			addCriterion("modifydate in", values, "modifydate");
			return (Criteria) this;
		}

		public Criteria andModifydateNotIn(List<Date> values) {
			addCriterion("modifydate not in", values, "modifydate");
			return (Criteria) this;
		}

		public Criteria andModifydateBetween(Date value1, Date value2) {
			addCriterion("modifydate between", value1, value2, "modifydate");
			return (Criteria) this;
		}

		public Criteria andModifydateNotBetween(Date value1, Date value2) {
			addCriterion("modifydate not between", value1, value2, "modifydate");
			return (Criteria) this;
		}

		public Criteria andSiteIsNull() {
			addCriterion("site is null");
			return (Criteria) this;
		}

		public Criteria andSiteIsNotNull() {
			addCriterion("site is not null");
			return (Criteria) this;
		}

		public Criteria andSiteEqualTo(String value) {
			addCriterion("site =", value, "site");
			return (Criteria) this;
		}

		public Criteria andSiteNotEqualTo(String value) {
			addCriterion("site <>", value, "site");
			return (Criteria) this;
		}

		public Criteria andSiteGreaterThan(String value) {
			addCriterion("site >", value, "site");
			return (Criteria) this;
		}

		public Criteria andSiteGreaterThanOrEqualTo(String value) {
			addCriterion("site >=", value, "site");
			return (Criteria) this;
		}

		public Criteria andSiteLessThan(String value) {
			addCriterion("site <", value, "site");
			return (Criteria) this;
		}

		public Criteria andSiteLessThanOrEqualTo(String value) {
			addCriterion("site <=", value, "site");
			return (Criteria) this;
		}

		public Criteria andSiteLike(String value) {
			addCriterion("site like", value, "site");
			return (Criteria) this;
		}

		public Criteria andSiteNotLike(String value) {
			addCriterion("site not like", value, "site");
			return (Criteria) this;
		}

		public Criteria andSiteIn(List<String> values) {
			addCriterion("site in", values, "site");
			return (Criteria) this;
		}

		public Criteria andSiteNotIn(List<String> values) {
			addCriterion("site not in", values, "site");
			return (Criteria) this;
		}

		public Criteria andSiteBetween(String value1, String value2) {
			addCriterion("site between", value1, value2, "site");
			return (Criteria) this;
		}

		public Criteria andSiteNotBetween(String value1, String value2) {
			addCriterion("site not between", value1, value2, "site");
			return (Criteria) this;
		}

		public Criteria andIntrIsNull() {
			addCriterion("intr is null");
			return (Criteria) this;
		}

		public Criteria andIntrIsNotNull() {
			addCriterion("intr is not null");
			return (Criteria) this;
		}

		public Criteria andIntrEqualTo(String value) {
			addCriterion("intr =", value, "intr");
			return (Criteria) this;
		}

		public Criteria andIntrNotEqualTo(String value) {
			addCriterion("intr <>", value, "intr");
			return (Criteria) this;
		}

		public Criteria andIntrGreaterThan(String value) {
			addCriterion("intr >", value, "intr");
			return (Criteria) this;
		}

		public Criteria andIntrGreaterThanOrEqualTo(String value) {
			addCriterion("intr >=", value, "intr");
			return (Criteria) this;
		}

		public Criteria andIntrLessThan(String value) {
			addCriterion("intr <", value, "intr");
			return (Criteria) this;
		}

		public Criteria andIntrLessThanOrEqualTo(String value) {
			addCriterion("intr <=", value, "intr");
			return (Criteria) this;
		}

		public Criteria andIntrLike(String value) {
			addCriterion("intr like", value, "intr");
			return (Criteria) this;
		}

		public Criteria andIntrNotLike(String value) {
			addCriterion("intr not like", value, "intr");
			return (Criteria) this;
		}

		public Criteria andIntrIn(List<String> values) {
			addCriterion("intr in", values, "intr");
			return (Criteria) this;
		}

		public Criteria andIntrNotIn(List<String> values) {
			addCriterion("intr not in", values, "intr");
			return (Criteria) this;
		}

		public Criteria andIntrBetween(String value1, String value2) {
			addCriterion("intr between", value1, value2, "intr");
			return (Criteria) this;
		}

		public Criteria andIntrNotBetween(String value1, String value2) {
			addCriterion("intr not between", value1, value2, "intr");
			return (Criteria) this;
		}

		public Criteria andImgIsNull() {
			addCriterion("img is null");
			return (Criteria) this;
		}

		public Criteria andImgIsNotNull() {
			addCriterion("img is not null");
			return (Criteria) this;
		}

		public Criteria andImgEqualTo(String value) {
			addCriterion("img =", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgNotEqualTo(String value) {
			addCriterion("img <>", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgGreaterThan(String value) {
			addCriterion("img >", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgGreaterThanOrEqualTo(String value) {
			addCriterion("img >=", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgLessThan(String value) {
			addCriterion("img <", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgLessThanOrEqualTo(String value) {
			addCriterion("img <=", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgLike(String value) {
			addCriterion("img like", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgNotLike(String value) {
			addCriterion("img not like", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgIn(List<String> values) {
			addCriterion("img in", values, "img");
			return (Criteria) this;
		}

		public Criteria andImgNotIn(List<String> values) {
			addCriterion("img not in", values, "img");
			return (Criteria) this;
		}

		public Criteria andImgBetween(String value1, String value2) {
			addCriterion("img between", value1, value2, "img");
			return (Criteria) this;
		}

		public Criteria andImgNotBetween(String value1, String value2) {
			addCriterion("img not between", value1, value2, "img");
			return (Criteria) this;
		}

		public Criteria andTagIsNull() {
			addCriterion("tag is null");
			return (Criteria) this;
		}

		public Criteria andTagIsNotNull() {
			addCriterion("tag is not null");
			return (Criteria) this;
		}

		public Criteria andTagEqualTo(String value) {
			addCriterion("tag =", value, "tag");
			return (Criteria) this;
		}

		public Criteria andTagNotEqualTo(String value) {
			addCriterion("tag <>", value, "tag");
			return (Criteria) this;
		}

		public Criteria andTagGreaterThan(String value) {
			addCriterion("tag >", value, "tag");
			return (Criteria) this;
		}

		public Criteria andTagGreaterThanOrEqualTo(String value) {
			addCriterion("tag >=", value, "tag");
			return (Criteria) this;
		}

		public Criteria andTagLessThan(String value) {
			addCriterion("tag <", value, "tag");
			return (Criteria) this;
		}

		public Criteria andTagLessThanOrEqualTo(String value) {
			addCriterion("tag <=", value, "tag");
			return (Criteria) this;
		}

		public Criteria andTagLike(String value) {
			addCriterion("tag like", value, "tag");
			return (Criteria) this;
		}

		public Criteria andTagNotLike(String value) {
			addCriterion("tag not like", value, "tag");
			return (Criteria) this;
		}

		public Criteria andTagIn(List<String> values) {
			addCriterion("tag in", values, "tag");
			return (Criteria) this;
		}

		public Criteria andTagNotIn(List<String> values) {
			addCriterion("tag not in", values, "tag");
			return (Criteria) this;
		}

		public Criteria andTagBetween(String value1, String value2) {
			addCriterion("tag between", value1, value2, "tag");
			return (Criteria) this;
		}

		public Criteria andTagNotBetween(String value1, String value2) {
			addCriterion("tag not between", value1, value2, "tag");
			return (Criteria) this;
		}

		public Criteria andTotalIsNull() {
			addCriterion("total is null");
			return (Criteria) this;
		}

		public Criteria andTotalIsNotNull() {
			addCriterion("total is not null");
			return (Criteria) this;
		}

		public Criteria andTotalEqualTo(Long value) {
			addCriterion("total =", value, "total");
			return (Criteria) this;
		}

		public Criteria andTotalNotEqualTo(Long value) {
			addCriterion("total <>", value, "total");
			return (Criteria) this;
		}

		public Criteria andTotalGreaterThan(Long value) {
			addCriterion("total >", value, "total");
			return (Criteria) this;
		}

		public Criteria andTotalGreaterThanOrEqualTo(Long value) {
			addCriterion("total >=", value, "total");
			return (Criteria) this;
		}

		public Criteria andTotalLessThan(Long value) {
			addCriterion("total <", value, "total");
			return (Criteria) this;
		}

		public Criteria andTotalLessThanOrEqualTo(Long value) {
			addCriterion("total <=", value, "total");
			return (Criteria) this;
		}

		public Criteria andTotalIn(List<Long> values) {
			addCriterion("total in", values, "total");
			return (Criteria) this;
		}

		public Criteria andTotalNotIn(List<Long> values) {
			addCriterion("total not in", values, "total");
			return (Criteria) this;
		}

		public Criteria andTotalBetween(Long value1, Long value2) {
			addCriterion("total between", value1, value2, "total");
			return (Criteria) this;
		}

		public Criteria andTotalNotBetween(Long value1, Long value2) {
			addCriterion("total not between", value1, value2, "total");
			return (Criteria) this;
		}

		public Criteria andMarkeIsNull() {
			addCriterion("marke is null");
			return (Criteria) this;
		}

		public Criteria andMarkeIsNotNull() {
			addCriterion("marke is not null");
			return (Criteria) this;
		}

		public Criteria andMarkeEqualTo(Long value) {
			addCriterion("marke =", value, "marke");
			return (Criteria) this;
		}

		public Criteria andMarkeNotEqualTo(Long value) {
			addCriterion("marke <>", value, "marke");
			return (Criteria) this;
		}

		public Criteria andMarkeGreaterThan(Long value) {
			addCriterion("marke >", value, "marke");
			return (Criteria) this;
		}

		public Criteria andMarkeGreaterThanOrEqualTo(Long value) {
			addCriterion("marke >=", value, "marke");
			return (Criteria) this;
		}

		public Criteria andMarkeLessThan(Long value) {
			addCriterion("marke <", value, "marke");
			return (Criteria) this;
		}

		public Criteria andMarkeLessThanOrEqualTo(Long value) {
			addCriterion("marke <=", value, "marke");
			return (Criteria) this;
		}

		public Criteria andMarkeIn(List<Long> values) {
			addCriterion("marke in", values, "marke");
			return (Criteria) this;
		}

		public Criteria andMarkeNotIn(List<Long> values) {
			addCriterion("marke not in", values, "marke");
			return (Criteria) this;
		}

		public Criteria andMarkeBetween(Long value1, Long value2) {
			addCriterion("marke between", value1, value2, "marke");
			return (Criteria) this;
		}

		public Criteria andMarkeNotBetween(Long value1, Long value2) {
			addCriterion("marke not between", value1, value2, "marke");
			return (Criteria) this;
		}

		public Criteria andCodeIsNull() {
			addCriterion("code is null");
			return (Criteria) this;
		}

		public Criteria andCodeIsNotNull() {
			addCriterion("code is not null");
			return (Criteria) this;
		}

		public Criteria andCodeEqualTo(String value) {
			addCriterion("code =", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotEqualTo(String value) {
			addCriterion("code <>", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeGreaterThan(String value) {
			addCriterion("code >", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeGreaterThanOrEqualTo(String value) {
			addCriterion("code >=", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLessThan(String value) {
			addCriterion("code <", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLessThanOrEqualTo(String value) {
			addCriterion("code <=", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLike(String value) {
			addCriterion("code like", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotLike(String value) {
			addCriterion("code not like", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeIn(List<String> values) {
			addCriterion("code in", values, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotIn(List<String> values) {
			addCriterion("code not in", values, "code");
			return (Criteria) this;
		}

		public Criteria andCodeBetween(String value1, String value2) {
			addCriterion("code between", value1, value2, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotBetween(String value1, String value2) {
			addCriterion("code not between", value1, value2, "code");
			return (Criteria) this;
		}

		public Criteria andSymbleIsNull() {
			addCriterion("symble is null");
			return (Criteria) this;
		}

		public Criteria andSymbleIsNotNull() {
			addCriterion("symble is not null");
			return (Criteria) this;
		}

		public Criteria andSymbleEqualTo(String value) {
			addCriterion("symble =", value, "symble");
			return (Criteria) this;
		}

		public Criteria andSymbleNotEqualTo(String value) {
			addCriterion("symble <>", value, "symble");
			return (Criteria) this;
		}

		public Criteria andSymbleGreaterThan(String value) {
			addCriterion("symble >", value, "symble");
			return (Criteria) this;
		}

		public Criteria andSymbleGreaterThanOrEqualTo(String value) {
			addCriterion("symble >=", value, "symble");
			return (Criteria) this;
		}

		public Criteria andSymbleLessThan(String value) {
			addCriterion("symble <", value, "symble");
			return (Criteria) this;
		}

		public Criteria andSymbleLessThanOrEqualTo(String value) {
			addCriterion("symble <=", value, "symble");
			return (Criteria) this;
		}

		public Criteria andSymbleLike(String value) {
			addCriterion("symble like", value, "symble");
			return (Criteria) this;
		}

		public Criteria andSymbleNotLike(String value) {
			addCriterion("symble not like", value, "symble");
			return (Criteria) this;
		}

		public Criteria andSymbleIn(List<String> values) {
			addCriterion("symble in", values, "symble");
			return (Criteria) this;
		}

		public Criteria andSymbleNotIn(List<String> values) {
			addCriterion("symble not in", values, "symble");
			return (Criteria) this;
		}

		public Criteria andSymbleBetween(String value1, String value2) {
			addCriterion("symble between", value1, value2, "symble");
			return (Criteria) this;
		}

		public Criteria andSymbleNotBetween(String value1, String value2) {
			addCriterion("symble not between", value1, value2, "symble");
			return (Criteria) this;
		}

		public Criteria andContractAccountIsNull() {
			addCriterion("contract_account is null");
			return (Criteria) this;
		}

		public Criteria andContractAccountIsNotNull() {
			addCriterion("contract_account is not null");
			return (Criteria) this;
		}

		public Criteria andContractAccountEqualTo(String value) {
			addCriterion("contract_account =", value, "contractAccount");
			return (Criteria) this;
		}

		public Criteria andContractAccountNotEqualTo(String value) {
			addCriterion("contract_account <>", value, "contractAccount");
			return (Criteria) this;
		}

		public Criteria andContractAccountGreaterThan(String value) {
			addCriterion("contract_account >", value, "contractAccount");
			return (Criteria) this;
		}

		public Criteria andContractAccountGreaterThanOrEqualTo(String value) {
			addCriterion("contract_account >=", value, "contractAccount");
			return (Criteria) this;
		}

		public Criteria andContractAccountLessThan(String value) {
			addCriterion("contract_account <", value, "contractAccount");
			return (Criteria) this;
		}

		public Criteria andContractAccountLessThanOrEqualTo(String value) {
			addCriterion("contract_account <=", value, "contractAccount");
			return (Criteria) this;
		}

		public Criteria andContractAccountLike(String value) {
			addCriterion("contract_account like", value, "contractAccount");
			return (Criteria) this;
		}

		public Criteria andContractAccountNotLike(String value) {
			addCriterion("contract_account not like", value, "contractAccount");
			return (Criteria) this;
		}

		public Criteria andContractAccountIn(List<String> values) {
			addCriterion("contract_account in", values, "contractAccount");
			return (Criteria) this;
		}

		public Criteria andContractAccountNotIn(List<String> values) {
			addCriterion("contract_account not in", values, "contractAccount");
			return (Criteria) this;
		}

		public Criteria andContractAccountBetween(String value1, String value2) {
			addCriterion("contract_account between", value1, value2, "contractAccount");
			return (Criteria) this;
		}

		public Criteria andContractAccountNotBetween(String value1, String value2) {
			addCriterion("contract_account not between", value1, value2, "contractAccount");
			return (Criteria) this;
		}

		public Criteria andIsSupportMarketIsNull() {
			addCriterion("is_support_market is null");
			return (Criteria) this;
		}

		public Criteria andIsSupportMarketIsNotNull() {
			addCriterion("is_support_market is not null");
			return (Criteria) this;
		}

		public Criteria andIsSupportMarketEqualTo(String value) {
			addCriterion("is_support_market =", value, "isSupportMarket");
			return (Criteria) this;
		}

		public Criteria andIsSupportMarketNotEqualTo(String value) {
			addCriterion("is_support_market <>", value, "isSupportMarket");
			return (Criteria) this;
		}

		public Criteria andIsSupportMarketGreaterThan(String value) {
			addCriterion("is_support_market >", value, "isSupportMarket");
			return (Criteria) this;
		}

		public Criteria andIsSupportMarketGreaterThanOrEqualTo(String value) {
			addCriterion("is_support_market >=", value, "isSupportMarket");
			return (Criteria) this;
		}

		public Criteria andIsSupportMarketLessThan(String value) {
			addCriterion("is_support_market <", value, "isSupportMarket");
			return (Criteria) this;
		}

		public Criteria andIsSupportMarketLessThanOrEqualTo(String value) {
			addCriterion("is_support_market <=", value, "isSupportMarket");
			return (Criteria) this;
		}

		public Criteria andIsSupportMarketLike(String value) {
			addCriterion("is_support_market like", value, "isSupportMarket");
			return (Criteria) this;
		}

		public Criteria andIsSupportMarketNotLike(String value) {
			addCriterion("is_support_market not like", value, "isSupportMarket");
			return (Criteria) this;
		}

		public Criteria andIsSupportMarketIn(List<String> values) {
			addCriterion("is_support_market in", values, "isSupportMarket");
			return (Criteria) this;
		}

		public Criteria andIsSupportMarketNotIn(List<String> values) {
			addCriterion("is_support_market not in", values, "isSupportMarket");
			return (Criteria) this;
		}

		public Criteria andIsSupportMarketBetween(String value1, String value2) {
			addCriterion("is_support_market between", value1, value2, "isSupportMarket");
			return (Criteria) this;
		}

		public Criteria andIsSupportMarketNotBetween(String value1, String value2) {
			addCriterion("is_support_market not between", value1, value2, "isSupportMarket");
			return (Criteria) this;
		}

		public Criteria andPrecisionNumberIsNull() {
			addCriterion("precision_number is null");
			return (Criteria) this;
		}

		public Criteria andPrecisionNumberIsNotNull() {
			addCriterion("precision_number is not null");
			return (Criteria) this;
		}

		public Criteria andPrecisionNumberEqualTo(Integer value) {
			addCriterion("precision_number =", value, "precisionNumber");
			return (Criteria) this;
		}

		public Criteria andPrecisionNumberNotEqualTo(Integer value) {
			addCriterion("precision_number <>", value, "precisionNumber");
			return (Criteria) this;
		}

		public Criteria andPrecisionNumberGreaterThan(Integer value) {
			addCriterion("precision_number >", value, "precisionNumber");
			return (Criteria) this;
		}

		public Criteria andPrecisionNumberGreaterThanOrEqualTo(Integer value) {
			addCriterion("precision_number >=", value, "precisionNumber");
			return (Criteria) this;
		}

		public Criteria andPrecisionNumberLessThan(Integer value) {
			addCriterion("precision_number <", value, "precisionNumber");
			return (Criteria) this;
		}

		public Criteria andPrecisionNumberLessThanOrEqualTo(Integer value) {
			addCriterion("precision_number <=", value, "precisionNumber");
			return (Criteria) this;
		}

		public Criteria andPrecisionNumberIn(List<Integer> values) {
			addCriterion("precision_number in", values, "precisionNumber");
			return (Criteria) this;
		}

		public Criteria andPrecisionNumberNotIn(List<Integer> values) {
			addCriterion("precision_number not in", values, "precisionNumber");
			return (Criteria) this;
		}

		public Criteria andPrecisionNumberBetween(Integer value1, Integer value2) {
			addCriterion("precision_number between", value1, value2, "precisionNumber");
			return (Criteria) this;
		}

		public Criteria andPrecisionNumberNotBetween(Integer value1, Integer value2) {
			addCriterion("precision_number not between", value1, value2, "precisionNumber");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table coins
	 * @mbg.generated  Mon Aug 20 16:15:02 CST 2018
	 */
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table coins
     *
     * @mbg.generated do_not_delete_during_merge Mon Jul 02 20:08:32 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}