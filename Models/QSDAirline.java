package Models;

import java.util.Map;
import java.util.HashMap;

public class QSDAirline {
	
	
	
	

	
	private String nome = "QSD Airlines";
	private Map<Integer, Aeronave> aeronaves = new HashMap<>();

	public QSDAirline() {
		this.aeronaves.put(1, new AirbusA380());
		this.aeronaves.put(2, new AirbusA330200());
		this.aeronaves.put(3, new AirbusA350900());
		this.aeronaves.put(4, new Boeing777200());
	}
	


	public Map<Integer, Aeronave> getAeronaves() {
		return aeronaves;
	}

	public void setAeronaves(Map<Integer, Aeronave> aeronaves) {
		this.aeronaves = aeronaves;
	}

	public String getNome() {
		
			return nome;
		
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	
	
}
