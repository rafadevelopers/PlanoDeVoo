package Models;

public class PlanoDeVoo {
	
public static int contador = 0;
	
	private String aeronave;
	private int quantidadePassageiros;
	private double distanciaPercorrida;
	private String Companhia;
	private double combustivelQuilometro;
	private double combustivelPassageiro;
	private double combustivelTotal;
	
	public PlanoDeVoo(String aeronave, 
			          int quantidadePassageiros, 
			          double distanciaPercorrida, 
			          String Companhia,
			          double combustivelQuilometro, 
			          double combustivelPassageiro, 
			          double combustivelTotal) {
		this.aeronave = aeronave;
		this.quantidadePassageiros = quantidadePassageiros;
		this.distanciaPercorrida = distanciaPercorrida;
		this.Companhia = Companhia;
		this.combustivelQuilometro = combustivelQuilometro;
		this.combustivelPassageiro = combustivelPassageiro;
		this.combustivelTotal = combustivelTotal;
		PlanoDeVoo.contador = PlanoDeVoo.contador + 1;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		PlanoDeVoo.contador = contador;
	}

	public String getAeronave() {
		return aeronave;
	}

	public void setAeronave(String aeronave) {
		this.aeronave = aeronave;
	}

	public int getQuantidadePassageiros() {
		return quantidadePassageiros;
	}

	public void setQuantidadePassageiros(int quantidadePassageiros) {
		this.quantidadePassageiros = quantidadePassageiros;
	}

	public double getDistanciaPercorrida() {
		return distanciaPercorrida;
	}

	public void setDistanciaPercorrida(double distanciaPercorrida) {
		this.distanciaPercorrida = distanciaPercorrida;
	}

	public String getCompanhia() {
		return Companhia;
	}

	public void setCompanhia(String Companhia) {
		this.Companhia = Companhia;
	}

	public double getCombustivelQuilometro() {
		return combustivelQuilometro;
	}

	public void setCombustivelQuilometro(double combustivelQuilometro) {
		this.combustivelQuilometro = combustivelQuilometro;
	}

	public double getCombustivelPassageiro() {
		return combustivelPassageiro;
	}

	public void setCombustivelPassageiro(double combustivelPassageiro) {
		this.combustivelPassageiro = combustivelPassageiro;
	}

	public double getCombustivelTotal() {
		return combustivelTotal;
	}

	public void setCombustivelTotal(double combustivelTotal) {
		this.combustivelTotal = combustivelTotal;
	}



}
