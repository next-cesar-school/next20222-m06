package Modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class equipamento {

	@Id
	private int id;
	
	private String aparelho;
	
	@OneToMany(mappedBy = "idEquipamento")
	private List<parecer> pareceres;
	
	public equipamento() {
		
	}

	public equipamento(int id, String aparelho) {
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
