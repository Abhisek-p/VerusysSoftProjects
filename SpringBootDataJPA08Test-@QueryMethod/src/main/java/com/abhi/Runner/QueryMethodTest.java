package com.abhi.Runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.abhi.Entity.Movie;
import com.abhi.Repository.IMovieRepository;

@Component
public class QueryMethodTest implements CommandLineRunner {

	@Autowired
	// Has-A relations
	private IMovieRepository repo;

	@Override
	public void run(String... args) throws Exception {
		try {
            System.out.println("================Entity Query Method Test=====================");
			List<Movie> lm = repo.findMnameAndMidBetween(10, 20);
			lm.forEach(result -> System.out.println(result));
			System.out.println("========================");
			List<Movie> lm1 = repo.findMovieDetailsByYear("2020", "2022");
			lm1.forEach(view -> System.out.println(view));
			System.out.println("========================");
			List<Movie> lm2 = repo.findAllMovieByTheirId(10, 30);
			lm2.forEach(System.out::println);
			System.out.println("========================");
			List<Movie> lm3 = repo.findMoviesByTheirNamesInDb("Antim", "RadheShyam", "98");
			lm3.forEach(System.out::println);
			System.out.println("=======Scalar Query Method Test(With Multiple Value)=================");
			repo.fetchMoviesSatisfyingOfRatingsAndYear(6.0f,"2021","2022","1999").forEach(lm4->{
				
				for(Object rr:lm4) 
					System.out.println(rr+" ");
				System.out.println( );
			});
			
			repo.gettingRecordsWithSatisfyingMid(30, 8.0f).forEach(result->System.out.println(result));
			System.out.println("========================");
			System.out.println("=======Scalar Query Method Test(With Single Value)=================");
            String result=repo.findMnameById(29);		
			System.out.println(result);
			
			
			
			
			

		} // try
		catch (DataAccessException e) {
			e.printStackTrace();

		}

	}// runner
}// class
