package com.abhi.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	
	//Has-A property
	@Autowired
   private LocalDateTime ldt;
   
   public WishMessageGenerator() {
	   System.out.println("WishMessageGenerator.WishMessageGenerator() 0-param constr");
   }
   
   public String checkdate(String user) {
	   System.out.println("WishMessageGenerator.checkdate()");
	   int date=ldt.getHour();
	   //set logics for check hour
	   if(date<12) {
		   return "Good Moring "+user;
	   }
	   else if(date<15) {
		   return "Good AfterNoon "+user;
	   }
	   else {
		   return "Good Night "+user;
	   }
	   
   }//method

}//class
