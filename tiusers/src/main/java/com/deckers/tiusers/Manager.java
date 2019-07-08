package com.deckers.tiusers;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

public class Manager {
	@Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
	 private int Userid;
	 @NotBlank(message = "first_name is mandatory")
		
	    private String Firstname;
		 
		 @NotBlank(message = "last_name is mandatory") 
		private String Lastname; 
		 @NotBlank(message = "Title is mandatory")
		    private String Title;
		public String getFirstname() {
			return Firstname;
		}
		public void setFirstname(String firstname) {
			Firstname = firstname;
		}
		public String getLastname() {
			return Lastname;
		}
		public void setLastname(String lastname) {
			Lastname = lastname;
		}
		public String getTitle() {
			return Title;
		}
		public void setTitle(String title) {
			Title = title;
		}
	/*
	 * @Override public String toString() { return "Billionaires{" + "id=" + id +
	 * ", first_name=" + first_name +",last_name =" +last_name+ ", career=" +
	 * career+ '}'; }
	 */		 
}
