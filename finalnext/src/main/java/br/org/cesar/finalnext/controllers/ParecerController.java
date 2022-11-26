package br.org.cesar.finalnext.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.cesar.finalnext.entities.Parecer;
import br.org.cesar.finalnext.repositories.ParecerRepository;

@RestController
@RequestMapping(value = "/Parecer")
public class ParecerController {
	
	@Autowired
	private ParecerRepository repository;
	
	@GetMapping
	public List<Parecer> findAll(){
		List<Parecer> result = repository.findAll();
		return result;
	}
	
	@GetMapping (value = "/{id}")
	public Parecer findById(@PathVariable Long id){
		Parecer result = repository.findById(id).get();
		return result;
	}
	
	@PostMapping
	public Parecer insert(@RequestBody Parecer parecer){
		Parecer result = repository.save(parecer);
		return result;
	}
	
	@DeleteMapping (value = "/{id}")
	public void delete(@PathVariable Long id){
		repository.deleteById(id);
	}

}
