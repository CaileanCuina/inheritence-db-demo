package com.example.inheritencedbdemo.jpa.repo;

import com.example.inheritencedbdemo.jpa.enitity.AnimalBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalBaseRepository extends JpaRepository<AnimalBase, Long>{
}
