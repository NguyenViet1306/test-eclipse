package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Tutorial;
import com.example.demo.repository.TutorialRepo;

public class TutorialService implements IService	
<Tutorial> {
	
	@Override
	public List<Tutorial> findByTitleContaining(String name) {
		// TODO Auto-generated method stub
		return tutorialRepo.findByTitleContaining("%"+name+"%");
	}

	@Autowired
	TutorialRepo tutorialRepo;

	@Override
	public List<Tutorial> findAll() {
		// TODO Auto-generated method stub
		return tutorialRepo.findAll();
	}

	@Override
	public Optional<Tutorial> findById(long id) {
		// TODO Auto-generated method stub
		return tutorialRepo.findById(id);
	}

	@Override
	public Tutorial save(Tutorial e) {
		// TODO Auto-generated method stub
		return tutorialRepo.save(e);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		tutorialRepo.deleteById(id);
	}

}
