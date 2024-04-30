package com.project.demo.service;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.model.ShowTime;
import com.project.demo.repository.MovieRepository;
import com.project.demo.repository.ShowTimeRepository;



@Service
public class ShowServiceImpl implements ShowService {
	
	
	@Autowired
	ShowTimeRepository showRepository;
	
	
	@Autowired
	MovieRepository movieRepository;

	@Override
	public List<ShowTime> fetchAllShows(String title, String city,Date date) {
		int movieId = getMovieIdByName(title);
		
		List<ShowTime> ans = showRepository.fetchAllShows(movieId,city,date);
		return ans;
	}
	
	
	public int getMovieIdByName(String title) {
		int movieId = movieRepository.fetchMovieIdByMovieName(title);
		return movieId;
	}

}
