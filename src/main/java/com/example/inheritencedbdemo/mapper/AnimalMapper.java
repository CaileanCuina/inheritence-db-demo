package com.example.inheritencedbdemo.mapper;

import com.example.inheritencedbdemo.jpa.enitity.AnimalBase;
import org.mapstruct.Mapper;
import org.openapitools.model.AnimalDto;

@Mapper(componentModel = "spring")
public interface AnimalMapper {

	AnimalBase mapFromDto(AnimalDto animalDto);

	AnimalDto mapFromEntity(AnimalBase animalBase);
}
