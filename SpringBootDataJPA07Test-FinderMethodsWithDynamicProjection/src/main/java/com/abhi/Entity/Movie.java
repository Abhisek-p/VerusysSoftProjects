package com.abhi.Entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;


@Entity
@Table(name="SPRING_MOVIE_TABLE")
public class Movie implements Serializable{

	@Id
	@Column(name="MID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer mid;
	@Column(name="MNAME",length = 20)
	private String mname;
	@Column(name="YEAR",length = 20)
	private String year;
	@Column(name="Ratings")
	private Float ratings;
	//constructor creates for mname,year,ratings
	public Movie(String mname, String year, Float ratings) {
		this.mname = mname;
		this.year = year;
		this.ratings = ratings;
	}
	public Movie() {
	}
	//setter and getter methods
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public Float getRatings() {
		return ratings;
	}
	public void setRatings(Float ratings) {
		this.ratings = ratings;
	}
	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", year=" + year + ", ratings=" + ratings + "]";
	}
	
	

	
}
