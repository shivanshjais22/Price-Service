package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "yoyo")
public class Price {
    @Id
	 private Long productId;
	    public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	public double getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}
		private double basePrice;
	    private double discountPercent;
}
