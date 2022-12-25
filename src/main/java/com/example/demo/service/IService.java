package com.example.demo.service;

import java.util.List;
import java.util.Optional;

public interface IService<E> {
	List<E> findAll();
	
	Optional<E> findById(long id);
	
	E save(E e);
	
	void delete (long id);
	
	List<E> findByTitleContaining(String name);

}
