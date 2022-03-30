package com.simplilearn.demo.Handling_user_authentication;

import java.math.BigDecimal;
import java.util.Date;

public class EproductEntity {

	///id, feedback,user_email,date///
        private long customer_id;
        private String customer_name;
        private String customer_emailid;
        private String customer_password;
        
        public long getcustomer_id() {return this.customer_id; }
        public String getcustomer_name() { return this.customer_name;}
        public String getcustomer_emailid() { return this.customer_emailid;}
        public String getcustomer_password(){ return this.customer_password;}
        
        public void setcustomer_id(long id) { this.customer_id = id;}
        public void setcustomer_name(String name) { this.customer_name = name;}
        public void setcustomer_emailid(String emailid) { this.customer_emailid = emailid;}
        public void setcustomer_password(String password) { this.customer_password = password;}
		@Override
		public String toString() {
			return "EProductEntity [customer_id=" + customer_id + ", customer_name=" + customer_name + ", customer_emailid=" + customer_emailid + ", customer_password=" + customer_password
					+ "]";
		}
}
