package Modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class parecer {
	
	@Id
	private int id;
	private String parecer;
	
	@ManyToOne
	private int idDefeito;
	@ManyToOne
	private int idEquipamento;
	@ManyToOne
	private int idTecnico;
	@ManyToOne
	private int idCliente;
	
	// relaciona-se o cadastro do cliente com o parecer(chave estrangeira de cliente em parecer). @ManytoOne
	
	public parecer() {
		
	}

	public parecer(int id, String parecer, int idDefeito, int idEquipamento, int idTecnico) {
		this.id = id;
		this.parecer = parecer;
		this.idDefeito = idDefeito;
		this.idEquipamento = idEquipamento;
		this.idTecnico = idTecnico;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getParecer() {
		return parecer;
	}

	public void setParecer(String parecer) {
		this.parecer = parecer;
	}

	public int getIdDefeito() {
		return idDefeito;
	}

	public void setIdDefeito(int idDefeito) {
		this.idDefeito = idDefeito;
	}

	public int getIdEquipamento() {
		return idEquipamento;
	}

	public void setIdEquipamento(int idEquipamento) {
		this.idEquipamento = idEquipamento;
	}

	public int getIdTecnico() {
		return idTecnico;
	}

	public void setIdTecnico(int idTecnico) {
		this.idTecnico = idTecnico;
	}
	
	
}
