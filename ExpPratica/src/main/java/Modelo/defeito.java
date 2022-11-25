package Modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class defeito {

	@Id
	private int id;
	private String tipoDefeito;
	
	@OneToMany(mappedBy = "idDefeito")
	private List<parecer> pareceres;
	
	public defeito() {
		
	}

	public defeito(int id, String tipoDefeito) {
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
