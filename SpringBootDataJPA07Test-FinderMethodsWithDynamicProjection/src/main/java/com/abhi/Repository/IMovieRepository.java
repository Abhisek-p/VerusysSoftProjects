package com.abhi.Repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import com.abhi.Entity.Movie;
import com.abhi.View.View;

public interface IMovieRepository extends JpaRepository<Movie, Integer>{

	public <T extends View> List<T> findByMnameIn(List<Object> movies,Class<T> clazz);
	 public <T extends View> List<T> findByMnameStartingWith(String initChars,Class<T> clas);
	
}
