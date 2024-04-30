package com.project.demo.controller;


import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.model.ShowTime;
import com.project.demo.service.ShowService;



@RestController
public class AppController {
	
	@Autowired
	ShowService showService;
	
	
	@GetMapping("/shows")
    public List<ShowTime> fetchShowList(@RequestParam("title")String title,@RequestParam("city")String city,@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd" )Date date)
    {
		List<ShowTime> shows = showService.fetchAllShows(title,city,date);
		
		return shows;
    }
	
	@GetMapping("/movieID")
    public int getMovieID(@RequestParam("title")String title)
    {
		int ans = showService.getMovieIdByName(title);
		//HashMap<String,Integer> map = new HashMap<>();
		//map.put("movie id", ans);
       return ans;
    }
	

}
