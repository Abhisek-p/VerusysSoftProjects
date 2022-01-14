package com.abhi.Runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.abhi.Repository.IMovieRepository;
import com.abhi.View.ResultView1;
import com.abhi.View.ResultView2;
import com.abhi.View.ResultView3;

@Component
public class FinderMethodTest implements CommandLineRunner{
	
	@Autowired
	//Has-A relations
	private IMovieRepository repo;
	@Override
	public void run(String... args) throws Exception {
	System.out.println("=======================================FindByMnameIn========================================");	
     System.out.println("==========================");
     List<ResultView1> ll=repo.findByMnameIn(List.of("RRR","Antim"),ResultView1.class);
      for(ResultView1 rr:ll) {
    	  System.out.println(rr.getMid()+"        "+rr.getMname());
      }
      System.out.println("==========================");
      List<ResultView2> ll1=repo.findByMnameIn(List.of("RRR","Antim"),ResultView2.class);
     ll1.forEach(views->System.out.println(views.getMname()+"         "+views.getyear()+"          "+views.getRatings()));
     System.out.println("==========================");
     List<ResultView3> ll2=repo.findByMnameIn(List.of("RRR","Antim"),ResultView3.class);
     ll2.forEach(view->System.out.println(view.getMname()+"   "+view.getRatings()+"    "+view.getMid())); 
     System.out.println("==========================");
      
     System.out.println("=======================================FindByMnameStartingWith========================================");	
     List<ResultView2> lle=repo.findByMnameStartingWith("R", ResultView2.class);
      lle.forEach(results->System.out.println(results.getMname()+"      "+results.getyear()+"        "+results.getRatings()));
      
      
      
	}//runner
	}//class
