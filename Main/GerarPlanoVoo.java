package Main;

import Models.QSDAirline;
import Models.PlanoDeVoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GerarPlanoVoo   {

	public static void main(String[] args) {
		
		
		QSDAirline companhia = new QSDAirline();
		Map<Integer, PlanoDeVoo> planosDeVoo = new HashMap<>();

		try {
			System.out.println( companhia.getNome() +"\n");
		} catch (Exception e) {
			System.out.println(e.getCause().getMessage());
		}

		int contador = 1;
		do {
			try {
				System.out.println(contador + ") - " + companhia.getAeronaves().get(contador).getModelo());
			} catch (Exception e) {
				System.out.println(e.getCause());
			}

			contador++;

		} while (contador <= companhia.getAeronaves().size());

		int Planos = 1;
		Scanner scan = new Scanner(System.in);

		do {
			Number dados[] = new Number[3];
			List<Number[]> entradaDados = new ArrayList<>();

			System.out.println("Informe a aeronave para o  " + Planos + " Plano" );
			
			boolean tryOk = false;
			int aeronave = 0;
			do {
				System.out.print("Selecione o número da aeronave desejada: ");
				
				int aeronaveSelecionado;
				try {
					aeronaveSelecionado = Integer.parseInt(scan.nextLine());
					if (aeronaveSelecionado < 1 || aeronaveSelecionado > companhia.getAeronaves().size()) {
						System.out.println("Essa Aeronave não existe, por favor selecione outra");
						System.out.println("\n");
						continue;
					}
				} catch (Exception e) {
					System.out.println("\n");
					aeronaveSelecionado = 0;
					continue;
				}
				
				aeronave = aeronaveSelecionado;
				tryOk = true;

			} while (tryOk == false);

			tryOk = false;
			int passageiros = 0;
			do {
				System.out.print("Insira a quantidade de passageiros: ");
				
				int qtdPassageiros;
				try {
					qtdPassageiros = Integer.parseInt(scan.nextLine());
					if (qtdPassageiros < 1 || qtdPassageiros > companhia.getAeronaves().get(aeronave).passageiros) {
						System.out.println(
								"A quantidade de passageiros deve ser maior que zero e estar dentro da capacidade maxima de passageiros!");
						System.out.println("\n");
						continue;
					}
				} catch (Exception e) {
					System.out.println("\n");
					qtdPassageiros = 0;
					continue;
				}
				
				passageiros = qtdPassageiros;
				tryOk = true;

			} while (tryOk == false);



			tryOk = false;
			double distancia = 0.0;
			do {
				System.out.print("Informe a distância da viagem em km: ");
				
				double distanciaViagem;
				try {
					distanciaViagem = Double.parseDouble(scan.nextLine());
					if (distanciaViagem <= 0) {
						System.out.println("Distância de vôo deve ser maior que ZERO");
						System.out.println("\n");
						continue;
					}
				} catch (Exception e) {
					System.out.println("Entre com valores numéricos válidos. Causa do erro: " + e.getCause());
					System.out.println("\n");
					distanciaViagem = 0;
					continue;
				}
				
				distancia = distanciaViagem;
				tryOk = true;

			} while (tryOk == false);


			System.out.println("\n");

			dados[0] = aeronave;
			dados[1] = passageiros;
			dados[2] = distancia;

			entradaDados.add(dados);

			try {
				companhia.getAeronaves().get(aeronave).adicionarCombustivel(passageiros, distancia);
			} catch (Exception e) {
				System.out.println(e.getCause().getMessage());
				continue;
			}


			double combustivel = companhia.getAeronaves().get(aeronave).getCombustivelArmazenado();
			double combustivelPassageiro = companhia.getAeronaves().get(aeronave)
					.calculoCombustivelPassageiro(combustivel);
			double combustivelKm = combustivel / distancia;
			String aeronaveModelo = companhia.getAeronaves().get(aeronave).getModelo();


			PlanoDeVoo planoDeVoo = new PlanoDeVoo(aeronaveModelo, passageiros, distancia, companhia.getNome(),
					combustivelKm, combustivelPassageiro, combustivel);


			planosDeVoo.put(PlanoDeVoo.contador, planoDeVoo);

			Planos++;

		} while (Planos <= 3);


		scan.close();


		int retornar = 1;
		do {


			try {
				System.out.println( planosDeVoo.get(retornar).getCompanhia());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			try {
				System.out.println("Aeronave selecionada: " + planosDeVoo.get(retornar).getAeronave());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			try {
				System.out.println("Quantidade passageiros: " + planosDeVoo.get(retornar).getQuantidadePassageiros());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			try {
				System.out.println("Distancia que sera percorrida: " + planosDeVoo.get(retornar).getDistanciaPercorrida() + "km");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			try {
				System.out.println("Quantidade de combustivel por KM: " + planosDeVoo.get(retornar).getCombustivelQuilometro() );
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			try {
				System.out.println(
						"Quantidade de combustível por passageiro: " + planosDeVoo.get(retornar).getCombustivelPassageiro());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			try {
				System.out.println(
						"Quantidade de combustivel total que será utilizada " + planosDeVoo.get(retornar).getCombustivelTotal() );
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println("\n");

			retornar++;

		} while (retornar <= planosDeVoo.size());


	}}
		
        
         
        
		
		
		
		
		
		
		

		
		
		

	


