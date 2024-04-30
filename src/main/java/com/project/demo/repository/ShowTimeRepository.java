package com.project.demo.repository;


import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.project.demo.model.ShowTime;



@Mapper
public interface ShowTimeRepository {
	
	List<ShowTime> fetchAllShows(int movieId,String city,Date date);

}
