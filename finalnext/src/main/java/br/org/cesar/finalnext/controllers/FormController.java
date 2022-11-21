package br.org.cesar.finalnext.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.cesar.finalnext.entities.Form;
import br.org.cesar.finalnext.repositories.FormRepository;

@RestController
@RequestMapping(value = "/Form")
public class FormController {
	
	@Autowired
	private FormRepository repository;
	
	@GetMapping
	public List<Form> findAll(){
		List<Form> result = repository.findAll();
		return result;
	}
	
	@GetMapping (value = "/{id}")
	public Form findById(@PathVariable Long id){
		Form result = repository.findById(id).get();
		return result;
	}
	@PostMapping
	public Form insert(@RequestBody Form form){
		Form result = repository.save(form);
		return result;
	}

}
