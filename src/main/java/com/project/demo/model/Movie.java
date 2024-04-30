package com.project.demo.model;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Entity
public class Movie {
	
	@Id
	private int MovieID;
	private String title;
	private String duration;
	private Date releaseDate;
	private String language;
	private String genre;
	
	
	
	

}
