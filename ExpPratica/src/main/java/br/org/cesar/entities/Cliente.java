package br.org.cesar.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Cliente {
	
	@Id
	private int id;
	private String nomeCliente;
	private LocalDate dataIsercao;
	
	@OneToMany(mappedBy = "idCliente")
	private List<Parecer> pareceres;
	
	public Cliente() {
		
	}
	
	public Cliente(int id, String nomeCliente) {
		this.id = id;
		this.nomeCliente = nomeCliente;
		this.dataIsercao = LocalDate.now();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public LocalDate getDataIsercao() {
		return dataIsercao;
	}
	
}
