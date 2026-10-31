package com.example.ticket_booking_system.entity;

import org.hibernate.annotations.Audited.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//()@
@Entity
@Table(name="theaters")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Theatre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String name;
	private String location;
	private String address;
}
