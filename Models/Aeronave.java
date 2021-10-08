package Models;

import interfaces.Iextras;

public abstract  class Aeronave implements Iextras {
	


	private String modelo;
	private double combustivelArmazenado;
	private int quantidadePassageiros;

	public Aeronave(String modelo, double combustivelArmazenado, int quantidadePassageiros, double combustivel,
			int passageiros, double consumoQuilometro, double gastoextra) {
		this.modelo = modelo;
		this.combustivelArmazenado = combustivelArmazenado;
		this.quantidadePassageiros = quantidadePassageiros;
		this.combustivel = combustivel;
		this.passageiros = passageiros;
		this.quilometro = consumoQuilometro;
		this.gastoextra = gastoextra;
	}

	public double calculoCombustivelPassageiro(double qtdCombustivel) {
		double combustivelPassageiro = qtdCombustivel * ((this.gastoextra / this.passageiros) / 100);
		return combustivelPassageiro;
	}

	public void adicionarCombustivel(int qtdPassageiros, double quilometrosVoo) {
		if (qtdPassageiros < 1 || qtdPassageiros > this.passageiros) {
			throw new RuntimeException(
					"Quantidade de passageiros deve ser maior que ZERO e não pode ser maior que capacidade da aeronave");
		} else if (quilometrosVoo <= 0) {
			throw new RuntimeException("Distância de vôo deve ser maior que ZERO");
		} else {
			double encherTanque = this.quilometro * quilometrosVoo;
			encherTanque = encherTanque + (calculoCombustivelPassageiro(encherTanque) * qtdPassageiros);
			this.setCombustivelArmazenado(encherTanque);
		}
	}

	public double getcombustivel() {
		if (this.combustivel <= 0) {
			throw new RuntimeException("Quantidade máxima de combustível deve ser maior que ZERO");
		} else {
			return combustivel;
		}
	}

	public int getMAX_PASSGEIROS() {
		if (this.passageiros <= 0) {
			throw new RuntimeException("Quantidade máxima de passageiros deve ser maior que ZERO");
		} else {
			return passageiros;
		}
	}

	public double getquilometro() {
		if (this.quilometro <= 0) {
			throw new RuntimeException("Consumo por km deve ser maior que ZERO");
		} else {
			return quilometro;
		}
	}

	public double getgastoextra() {
		if (this.gastoextra <= 0) {
			throw new RuntimeException("Gasto extra deve ser maior que ZERO");
		} else {
			return gastoextra;
		}
	}

	public String getModelo() {
		if (this.modelo == null) {
			throw new NullPointerException("Nome do modelo está vazio");
		} else {
			return modelo;
		}
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getCombustivelArmazenado() {
		if (this.combustivelArmazenado < 0) {
			throw new RuntimeException("Combustível não pode estar abaixo de ZERO");
		} else {
			return combustivelArmazenado;
		}
	}

	public void setCombustivelArmazenado(double combustivelArmazenado) {
		if (combustivelArmazenado < 0) {
			throw new RuntimeException("Combustível não pode estar abaixo de ZERO");
		} else {
			this.combustivelArmazenado = combustivelArmazenado;
		}
	}

	public int getQuantidadePassageiros() {
		return quantidadePassageiros;
	}

	public void setQuantidadePassageiros(int quantidadePassageiros) {
		this.quantidadePassageiros = quantidadePassageiros;
	}

	public final double combustivel;
	public final int passageiros;
	public final double quilometro;
	public final double gastoextra;
	

	
	}
	
	
	
	
	
	
	
	
	


