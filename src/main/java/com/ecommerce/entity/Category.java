package com.ecommerce.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity 
@Table(name="category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="category_id")
	private Long catId;
	
	@Column(name="category_name")
	private String catName;
	
	@Column(name="category_description")
	private String catDescription;
	
	@ManyToOne
	@JoinColumn(name = "FK_PARENT_CATEGORY")
	public Category parentCategory;
	
	@OneToMany(mappedBy="parentCategory", cascade = CascadeType.ALL)
	public List<Category> subCategories;
	
	
	@Temporal(TemporalType.DATE)
	@Column(name="created_date")
	private Date createdDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name="modified_date")
	private Date modifiedDate;
	
	@Column(name="created_by")
	private Integer createdBy;
	
	@Column(name="modified_by")
	private Integer modifiedBy;
	
	@Column(name="status")
	private Integer status;
	
	

	/**
	 * @return the parentCategory
	 */
	public Category getParentCategory() {
		return parentCategory;
	}

	/**
	 * @param parentCategory the parentCategory to set
	 */
	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
	}

	/**
	 * @return the subCategories
	 */
	public List<Category> getSubCategories() {
		return subCategories;
	}

	/**
	 * @param subCategories the subCategories to set
	 */
	public void setSubCategories(List<Category> subCategories) {
		this.subCategories = subCategories;
	}

	/**
	 * @return the catId
	 */
	public Long getCatId() {
		return catId;
	}

	/**
	 * @param catId the catId to set
	 */
	public void setCatId(Long catId) {
		this.catId = catId;
	}

	/**
	 * @return the catName
	 */
	public String getCatName() {
		return catName;
	}

	/**
	 * @param catName the catName to set
	 */
	public void setCatName(String catName) {
		this.catName = catName;
	}

	/**
	 * @return the catDescription
	 */
	public String getCatDescription() {
		return catDescription;
	}

	/**
	 * @param catDescription the catDescription to set
	 */
	public void setCatDescription(String catDescription) {
		this.catDescription = catDescription;
	}
	
	 

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the modifiedDate
	 */
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	/**
	 * @return the modifiedBy
	 */
	public Integer getModifiedBy() {
		return modifiedBy;
	}

	/**
	 * @param modifiedBy the modifiedBy to set
	 */
	public void setModifiedBy(Integer modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * @return the createdBy
	 */
	public Integer getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Category(Long catId, String catName, String catDescription) {
		super();
		this.catId = catId;
		this.catName = catName;
		this.catDescription = catDescription;
	}

	public Category() {
	
		// TODO Auto-generated constructor stub
	}
	
	


}
