package com.javain.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javain.model.Model;
import com.javain.repo.ModelRepo;
import com.javain.service.ModelService;
@Service
public class ServiceImpl implements ModelService {
    
	@Autowired 
    ModelRepo Reposit;
    
	@Override
	public List<Model> getallmodels()
	{
		return Reposit.findAll();
		
	}

	@Override
	public Model createmodel(Model model) {
		return Reposit.save(model);
	}

	@Override
	public Optional<Model> getmodelbyid(Long modelid) {
		Optional<Model> Mdelbyid = Reposit.findById(modelid);
		return Mdelbyid;
	}

	@Override
	public Model updatemodel(Model model) {
		Model existmodel = Reposit.findById(model.getId()).get();
		existmodel.setName(model.getName());
		existmodel.setComment(model.getComment());
		
		Model savedmodel=Reposit.save(existmodel);
		return savedmodel;
	}

	@Override
	public void deletemodel(Long modelid) {
	    Reposit.deleteById(modelid);
	    	
	}
	
	
}
