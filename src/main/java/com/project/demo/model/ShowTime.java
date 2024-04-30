package com.project.demo.model;

import java.sql.Date;

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
public class ShowTime {
	
	@Id
	private int showTimeId;
	private int theatreId;
	private int movieId;
	private Date date;
	private String time;
	

}
