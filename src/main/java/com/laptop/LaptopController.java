package com.laptop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/laptop")
public class LaptopController {
	@Autowired
	LaptopService ls;
	@PostMapping(value="/setObj")
	public String setObj(@RequestBody Laptop l) {
		return ls.setObj(l);
	}
	@PostMapping(value="/setAllObj")
	public String setAllObj(@RequestBody List<Laptop> l) {
		return ls.setAllObj(l);
	}
	@GetMapping(value="getAllObj")
	public List<Laptop> getAllObj() {
		return ls.getAllObj();
	}
	@GetMapping(value="getById/{a}")
	public Laptop getById(@PathVariable int a) {
		return ls.getById(a);
		
	}
	@GetMapping(value="getByBrand/{b}")
	public List<Laptop> getByBrand(@PathVariable String c) {
		return ls.getByBrand(c);
	}

}
