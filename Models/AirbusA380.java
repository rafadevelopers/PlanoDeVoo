package Models;

import interfaces.Iextras;

public class AirbusA380 extends Aeronave implements Iextras {
	
	
	public AirbusA380() {
		super("Airbus A380", 0.0, 0, 323_000, 470, 13.02, 15);
	}
	
	public double calculoCombustivelPassageiro(double qtdCombustivel) {
		double combustivelPassageiro = qtdCombustivel * ((this.gastoextra / this.passageiros) / 100);
		return combustivelPassageiro;
	}
	
	public void adicionarCombustivel(int qtdPassageiros, double quilometrosVoo) {
		double encherTanque = this.quilometro * quilometrosVoo;
		encherTanque = encherTanque + (calculoCombustivelPassageiro(encherTanque) * qtdPassageiros);
		this.setCombustivelArmazenado(encherTanque);
	}
	

}
