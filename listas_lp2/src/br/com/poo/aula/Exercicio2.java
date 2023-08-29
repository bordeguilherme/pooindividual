//Escreva um programa que receba do teclado dois números separadamente e escreva na
//tela a soma deles, como no exemplo abaixo:
//Exemplo:
//Entrada:
//Digite o primeiro número: 5
//Digite o segundo número: 10
//Saída:
//
//A soma dos números é igual a 15.
package br.com.poo.aula;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int n1;
		int n2;
		int soma;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero inteiro:");
		n1 = sc.nextInt();
		limpa();
		System.out.println("Digite outro número inteiro que será somado ao primeiro:");
		n2 = sc.nextInt();
		sc.close();
		soma = n1 + n2;
		limpa();
		System.out.println("A soma dos dois números é igual a " + soma);
	}
	public static void limpa () {
		for (int i=0; i<20; i++) {
			System.out.println();
		}
	}
}
