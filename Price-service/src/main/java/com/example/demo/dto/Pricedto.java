package com.example.demo.dto;

public class Pricedto {

	
	 private Long productId;
	    private double basePrice;
	    private double discountPercent;
	
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
	
	
}
