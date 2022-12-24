package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Tutorial;

public interface TutorialRepo extends JpaRepository<Tutorial, Long> {
	
}


