package com.project.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.project.demo.model.ShowTime;


@Service
public interface ShowService {
	
	List<ShowTime> fetchAllShows(String title,String city,Date date);
	
	int getMovieIdByName(String title);

}
