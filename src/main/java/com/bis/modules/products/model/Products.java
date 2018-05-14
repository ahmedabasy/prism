package com.bis.modules.products.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Products", schema = "dbo", catalog = "ahmed_bisdblic")
public class Products implements Serializable {
	private static final long serialVersionUID = -5678506187660343650L;
	
	@Id
	@Column(name = "Product_ID", length = 10, nullable = false)
	private Integer productId;
	
	@Column(name = "Name_AR", length = 255, nullable = true)
	private String nameAr;
	
	@Column(name = "Name_En", length = 255, nullable = true)
	private String nameEn;
	
	@Column(name = "Comment_Ar", nullable = true)
	private String commentAr;
	
	@Column(name = "Comment_En", nullable = true)
	private String commentEn;
	
	@Column(name = "Product_Photo", length = 255, nullable = true)
	private String productPhoto;
	
	@Column(name = "Photo_Com_En", length = 255, nullable = true) 
	private String photoComEn;
	
	@Column(name = "Photo_Com_Ar", length = 255, nullable = true)
	private String photoComAr;
	
	@Column(name = "Specification_AR", nullable = true)
	private String specificationAr;
	
	@Column(name = "Specification_En", nullable = true)
	private String specificationEn;
	
	@Column(name = "Serial", length = 255, nullable = true) 
	private String serial;
	
	@Column(name = "visible", nullable = true)
	private Boolean visible;
	
	@Column(name = "Pr_order", length = 10, nullable = true)
	private Integer prOrder;
	
	@Column(name = "Group_ID", length = 10, nullable = true)
	private Integer groupId;
	
	@Column(name = "Description", nullable = true)
	private String description;
	
	@Column(name = "Price", length = 19, nullable = true)
	private Float price;

	public int getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getNameAr() {
		return nameAr;
	}

	public void setNameAr(String nameAr) {
		this.nameAr = nameAr;
	}

	public String getNameEn() {
		return nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	public String getCommentAr() {
		return commentAr;
	}

	public void setCommentAr(String commentAr) {
		this.commentAr = commentAr;
	}

	public String getCommentEn() {
		return commentEn;
	}

	public void setCommentEn(String commentEn) {
		this.commentEn = commentEn;
	}

	public String getProductPhoto() {
		return productPhoto;
	}

	public void setProductPhoto(String productPhoto) {
		this.productPhoto = productPhoto;
	}

	public String getPhotoComEn() {
		return photoComEn;
	}

	public void setPhotoComEn(String photoComEn) {
		this.photoComEn = photoComEn;
	}

	public String getPhotoComAr() {
		return photoComAr;
	}

	public void setPhotoComAr(String photoComAr) {
		this.photoComAr = photoComAr;
	}

	public String getSpecificationAr() {
		return specificationAr;
	}

	public void setSpecificationAr(String specificationAr) {
		this.specificationAr = specificationAr;
	}

	public String getSpecificationEn() {
		return specificationEn;
	}

	public void setSpecificationEn(String specificationEn) {
		this.specificationEn = specificationEn;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	public int getPrOrder() {
		return prOrder;
	}

	public void setPrOrder(Integer prOrder) {
		this.prOrder = prOrder;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}
}