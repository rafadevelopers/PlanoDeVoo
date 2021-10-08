package Models;

import interfaces.Iextras;

public class AirbusA330200 extends Aeronave implements Iextras {
	
	public AirbusA330200() {
		super("AirbusA330200", 0.0, 0, 140_000, 290, 6.11, 10);
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
