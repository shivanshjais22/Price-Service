package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Price;

public interface Pricerepo  extends JpaRepository<Price,Long>{

}