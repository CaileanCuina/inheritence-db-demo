package com.example.inheritencedbdemo.controller;

import com.example.inheritencedbdemo.jpa.enitity.AnimalBase;
import com.example.inheritencedbdemo.service.AnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animal")
@RequiredArgsConstructor
public class AnimalController {


	private final AnimalService animalService;

	@GetMapping("/{id}")
	public AnimalBase findByName(@PathVariable long id) {
		return animalService.findById(id);
	}


	@PostMapping()
	@ResponseStatus(HttpStatus.OK)
	public AnimalBase updateAnimalBase( @RequestBody final AnimalBase animalBaseDto) {
		return animalService.save(animalBaseDto);
	}
}