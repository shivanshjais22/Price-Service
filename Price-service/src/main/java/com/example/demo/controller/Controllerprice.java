package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Pricedto;
import com.example.demo.model.Price;
import com.example.demo.service.Service;

@RestController

@RequestMapping("/price")
public class Controllerprice {

	
	 @Autowired
	    private Service priceService;

	    @PostMapping
	    public String createPrice(@RequestBody Pricedto priceDTO) {
	        priceService.saveprice(priceDTO);
	        return "Price saved for Product ID: " + priceDTO.getProductId();
	    }

	    @GetMapping("/{productId}")
	    public Pricedto getPrice(@PathVariable Long productId) {
	        return priceService.getprice(productId);
	    }

	    @GetMapping("/discounted/{productId}")
	    public double getDiscountedPrice(@PathVariable Long productId) {
	        return priceService.getDiscountedPrice(productId);
	    }
	
}
