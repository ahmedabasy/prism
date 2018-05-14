package com.bis.modules.products.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product_Pic", schema = "dbo", catalog = "ahmed_bisdblic")
public class ProductPic implements Serializable{
	private static final long serialVersionUID = -2309665146545705693L;
	
	@Id
	@Column(name = "Pic_ID", length = 10, nullable = false)
	private int picId;
	
	@Column(name = "Pic_Name", length = 255, nullable = true)
	private String picName;
	
	@Column(name = "Product_ID", length = 10, nullable = true)
	private int productId;
	
	@Column(name = "Comment_Ar", length = 255, nullable = true)
	private String commentAr;
	
	@Column(name = "Comment_En", length = 255, nullable = true)
	private String commentEn;
	
	public int getPicId() {
		return picId;
	}
	public void setPicId(int picId) {
		this.picId = picId;
	}
	public String getPicName() {
		return picName;
	}
	public void setPicName(String picName) {
		this.picName = picName;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
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
}