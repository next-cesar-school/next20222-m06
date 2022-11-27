package br.org.cesar.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Defeito {

	@Id
	private int id;
	private String tipoDefeito;
	
	@OneToMany(mappedBy = "idDefeito")
	private List<Parecer> pareceres;
	
	public Defeito() {
		
	}

	public Defeito(int id, String tipoDefeito) {
		this.id = id;
		this.tipoDefeito = tipoDefeito;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipoDefeito() {
		return tipoDefeito;
	}

	public void setTipoDefeito(String tipoDefeito) {
		this.tipoDefeito = tipoDefeito;
	}
	
	
	
}
