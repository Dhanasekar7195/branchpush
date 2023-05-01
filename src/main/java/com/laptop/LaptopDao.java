package com.laptop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopDao {
	@Autowired
	LaptopRepository lr;

	public String setObj(Laptop l) {
		lr.save(l);
		return "saved";
	}

	public String setAllObj(List<Laptop> l) {
		lr.saveAll(l);
		return "success";
	}

	public List<Laptop> getAllObj() {
		return lr.findAll();
	}

	public Laptop getById(int a) {
		return lr.findById(a).get();
	}

	public List<Laptop> getByBrand(String c) {
		return lr.getByBrand(c);
	}
		
		
		
	}


