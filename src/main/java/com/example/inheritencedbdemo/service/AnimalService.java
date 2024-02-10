package com.example.inheritencedbdemo.service;

import com.example.inheritencedbdemo.exception.AnimalNotFoundException;
import com.example.inheritencedbdemo.jpa.enitity.AnimalBase;
import com.example.inheritencedbdemo.jpa.repo.AnimalBaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AnimalService {

	private final AnimalBaseRepository animalBaseRepository;
	public AnimalBase findById(long id) {
		return animalBaseRepository.findById(id)
					   .orElseThrow(AnimalNotFoundException::new);
	}

	public AnimalBase save(AnimalBase animalBase) {
		return animalBaseRepository.save(animalBase);
	}
}
