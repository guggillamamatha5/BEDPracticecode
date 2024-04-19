package com.javain.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javain.model.Model;
import com.javain.repo.ModelRepo;
import com.javain.serviceimpl.ServiceImpl;
@RestController
@RequestMapping("/api")
public class ModelController {

	
	@Autowired
	ModelRepo Repository;	
	
	@Autowired
	ServiceImpl serviceimpl;
	
	
	// CRUD OPERATIONS WITH REPOSITORY 
//	@GetMapping("/list")
//	public List<Model> getall(){
//		return Repository.findAll();
//	}
//	
//	@PostMapping("/post")
//	public Model savecomment(@RequestBody Model postmodel) {
//		Model newmodel = Repository.save(postmodel);
//		return newmodel;
//	}
//	
//	@GetMapping("/getbyid/{id}")
//	public Optional<Model> getpostbyid(@PathVariable (value="id") Long nameid) {
//		Optional<Model> commentbyid= Repository.findById(nameid);
//		return commentbyid;
//		
//	}
	
//	@DeleteMapping("deletebyid/{id}")
//	public ResponseEntity<String> deletebyid(@PathVariable (value="id") Long nameid) {
//		Repository.deleteById(nameid);
//		return new ResponseEntity<>("comment deleted",HttpStatus.OK);
//	}
//	
//	@PutMapping("/updatecomment/{id}")
//	public Model updatebyid(@PathVariable(value="id") Long nameid,@RequestBody Model updatemodel) {
//		
//		Model Existmodel = Repository.findById(updatemodel.getId()).get();
//		
//		Existmodel.setName(updatemodel.getName());
//		Existmodel.setComment(updatemodel.getComment());
//		 
//		Model newupdatemodel=Repository.save(Existmodel);
//		return newupdatemodel;
//		     
//		
//	}
	
	//CRUD OPERATIONS WITH SERVICE CLASS
	@GetMapping("/get")
	public List<Model> getallmodelss(){
		return serviceimpl.getallmodels();
		
	}
	@PostMapping("/post")
	public Model postmodel(@RequestBody Model model) {
		return serviceimpl.createmodel(model);
		
	}
	@GetMapping("/getid/{id}")
	public Optional<Model> modelid(@PathVariable(value="id") Long comid) {
		return serviceimpl.getmodelbyid(comid);
		
	}
	
	@PutMapping("/update/{id}")
	public Model updateid(@PathVariable(value="id") Long comid,@RequestBody Model model) {
		Model updateddmodel=serviceimpl.updatemodel(model);
		return updateddmodel;
		
	}
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<String> deleteid(@PathVariable(value="id") Long comid){
		serviceimpl.deletemodel(comid);
		return new ResponseEntity<>("deleted",HttpStatus.OK);
		
	}
	
	
}
