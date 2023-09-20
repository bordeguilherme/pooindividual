package br.com.poo.detranst.menu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import br.com.poo.detranst.classes.Carro;
import br.com.poo.detranst.classes.Pessoa;
import br.com.poo.detranst.io.LeituraEscrita;
import java.util.logging.Logger;

public class Menu {
	
	private static final Logger logger = Logger.getLogger(Menu.class.getName());
	
	static Scanner sc = new Scanner(System.in);

	public static void menu() throws IOException {

		logger.info("Menu\n\n[1]\tListar carros\n[2]\tListar proprietários\n[3]\tListar carros de cada pessoa\n"
				+ "[0]\tSair\n\nDigite a opção desejada: ");
		
		int opc = sc.nextInt();

		switch (opc) {
		case 1:
			logger.info("\n\nLista de carros: ");
			for (Carro c : Carro.mapaCarro.values()) {
				logger.info(c.getModelo());
			}
			logger.info("\n\n");
			menu();
			break;
		case 2:
			logger.info("\n\nLista de proprietários: ");
			for (Pessoa p : Pessoa.mapaPessoa.values()) {
				logger.info(p.getNome());
			}
			logger.info("\n\n");
			menu();
			break;
		case 3:
			carroPessoa();
			break;
		case 0:
			logger.info("Volte sempre!");
			break;
		default:
			logger.info("Opção inválida!");
			menu();
			break;
		}
	}
	
	public static void carroPessoa() throws IOException {
		List<Pessoa> listaPessoa = new ArrayList<>();
		List<Carro> listaCarro = new ArrayList<>();
		Pessoa pessoa = null;
		Carro carro = null;
		logger.info(
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
					logger.info(c.getModelo());
					listaCarro.add(c);
				}
			}
			LeituraEscrita.relatorioPessoaCarro(carro, pessoa, listaPessoa);
			carroPessoa();
			break;
		case 2:
			pessoa = Pessoa.mapaPessoa.get(2);
			listaCarro.clear();
			for (Carro c : Carro.mapaCarro.values()) {
				if(c.getIdPessoa() == 2) {
					logger.info(c.getModelo());
					listaCarro.add(c);
				}
			}
			LeituraEscrita.relatorioPessoaCarro(carro, pessoa, listaPessoa);
			carroPessoa();
			break;
		case 3:
			pessoa = Pessoa.mapaPessoa.get(3);
			listaCarro.clear();
			for (Carro c : Carro.mapaCarro.values()) {
				if(c.getIdPessoa() == 3) {
					logger.info(c.getModelo());
					listaCarro.add(c);
				}
			}
			LeituraEscrita.relatorioPessoaCarro(carro, pessoa, listaPessoa);
			carroPessoa();
			break;
		case 4:
			pessoa = Pessoa.mapaPessoa.get(4);
			listaCarro.clear();
			for (Carro c : Carro.mapaCarro.values()) {
				if(c.getIdPessoa() == 4) {
					logger.info(c.getModelo());
					listaCarro.add(c);
				}
			}
			LeituraEscrita.relatorioPessoaCarro(carro, pessoa, listaPessoa);
			carroPessoa();
			break;
		case 5:
			pessoa = Pessoa.mapaPessoa.get(5);
			listaCarro.clear();
			for (Carro c : Carro.mapaCarro.values()) {
				if(c.getIdPessoa() == 5) {
					logger.info(c.getModelo());
					listaCarro.add(c);
				}
			}
			LeituraEscrita.relatorioPessoaCarro(carro, pessoa, listaPessoa);
			carroPessoa();
			break;
		case 6:
			pessoa = Pessoa.mapaPessoa.get(6);
			listaCarro.clear();
			for (Carro c : Carro.mapaCarro.values()) {
				if(c.getIdPessoa() == 6) {
					logger.info(c.getModelo());
					listaCarro.add(c);
				}
			}
			LeituraEscrita.relatorioPessoaCarro(carro, pessoa, listaPessoa);
			carroPessoa();
			break;
		case 7:
			pessoa = Pessoa.mapaPessoa.get(7);
			listaCarro.clear();
			for (Carro c : Carro.mapaCarro.values()) {
				if(c.getIdPessoa() == 7) {
					logger.info(c.getModelo());
					listaCarro.add(c);
				}
			}
			LeituraEscrita.relatorioPessoaCarro(carro, pessoa, listaPessoa);
			carroPessoa();
			break;
		case 0:
			menu();
			break;
		default:
			logger.info("Opção inválida!");
			carroPessoa();
			break;
		}
	}
 }