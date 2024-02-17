package com.example.inheritencedbdemo.service;

import com.example.inheritencedbdemo.exception.AnimalNotFoundException;
import com.example.inheritencedbdemo.jpa.repo.AnimalBaseRepository;
import com.example.inheritencedbdemo.mapper.AnimalMapper;
import lombok.RequiredArgsConstructor;
import org.openapitools.model.AnimalDto;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AnimalService {
	private final AnimalMapper animalMapper;
	private final AnimalBaseRepository animalBaseRepository;
	public AnimalDto findById(long id) {
		return animalMapper.mapFromEntity(animalBaseRepository.findById(id)
					   .orElseThrow(AnimalNotFoundException::new));
	}
}
