package com.example.ticket_booking_system.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.ticket_booking_system.dto.MovieRequestDTO;
import com.example.ticket_booking_system.dto.MovieResponseDTO;
import com.example.ticket_booking_system.entity.Movie;
import com.example.ticket_booking_system.enums.MovieStatus;
import com.example.ticket_booking_system.repository.MovieRepository;

import lombok.RequiredArgsConstructor;

//()@
@Service
@RequiredArgsConstructor
public class MovieService {

	private final MovieRepository movieRepository;
	
	private final ModelMapper modelMapper;
	
	public 	MovieResponseDTO createMovie(MovieRequestDTO movieRequestDTO) {
		Movie movie = modelMapper.map(movieRequestDTO, Movie.class);
		movie.setStatus(MovieStatus.ACTIVE);
		Movie savedMovie = movieRepository.save(movie);
		return modelMapper.map(savedMovie, MovieResponseDTO.class);
		
	}
	//there are two types of map method in modelmapper so we can use secon map method to map the obj as a ref1 ref2 so for the update operation we can use this method and it will not modify any other attribute
	 //validated we can use for that particulatr class
	//valid we can use for a all methods
}
