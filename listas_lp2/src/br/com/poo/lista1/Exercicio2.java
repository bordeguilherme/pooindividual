//O programa “Hera” irá imprimir a soma das idades de todos os colegas da
//sua equipe (6 pessoas). Pergunte a cada um a idade e não esqueça a sua!
//Depois faça a atribuição direta da expressão em uma variável inteira.

package br.com.poo.lista1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int minhaIdade;
		int idade1;
		int idade2;
		int idade3;
		int idade4;
		int idade5;
		int idade6;
		int soma;
		Scanner sc = new Scanner(System.in);
		  System.out.println("Qual a idade do primeiro colega? ");
		  idade1 = sc.nextInt();
		  limpa();
		  System.out.println("Qual a idade do segundo colega? ");
		  idade2 = sc.nextInt();
		  limpa();
		  System.out.println("Qual a idade do terceiro colega? ");
		  idade3 = sc.nextInt();
		  limpa();
		  System.out.println("Qual a idade do quarto colega? ");
		  idade4 = sc.nextInt();
		  limpa();
		  System.out.println("Qual a idade do quinto colega? ");
		  idade5 = sc.nextInt();
		  limpa();
		  System.out.println("Minha idade é: ");
		  minhaIdade = sc.nextInt();
		  sc.close();
		  limpa();
		  soma = minhaIdade + idade1 + idade2 + idade3 + idade4 + idade5;
		  System.out.println("O tempo de vida meu e dos meus colegas é: " + soma);
	}
	public static void limpa () {
		for (int i=0; i<20; i++) {
			System.out.println();
		}
	}
}
