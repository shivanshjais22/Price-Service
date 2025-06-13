package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dto.Pricedto;
import com.example.demo.model.Price;
import com.example.demo.repo.Pricerepo;

@org.springframework.stereotype.Service
public class PriceServiceimp implements Service {

	
	@Autowired
	Pricerepo pricerepo;
	
	@Override
	public void saveprice(Pricedto dto) {
		
		Price p=from(dto);
		
		pricerepo.save(p);
		
		
	}
	
	public Price from(Pricedto dto) {
		
		Price p=new Price();
		p.setBasePrice(dto.getBasePrice());
		p.setDiscountPercent(dto.getDiscountPercent());
		p.setProductId(dto.getProductId());
		
		return p;
		
	}

	
	public Pricedto from(Price p) {
		
	Pricedto p1=new Pricedto();
	
	p1.setBasePrice(p.getBasePrice());
	p1.setDiscountPercent(p.getDiscountPercent());
	p1.setProductId(p.getProductId());	
	return p1;
		
	}
	
	@Override
	public Pricedto getprice(Long productId) {

		Price p=pricerepo.findById(productId).orElse(null);
		if(p==null) return null;
		
		
		
		return from(p);
	}

	@Override
	public double getDiscountedPrice(Long productId) {
		 
		Price price = pricerepo.findById(productId).orElse(null);
	        if (price == null) return 0.0;
	        double discount = price.getBasePrice() * (price.getDiscountPercent() / 100.0);
	        return price.getBasePrice() - discount;
	}


}
