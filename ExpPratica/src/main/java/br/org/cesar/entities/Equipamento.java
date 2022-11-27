package br.org.cesar.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Equipamento {

	@Id
	private int id;
	
	private String aparelho;
	
	@OneToMany(mappedBy = "idEquipamento")
	private List<Parecer> pareceres;
	
	public Equipamento() {
		
	}

	public Equipamento(int id, String aparelho) {
		this.id = id;
		this.aparelho = aparelho;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAparelho() {
		return aparelho;
	}

	public void setAparelho(String aparelho) {
		this.aparelho = aparelho;
	}
	
	
}
