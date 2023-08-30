//Declare duas variáveis do tipo int e realize sua soma. Em
//seguida, realize o casting destes dois inteiros para double para
//realizar sua divisão.
package br.com.poo.aula;

import java.util.Scanner;

public class ExercicioTestCasting1 {

	public static void main(String[] args) {
		int n1;
		int n2;
		int soma;
		double n1d;
		double n2d;
		double divisao;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero inteiro:");
		n1 = sc.nextInt();
		limpa();
		System.out.println("Digite outro número inteiro:");
		n2 = sc.nextInt();
		sc.close();
		soma = n1 + n2;
		limpa();
		n1d = (double)n1;
		n2d = (double)n2;
		divisao = n1d/n2d;
		System.out.println("A soma dos dois números é igual a " + soma);
		System.out.println("A divisão de " + n1 + " por " + n2 + " é igual a " + divisao);
	}
	public static void limpa () {
		for (int i=0; i<20; i++) {
			System.out.println();
		}
	}
}
