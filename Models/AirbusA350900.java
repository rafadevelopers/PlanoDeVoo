package Models;

import interfaces.Iextras;

public class AirbusA350900 extends Aeronave implements Iextras  {
	
	
	public AirbusA350900() {
		super("Airbus A350 900", 0.0, 0, 141_000, 325, 5.85, 12);
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
