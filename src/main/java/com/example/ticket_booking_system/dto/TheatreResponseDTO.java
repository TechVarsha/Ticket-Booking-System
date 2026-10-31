package com.example.ticket_booking_system.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//()@
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TheatreResponseDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String name;
	private String location;
	private String address;
}
