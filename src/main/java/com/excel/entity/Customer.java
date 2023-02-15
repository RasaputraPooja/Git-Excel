package com.excel.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_table")
public class Customer {
	
	  @Id
	    private Integer customerId;
	    private String Name;
	    private String country;
	    private Integer telephone;
		public Integer getCustomerId() {
			return customerId;
		}
		public void setCustomerId(Integer customerId) {
			this.customerId = customerId;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public Integer getTelephone() {
			return telephone;
		}
		public void setTelephone(Integer telephone) {
			this.telephone = telephone;
		}
	
	
	

}
