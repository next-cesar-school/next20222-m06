package br.org.cesar.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Parecer {
	
	@Id
	private long id;
	private String parecer;
	
	@ManyToOne
	private long idDefeito;
	@ManyToOne
	private long idEquipamento;
	@ManyToOne
	private long idTecnico;
	@ManyToOne
	private long idCliente;
	
	
	public Parecer() {
		
	}

	public Parecer(long id, String parecer, long idDefeito, long idEquipamento, long idTecnico) {
		this.id = id;
		this.parecer = parecer;
		this.idDefeito = idDefeito;
		this.idEquipamento = idEquipamento;
		this.idTecnico = idTecnico;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getParecer() {
		return parecer;
	}

	public void setParecer(String parecer) {
		this.parecer = parecer;
	}

	public long getIdDefeito() {
		return idDefeito;
	}

	public void setIdDefeito(long idDefeito) {
		this.idDefeito = idDefeito;
	}

	public long getIdEquipamento() {
		return idEquipamento;
	}

	public void setIdEquipamento(long idEquipamento) {
		this.idEquipamento = idEquipamento;
	}

	public long getIdTecnico() {
		return idTecnico;
	}

	public void setIdTecnico(long idTecnico) {
		this.idTecnico = idTecnico;
	}
	
	
}
