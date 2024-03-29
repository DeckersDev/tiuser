package com.deckers.tiusers.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;

@Entity
public class Manager {
	@Id
	   @GeneratedValue(strategy=GenerationType.AUTO)
	 private long userid;
	 @NotBlank(message = "Firstname is mandatory")
		
	    private String Firstname;
		 
		 @NotBlank(message = "Lastname is mandatory") 
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
		  @Override
		  public String toString() {
		        return "Billionaires{" + "userid=" + userid + ", Firstname=" + Firstname +",Lastname =" +Lastname+ ", Title=" + Title+ '}';
		    }

}
