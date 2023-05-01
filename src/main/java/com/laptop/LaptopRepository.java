package com.laptop;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface LaptopRepository extends JpaRepository<Laptop,Integer> {

	@Query(value = "select * from laptop_details where brand like ?", nativeQuery = true)
	List<Laptop> getByBrand(String c);
	

}
