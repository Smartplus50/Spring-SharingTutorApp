package com.udacity.mvc.Trainers;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TrainersRepository extends CrudRepository<Trainers, String> {
	
	public List<Trainers> findByName(String name);

}
