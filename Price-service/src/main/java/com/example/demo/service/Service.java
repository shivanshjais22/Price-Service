package com.example.demo.service;

import com.example.demo.dto.Pricedto;
import com.example.demo.model.Price;

public interface Service {

	public void saveprice (Pricedto dto);
	
	public Pricedto getprice(Long productId);
	  
	public double getDiscountedPrice(Long productId);
}
