package com.simplilearn.demo.Handling_user_authentication;

import java.sql.JDBCType;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;

import javax.xml.transform.Templates;

import org.springframework.stereotype.Repository;

import junit.runner.Sorter.Swapper;

//use attire this EproductDao object to main controller

public class EproductDAO<template> {

	private static final String BeanPropertyRowMapper = null;
	@Autowired
	JDBCType template;

	// setter method
	public void setTemplate(JDBCType template) {
		this.template = template;
	}

	public List<EproductEntity> getProducts() {
		return template.query("select * from customer", new Swapper() {
			public EproductEntity mapRow(ResultSet rs, int row) throws SQLException {
				EproductEntity e = new EproductEntity();
				e.setcustomer_id(rs.getInt(1));
				e.setcustomer_name(rs.getString(2));
				e.setcustomer_emailid(rs.getString(2));
				e.setcustomer_password(rs.getString(2));
				return e;
			}
		});
	}

	public int addProduct(EproductEntity product) {
		return Templates.update("INSERT INTO customer (customer_id, customer_name, customer_emailid,customer_password) VALUES(?,?,?,?)",
				new Object[] { product.getcustomer_id(), product.getcustomer_name(), product.getcustomer_emailid(), product.getcustomer_password() });
	}

	public EproductEntity getByName(String customer_name) {
		EproductEntity entity = Templates.queryForObject("select * from customer where name=?",
				BeanPropertyRowMapper.newInstance(EproductEntity.class), customer_name);
		return entity;
	}
}
