package com.fand.configuration.po;

import java.util.Date;

import javax.persistence.Id;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 字典类型
 * 
 * @author haitao.yao
 * 
 */
public class DictionaryTy implements java.io.Serializable {
	/**
	 * 版本号
	 */
	private static final long serialVersionUID = 539999874630642879L;

	/**
    * 标识
	 */
	public static final String ID_ = "id";

	/**
    * 父标识
	 */
	public static final String PARENT_ID_ = "parentId";

	/**
    * 排序号
	 */
	public static final String ORDER_ = "order";

	/**
    * 结束时间
	 */
	public static final String END_TI_ = "endTi";

	/**
    * 名称
	 */
	public static final String NAME_ = "name";

	/**
    * 编号
	 */
	public static final String CODE_ = "code";

	/**
    * 开始时间
	 */
	public static final String BEGIN_TI_ = "beginTi";

	/**
    * 标识
    */
	@Id
	String id;

	/**
    * 父标识
    */
	String parentId;

	/**
    * 排序号
    */
	Double order;

	/**
    * 结束时间
    */
	Date endTi;

	/**
    * 名称
    */
	String name;

	/**
    * 编号
    */
	String code;

	/**
    * 开始时间
    */
	Date beginTi;

	/**
     * 获取
     *
	 * @return 标识
	 */
	public String getId() {
		return this.id;
	}

	/**
     * 获取
     *
	 * @return 父标识
	 */
	public String getParentId() {
		return this.parentId;
	}

	/**
     * 获取
     *
	 * @return 排序号
	 */
	public Double getOrder() {
		return this.order;
	}

	/**
     * 获取
     *
	 * @return 结束时间
	 */
	public Date getEndTi() {
		return this.endTi;
	}

	/**
     * 获取
     *
	 * @return 名称
	 */
	public String getName() {
		return this.name;
	}

	/**
     * 获取
     *
	 * @return 编号
	 */
	public String getCode() {
		return this.code;
	}

	/**
     * 获取
     *
	 * @return 开始时间
	 */
	public Date getBeginTi() {
		return this.beginTi;
	}

	/**
	 * 设置
     *
	 * @param id
	 *            标识
	 */
	public DictionaryTy setId(String id) {
		this.id = id;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param parentId
	 *            父标识
	 */
	public DictionaryTy setParentId(String parentId) {
		this.parentId = parentId;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param order
	 *            排序号
	 */
	public DictionaryTy setOrder(Double order) {
		this.order = order;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param endTi
	 *            结束时间
	 */
	public DictionaryTy setEndTi(Date endTi) {
		this.endTi = endTi;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param name
	 *            名称
	 */
	public DictionaryTy setName(String name) {
		this.name = name;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param code
	 *            编号
	 */
	public DictionaryTy setCode(String code) {
		this.code = code;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param beginTi
	 *            开始时间
	 */
	public DictionaryTy setBeginTi(Date beginTi) {
		this.beginTi = beginTi;
		
		return this;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}