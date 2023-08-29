//Escreva um programa que receba do teclado seu nome e seu sobrenome separadamente e
//escreva na tela seu nome completo, como no exemplo abaixo:
//Exemplo:
//Entrada:
//Digite seu nome: Fulano
//Digite seu sobrenome: de
//Tal Saída:
//
//Meu nome é Fulano de Tal!
package br.com.poo.aula;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		String nome;
		String sobrenome;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		nome = sc.nextLine();
		limpa();
		System.out.println("Digite seu sobrenome:");
		sobrenome = sc.nextLine();
		sc.close();
		limpa();
		System.out.println("Meu nome é " + sobrenome + "\n" + nome + "\t" + sobrenome);
	}
	public static void limpa () {
		for (int i=0; i<20; i++) {
			System.out.println();
		}
	}
}
