package com.javain.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javain.model.Model;
@Repository
public interface ModelRepo extends JpaRepository<Model, Long> {

}
	



