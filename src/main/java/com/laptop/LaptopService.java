package com.laptop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
	@Autowired
	LaptopDao ld;

	public String setObj(Laptop l) {
		return ld.setObj(l);
	}

	public String setAllObj(List<Laptop> l) {
		return ld.setAllObj(l);
	}

	public List<Laptop> getAllObj() {
		return ld.getAllObj();
	}

	public Laptop getById(int a) {
		return ld.getById(a);
		
		
	}

	public List<Laptop> getByBrand(String c) {
		return ld.getByBrand(c);
	}

	
	}


		
	
		
	


