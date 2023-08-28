//pacote de aplicação
package br.com.poo.lista1;

//adição de biblioteca
import java.util.Scanner;

//nome da classe
public class Exercicio1 {

	//funcao no portugol -> metodo no java
	//No portugol: funcao inicio
	public static void main(String[] args) {
//		declaracao de variavel
		String nome;
		String sobrenome;
		Scanner sc = new Scanner(System.in);
//		syso e ctrl + espaço = escreva		
//		No portugol: escreva ("Por favor, informe seu nome: ")
		System.out.print("Por favor, informe seu nome: ");
//		no portugol = leia (nome)
		nome = sc.nextLine();
		for (int i=0; i<20; i++) {
//			No portugol: limpa ()
			System.out.println();
		}
//		No portugol: escreva ("Agora, informe seu sobrenome: ")
		System.out.print("Agora, informe seu sobrenome: ");
//		no portugol = leia (sobrenome)
		sobrenome = sc.nextLine();	
		sc.close();
		limpa();
		System.out.println("Seja bem-vindo(a) " + nome + " " + sobrenome);
	}
	public static void limpa () {
		for (int i=0; i<20; i++) {
			System.out.println();
		}
	}
}
