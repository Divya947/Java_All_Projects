package com.simplilearn.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MainController {

	@Autowired
	EProductDAO eproductDAO;
	@RequestMapping(value = "/listproduct", method = RequestMethod.GET)
	public List<EProductEntity> listProducts() {
		List<EProductEntity> list = eproductDAO.getProducts();
		return list;
	}

	@PostMapping("/addproduct")
	public String addProduct(@RequestBody EProductEntity entity) {
		if(eproductDAO.addProduct(entity)>0)
			return "Data Inserted";
		else
			return "error while Inserting DATA";
	}

}

