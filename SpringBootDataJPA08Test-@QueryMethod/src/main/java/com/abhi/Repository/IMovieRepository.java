package com.abhi.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.abhi.Entity.Movie;

public interface IMovieRepository extends JpaRepository<Movie, Integer>{
	//The query which contains Entityname callled as Entity query
	
	//============== Entity Query====================================
	@Query("FROM Movie WHERE MID>=?1 AND MID<=?2")
	public List<Movie> findMnameAndMidBetween(Integer mid,Integer mid2);
	@Query("from Movie where year>=?1 and year<=?2")
	public List<Movie> findMovieDetailsByYear(String year1,String year2);
	@Query("from Movie where mid>=:min and mid<=:max")//Entity Query
	public List<Movie> findAllMovieByTheirId(Integer min,Integer max);
	@Query("from Movie where mname in(:name1,:name2,:name3)order by mname")
	public List<Movie> findMoviesByTheirNamesInDb(String name1,String name2,String name3);
	//======================Scalar Query(With Multiple Value)======================================
	@Query("select mid,mname,year from Movie where ratings>=:rat and year in(:y1,:y2,:y3)")
	public List<Object[]> fetchMoviesSatisfyingOfRatingsAndYear(Float rat,String y1,String y2,String y3);
	@Query("select mid,mname,ratings from Movie where mid<=:m1 and ratings<=:rating")
	public List<Object[]> gettingRecordsWithSatisfyingMid(Integer m1,Float rating);
	//======================Scalar Query(With Single Value)======================================
    @Query("select mname from Movie where mid=:id")
	public String findMnameById(Integer id);
	
}
