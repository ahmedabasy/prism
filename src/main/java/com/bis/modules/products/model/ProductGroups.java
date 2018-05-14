package com.bis.modules.products.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product_Groups", schema = "dbo", catalog = "ahmed_bisdblic")
public class ProductGroups implements Serializable{
	private static final long serialVersionUID = 3325345447501427816L;
	
	@Id
	@Column(name = "Group_ID", length = 10, nullable = false)
	private int groupId;
	
	@Column(name = "Group_AR", length = 400, nullable = false)
	private String groupAr;
	
	@Column(name = "Group_En", length = 400, nullable = false)
	private String groupEn;
	
	@Column(name = "GroupComment_Ar", length = 400, nullable = false)
	private String groupCommentAr;
	
	@Column(name = "GroupComment_En", length = 400, nullable = false)
	private String groupCommentEn;
	
	@Column(name = "GroupProduct_Photo", length = 50, nullable = false)
	private String groupProductPhoto;
	
	@Column(name = "GroupPhoto_Com_En", length = 35, nullable = false)
	private String groupPhotoComEn;
	
	@Column(name = "GroupPhoto_Com_Ar", length = 35, nullable = false)
	private String groupPhotoComAr;
	
	@Column(name = "GroupSpecification_AR", length = 400, nullable = false)
	private String groupSpecificationAr;
	
	@Column(name = "GroupSpecification_En", length = 400, nullable = false)
	private String groupSpecificationEn;
	
	@Column(name = "Parent_ID", length = 10, nullable = false)
	private int parentId;
	
	@Column(name = "ISActive", nullable = false)
	private boolean isActive;
	
	@Column(name = "Pr_order", length = 10, nullable = false)
	private int prOrder;
	
	@Column(name = "MenuLocation", length = 300, nullable = false)
	private String menuLocation;
	
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public String getGroupAr() {
		return groupAr;
	}
	public void setGroupAr(String groupAr) {
		this.groupAr = groupAr;
	}
	public String getGroupEn() {
		return groupEn;
	}
	public void setGroupEn(String groupEn) {
		this.groupEn = groupEn;
	}
	public String getGroupCommentAr() {
		return groupCommentAr;
	}
	public void setGroupCommentAr(String groupCommentAr) {
		this.groupCommentAr = groupCommentAr;
	}
	public String getGroupCommentEn() {
		return groupCommentEn;
	}
	public void setGroupCommentEn(String groupCommentEn) {
		this.groupCommentEn = groupCommentEn;
	}
	public String getGroupProductPhoto() {
		return groupProductPhoto;
	}
	public void setGroupProductPhoto(String groupProductPhoto) {
		this.groupProductPhoto = groupProductPhoto;
	}
	public String getGroupPhotoComEn() {
		return groupPhotoComEn;
	}
	public void setGroupPhotoComEn(String groupPhotoComEn) {
		this.groupPhotoComEn = groupPhotoComEn;
	}
	public String getGroupPhotoComAr() {
		return groupPhotoComAr;
	}
	public void setGroupPhotoComAr(String groupPhotoComAr) {
		this.groupPhotoComAr = groupPhotoComAr;
	}
	public String getGroupSpecificationAr() {
		return groupSpecificationAr;
	}
	public void setGroupSpecificationAr(String groupSpecificationAr) {
		this.groupSpecificationAr = groupSpecificationAr;
	}
	public String getGroupSpecificationEn() {
		return groupSpecificationEn;
	}
	public void setGroupSpecificationEn(String groupSpecificationEn) {
		this.groupSpecificationEn = groupSpecificationEn;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public int getPrOrder() {
		return prOrder;
	}
	public void setPrOrder(int prOrder) {
		this.prOrder = prOrder;
	}
	public String getMenuLocation() {
		return menuLocation;
	}
	public void setMenuLocation(String menuLocation) {
		this.menuLocation = menuLocation;
	}
}