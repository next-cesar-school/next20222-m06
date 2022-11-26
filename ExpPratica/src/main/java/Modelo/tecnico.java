package Modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class tecnico {

	@Id
	private int id;
	private String nomeTecnico;
	
	@OneToMany(mappedBy = "idTecnico")
	private List<parecer> pareceres;
	
	public tecnico(){
		
	}

	public tecnico(int id, String nomeTecnico) {
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
