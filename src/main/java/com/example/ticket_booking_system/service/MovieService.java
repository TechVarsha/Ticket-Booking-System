package com.example.ticket_booking_system.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.ticket_booking_system.dto.MovieRequestDTO;
import com.example.ticket_booking_system.dto.MovieResponseDTO;
import com.example.ticket_booking_system.entity.Movie;
import com.example.ticket_booking_system.enums.MovieStatus;
import com.example.ticket_booking_system.exception.ResourceNotFoundException;
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

	public List<MovieResponseDTO> getAllMovies() {
		List<Movie> movies = movieRepository.findAll();
		List<MovieResponseDTO> movieResponseDTOs = new ArrayList();
		for(Movie movie : movies) {
			movieResponseDTOs.add(modelMapper.map(movie,MovieResponseDTO.class));
		}
		//return movies
				//.stream()
				//.map(movie->modelMapper
						//.map(movie, MovieResponseDTO.class))
				//.toList();
		return movieResponseDTOs;
	}
	
	public MovieResponseDTO getMovieById(Long id) {
		Movie movie = movieRepository.findById(id).orElseThrow(
				() -> new  ResourceNotFoundException("Movie id "+id+" is not found"));
		return modelMapper.map(movie, MovieResponseDTO.class);
	}
	
	//we need to do lock 
}
