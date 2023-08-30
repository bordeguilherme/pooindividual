package br.com.poo.lista1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número inteiro: ");
            int num1 = sc.nextInt();
            limpa ();
            System.out.print("Digite o segundo número inteiro: ");
            int num2 = sc.nextInt();
            int soma = num1 + num2;
            limpa ();
            System.out.println("Soma: " + soma);
            int subtracao = num1 - num2;
            System.out.println("Subtração: " + subtracao);
            int multiplicacao = num1 * num2;
            System.out.println("Multiplicação: " + multiplicacao);
            if (num2 != 0) {
                double divisao = (double) num1 / num2;
                System.out.println("Divisão: " + divisao);
            } else {
                System.out.println("Divisão por zero não é permitida.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de que você digitou números inteiros.");
        } finally {
            sc.close();
        }
    }
	public static void limpa () {
		for (int i=0; i<20; i++) {
			System.out.println();
		}
	}
}
