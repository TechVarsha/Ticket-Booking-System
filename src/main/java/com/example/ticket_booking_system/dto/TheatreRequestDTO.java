package com.example.ticket_booking_system.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//()@
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TheatreRequestDTO {
	
	@NotBlank
	private String name;
	@NotBlank
	private String location;
	@NotBlank
	private String address;
}
//fk here we can use mapping for the many to one