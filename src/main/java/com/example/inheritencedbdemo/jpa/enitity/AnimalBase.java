package com.example.inheritencedbdemo.jpa.enitity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "animal_base")
@Data
public class AnimalBase {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long animalBaseId;

	private String type;

	private String name;

	private int age;

}
