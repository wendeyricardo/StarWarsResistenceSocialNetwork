package com.example.api.da.resistencia.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.da.resistencia.Rebelde;
import com.example.api.da.resistenciaReposotory.RebeldesRepository;


//import antlr.collections.List;

@RestController
@RequestMapping ("/rebeldes")
public class RebeldesResource {
	
	@Autowired(required=true)
	private RebeldesRepository rebeldesRepository;
	
	@GetMapping
	public List<Rebelde> listar(){
		return rebeldesRepository.findAll();
	}
	
	@GetMapping("/outro")
	public String outro() {
		return "ok";
		
	}

}
