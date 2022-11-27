package br.org.cesar.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Tecnico {

	@Id
	private int id;
	private String nomeTecnico;
	
	@OneToMany(mappedBy = "idTecnico")
	private List<Parecer> pareceres;
	
	public Tecnico(){
		
	}

	public Tecnico(int id, String nomeTecnico) {
		this.id = id;
		this.nomeTecnico = nomeTecnico;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeTecnico() {
		return nomeTecnico;
	}

	public void setNomeTecnico(String nomeTecnico) {
		this.nomeTecnico = nomeTecnico;
	}
	
	
}
