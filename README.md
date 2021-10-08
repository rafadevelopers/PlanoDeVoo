# PlanoDeVoo


O objetivo deste exercício é criar um programa que permita ao usuário criar, de forma bem
simplificada, três plano de voo para um companhia aérea.
Para tanto, o sistema deverá atender aos seguintes requisitos:
•Exibir na tela:
◦O nome da Companhia;
◦As informações dos modelos de aeronaves disponíveis para a geração dos 
planos de voo;
◦Permitir que o usuário informe:
▪A aeronave utilizada;
▪A quantidade de passageiros presentes no voo;
▪A distância que será percorrida no voo;
▪Após a entrada destas informações, o sistema deve exibir na tela:
•O nome da Companhia;
•A aeronave selecionada;
•A quantidade de passageiros;
•A distância que será percorrida;
•A quantidade de combustível consumida por km;
•A quantidade de combustível que precisou ser acrescentada por 
passageiro;
•A quantidade de combustível total que será consumidas durante o voo.
•Regras para o desenvolvimento:
◦O programa deve ser iniciado sem erros. Se isso não ocorrer, serão 
descontados 2,0 pontos da nota final;
◦Deve existir uma classe Java principal que deve possuir um método executável 
para a utilização do sistema;
◦Obrigatoriamente devem ser utilizadas pelo menos uma Interface e uma Classe 
Abstrata;
◦As informações fornecidas pelo usuário devem ser armazenadas em Collections
utilizando-se a que se enquadre na situação criada pelos dados informados pelo
usuário;
◦Os planos de voo gerados devem ser armazenados em uma Collection que 
permita a estrutura chave-valor;
◦As informações dos planos devem ser exibidas na tela utilizando-se esta 
estrutura de dados;
◦Tratamentos de erro devem ser utilizados sempre que for necessário ao 
funcionamento do sistema.
•Regras de negócio:
◦Nome da Companhia.: QSD Airlines;
◦Aeronaves disponíveis.: 
▪Airbus A380
•Quantidade de combustível armazenado.:  323 mil  litros;
•Quantidade máxima de passageiros.: 470
•Consumo por quilometro.: 13,02 litros / km;
•Com a lotação máxima, a aeronave gasta 15% à mais de combustível 
total.
▪Airbus A330-200
•Quantidade de combustível armazenado.:  140 mil litros;
•Quantidade máxima de passageiros.: 290
•Consumo por quilometro.: 6,11 litros / km;
•Com a lotação máxima, a aeronave gasta 10% à mais de combustível 
total.
▪Airbus A350-900
•Quantidade de combustível armazenado.:  141 mil litros;
•Quantidade máxima de passageiros.: 325
•Consumo por quilometro.: 5,85 litros / km;
•Com a lotação máxima, a aeronave gasta 12% à mais de combustível 
total.
▪Boeing 777-200
•Quantidade de combustível armazenado.:  117.500 mil litros;
•Quantidade máxima de passageiros.: 370
•Consumo por quilometro.: 6,38 litros / km;
•Com a lotação máxima, a aeronave gasta 20% à mais de combustível 
total.
◦O usuário deverá escolher três aeronaves para gerar os três planos;
◦As aeronaves podem ser repetidas;
◦O usuários pode informar, para a quantidade de passageiros, um valor entre 1 e
o total comportado pela aeronave selecionada.
•Serão avaliados:
◦O uso dos recurso da ferramenta de acordo com o que foi visto durante o 
módulo:
▪Tipos de Dados;
▪Orientação a Objetos;
▪Estruturas de Controle;
▪Estrutura de Dados;
◦A organização do código, a distribuição das classe nos pacotes e a 
padronização na nomenclatura de pacotes, classes, interfaces, atributos e 
métodos;
◦Consistência para validação de informações incorretas, por exemplo, o usuário 
não pode informar uma quantidade de passageiros menor que 1 e também não 
pode informar uma quantidade de passageiros maior do que a capacidade das 
aeronave selecionada.
