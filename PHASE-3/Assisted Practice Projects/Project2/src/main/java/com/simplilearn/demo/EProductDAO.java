package com.simplilearn.demo;

import java.sql.ResultSet;    

import java.sql.SQLException;    
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;    
import org.springframework.jdbc.core.JdbcTemplate;    
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;     
//use autowire this EproductDao object to main controller
@Repository
public class EProductDAO {

		@Autowired
        JdbcTemplate template;    
        
        
        //setter method
        public void setTemplate(JdbcTemplate template) {    
            this.template = template;    
        }    
        
        public List<EProductEntity> getProducts(){    
            return template.query("select * from eproduct",new RowMapper<EProductEntity>(){    
                public EProductEntity mapRow(ResultSet rs, int row) throws SQLException {    
                        EProductEntity e=new EProductEntity();    
                    e.setID(rs.getInt(1));    
                    e.setFeedbacke(rs.getString(2));    
                    e.setUser_email(rs.getString(3));    
                    e.setTime(rs.getDate(4));    
                    return e;    
                }    
            });    
        }  
        
        public int addProduct(EProductEntity product)
        {
        	return template.update("INSERT INTO response (ID, feedback, user_email,time) VALUES(?,?,?,?)",
        	        new Object[] { product.getID(),product.getFeedbacke(),product.getUser_email(),product.getTime()});
        }
        
        
}
