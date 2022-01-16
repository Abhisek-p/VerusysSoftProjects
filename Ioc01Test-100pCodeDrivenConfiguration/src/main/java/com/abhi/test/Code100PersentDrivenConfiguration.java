package com.abhi.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abhi.beans.WishMessageGenerator;
import com.abhi.cfgs.AppConfig;

public class Code100PersentDrivenConfiguration {

	public static void main(String[] args) {
    //create Ioc container 
	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	//get beans
	WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
	//invoke business logics
	String checking=generator.checkdate("Rebel Abhi");
	//display message
	System.out.println(checking);
		
		
	}

}
