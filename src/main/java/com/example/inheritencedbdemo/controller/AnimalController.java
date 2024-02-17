package com.example.inheritencedbdemo.controller;

import com.example.inheritencedbdemo.service.AnimalService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import lombok.RequiredArgsConstructor;
import org.openapitools.api.AnimalApi;
import org.openapitools.model.AnimalDto;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AnimalController implements AnimalApi {
	private final AnimalService animalService;

	@Override
	public ResponseEntity<AnimalDto> getAnimalPerId(@Parameter(name = "id",description = "",required = true,in = ParameterIn.PATH) @PathVariable("id") Long id){
		return ResponseEntity.ok(animalService.findById(id));
	}

}