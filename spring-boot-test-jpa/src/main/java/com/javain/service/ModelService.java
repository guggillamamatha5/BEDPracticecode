package com.javain.service;

import java.util.List;
import java.util.Optional;

import com.javain.model.Model;

public interface ModelService {

	Model createmodel(Model model);
	
	List<Model> getallmodels();
	
	Optional<Model> getmodelbyid(Long modelid);
	
	Model updatemodel(Model model);
	 
	void deletemodel(Long modelid);
}
