package com.project.demo.repository;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface MovieRepository {

	
	public int fetchMovieIdByMovieName(String title);
}
