//Em nossa empresa, há tabelas com o quanto foi gasto em cada mês. Para fechar o balanço do
//primeiro trimestre, precisamos somar o gasto total. Sabendo que, em Janeiro, foram gastos R$
//15000, em Fevereiro, R$ 23000, e em Março, R$ 17000, faça um programa que calcule e imprima o
//gasto total no trimestre. Siga os passos:
//• Crie uma classe chamada BalancoTrimestral com um bloco main, como nos exemplos anteriores;
//• Dentro do main (o miolo do programa), declare uma variável inteira chamada gastosJaneiro e
//inicialize-a com 15000;
//• Crie também as variáveis gastosFevereiro e gastosMarco, inicializando-as com 23000 e 17000,
//respectivamente, e utilize uma linha para cada declaração;
//• Crie uma variável chamada gastosTrimestre e inicialize-a com a soma das outras 3 variáveis;
//• Imprima a variável gastosTrimestre.
//○ Fazer com Integer, Double e BigDecimal.
package br.com.poo.desafios;

import java.math.BigDecimal;

//Exercício 3 - Desafio 1
public class BalancoTrimestral {

	public static void main(String[] args) {
		// Usando Integer
//        Integer gastosJaneiro = 15000;
//        Integer gastosFevereiro = 23000;
//        Integer gastosMarco = 17000;
//        Integer gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
//        System.out.println("Gastos trimestrais usando Integer: " + gastosTrimestre);

        // Usando Double
//        Double gastosJaneiroDouble = 15000.0;
//        Double gastosFevereiroDouble = 23000.0;
//        Double gastosMarcoDouble = 17000.0;
//        Double gastosTrimestreDouble = gastosJaneiroDouble + gastosFevereiroDouble + gastosMarcoDouble;
//        System.out.println("Gastos trimestrais usando Double: " + gastosTrimestreDouble);

        // Usando BigDecimal
        BigDecimal gastosJaneiroBigDecimal = new BigDecimal("15000");
        BigDecimal gastosFevereiroBigDecimal = new BigDecimal("23000");
        BigDecimal gastosMarcoBigDecimal = new BigDecimal("17000");
        BigDecimal gastosTrimestreBigDecimal = gastosJaneiroBigDecimal.add(gastosFevereiroBigDecimal).add(gastosMarcoBigDecimal);
        System.out.println("Gastos trimestrais usando BigDecimal: " + gastosTrimestreBigDecimal);
	}
}