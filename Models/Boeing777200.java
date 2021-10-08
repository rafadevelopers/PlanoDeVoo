package Models;

import interfaces.Iextras;

public class Boeing777200 extends Aeronave implements Iextras{
	
	public Boeing777200() {
		super("Boeing 777 200", 0.0, 0, 117_500, 370, 6.38, 20);
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
