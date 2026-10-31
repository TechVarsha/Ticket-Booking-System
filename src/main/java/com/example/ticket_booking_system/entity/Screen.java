package com.example.ticket_booking_system.entity;

import org.hibernate.annotations.Audited.Table;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//()@
@Entity
@Table(name ="screens")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Screen {
	
	private Long id;
	private String screen_name;
	private Integer total_seats;
	//annotation
	
	//private Theater theater;
}
