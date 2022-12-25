package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Tutorial;
import com.example.demo.service.IService;

@RestController
@RequestMapping("/api/tutorials")
public class TutorialController {
	
	@Autowired
	IService iService;
	
	@GetMapping
	public ResponseEntity<List<Tutorial>> getAllTutorials(@RequestParam(required = false) String title){
		try {
		List<Tutorial> tutorials = new ArrayList<Tutorial>();
		if(tutorials==null) {
			tutorials.addAll(iService.findAll());
		} else {
			tutorials.addAll(iService.findByTitleContaining(title));
			}
		return new ResponseEntity<>(HttpStatus.OK);
		} catch(Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
	}
	
}
