package com.udacity.mvc.Trainers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TrainersController {
	
	@Autowired
	private TrainersService trainersService;

	 @RequestMapping(value = "/Trainers")
	 public String getAllTrainers(Model model) 
	 {				
		List<Trainers> trainers =  trainersService.getAllTrainers();
		
		model.addAttribute("Trainers", trainers);
		
		return "Trainers";		
	 }	
	 	 
	 @RequestMapping(value = "/Trainers/{id}")
	 public Optional<Trainers> getTrainers(@PathVariable String id) {
	 	return trainersService.getTrainers(id);
	 }	 
	 
	 @RequestMapping(value = "/Trainers/name/{name}")
	 public List<Trainers> getTrainersByName(@PathVariable String name) {
	 	return trainersService.getTrainerssByName(name);
	 }	
	 
	 @RequestMapping(value = "/Trainers", method=RequestMethod.POST)
	 public void addTrainers(@RequestBody Trainers Trainers) {
		 trainersService.addTrainers(Trainers);
	 }
	 
	 @RequestMapping(value = "/Trainers/{id}", method = RequestMethod.PUT)
	 public void updateTrainers(@RequestBody Trainers Trainers,@PathVariable String id ) {
		 trainersService.updateTrainers(id, Trainers);
	 }
	 
	 @RequestMapping(value = "/Trainers/{id}", method = RequestMethod.DELETE)
	 public void deleteTrainers(@PathVariable String id) {
		 trainersService.deleteTrainers(id);
		 	 
	 }	 
}
