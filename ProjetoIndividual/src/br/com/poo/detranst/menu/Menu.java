package br.com.poo.detranst.menu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import br.com.poo.detranst.classes.Carro;
import br.com.poo.detranst.classes.Pessoa;
import br.com.poo.detranst.io.LeituraEscrita;

public class Menu {
	
	static Scanner sc = new Scanner(System.in);

	public static void menu() throws IOException {
		System.out.println(
				"Menu\n\n[1]\tListar carros\n[2]\tListar proprietários\n[3]\tListar carros de cada pessoa\n[0]\tSair\n\nDigite a opção desejada: ");
		int opc = sc.nextInt();

		switch (opc) {
		case 1:
			System.out.println("\n\nLista de carros: ");
			for (Carro c : Carro.mapaCarro.values()) {
				System.out.println(c.getModelo());
			}
			System.out.println("\n\n");
			menu();
			break;
		case 2:
			System.out.println("\n\nLista de proprietários: ");
			for (Pessoa p : Pessoa.mapaPessoa.values()) {
				System.out.println(p.getNome());
			}
			System.out.println("\n\n");
			menu();
			break;
		case 3:
			carroPessoa();
			break;
		case 0:
			System.out.println("Volte sempre!");
			break;
		default:
			System.out.println("Opção inválida!");
			menu();
			break;
		}
	}
	
	public static void carroPessoa() throws IOException {
		List<Pessoa> listaPessoa = new ArrayList<>();
		List<Carro> listaCarro = new ArrayList<>();
		Pessoa pessoa = null;
		Carro carro = null;
		System.out.println(
				"\n\nCarros:\n[1]\tGuilherme Borde Almeida\n[2]\tLeonardo Martins de Almeida\n[3]\tVitória Costa Magalhães Gonçalves"
				+ "\n[4]\tAline Cristina da Silva Borde\n[5]\tW. Axl Rose\n[6]\tDamiano David\n[7]\tArthur Antunes Coimbra\n"
				+ "[0]\tVoltar ao menu anterior\n\nDigite a opção desejada: ");
		int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			pessoa = Pessoa.mapaPessoa.get(1);
			listaCarro.clear();
			for (Carro c : Carro.mapaCarro.values()) {
				if(c.getIdPessoa() == 1) {
					System.out.println(c.getModelo());
					listaCarro.add(c);
				}
			}
			LeituraEscrita.relatorioPessoaCarro(carro, listaPessoa);
			carroPessoa();
			break;
		case 2:
			pessoa = Pessoa.mapaPessoa.get(2);
			listaCarro.clear();
			for (Carro c : Carro.mapaCarro.values()) {
				if(c.getIdPessoa() == 2) {
					System.out.println(c.getModelo());
					listaCarro.add(c);
				}
			}
			LeituraEscrita.relatorioPessoaCarro(carro, listaPessoa);
			carroPessoa();
			break;
		case 3:
			pessoa = Pessoa.mapaPessoa.get(3);
			listaCarro.clear();
			for (Carro c : Carro.mapaCarro.values()) {
				if(c.getIdPessoa() == 3) {
					System.out.println(c.getModelo());
					listaCarro.add(c);
				}
			}
			LeituraEscrita.relatorioPessoaCarro(carro, listaPessoa);
			carroPessoa();
			break;
		case 4:
			pessoa = Pessoa.mapaPessoa.get(4);
			listaCarro.clear();
			for (Carro c : Carro.mapaCarro.values()) {
				if(c.getIdPessoa() == 4) {
					System.out.println(c.getModelo());
					listaCarro.add(c);
				}
			}
			LeituraEscrita.relatorioPessoaCarro(carro, listaPessoa);
			carroPessoa();
			break;
		case 5:
			pessoa = Pessoa.mapaPessoa.get(5);
			listaCarro.clear();
			for (Carro c : Carro.mapaCarro.values()) {
				if(c.getIdPessoa() == 5) {
					System.out.println(c.getModelo());
					listaCarro.add(c);
				}
			}
			LeituraEscrita.relatorioPessoaCarro(carro, listaPessoa);
			carroPessoa();
			break;
		case 6:
			pessoa = Pessoa.mapaPessoa.get(6);
			listaCarro.clear();
			for (Carro c : Carro.mapaCarro.values()) {
				if(c.getIdPessoa() == 6) {
					System.out.println(c.getModelo());
					listaCarro.add(c);
				}
			}
			LeituraEscrita.relatorioPessoaCarro(carro, listaPessoa);
			carroPessoa();
			break;
		case 7:
			pessoa = Pessoa.mapaPessoa.get(7);
			listaCarro.clear();
			for (Carro c : Carro.mapaCarro.values()) {
				if(c.getIdPessoa() == 7) {
					System.out.println(c.getModelo());
					listaCarro.add(c);
				}
			}
			LeituraEscrita.relatorioPessoaCarro(carro, listaPessoa);
			carroPessoa();
			break;
		case 0:
			menu();
			break;
		default:
			System.out.println("Opção inválida!");
			carroPessoa();
			break;
		}
	}
 }