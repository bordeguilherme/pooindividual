package br.com.poo.detranst;

import java.io.IOException;
import br.com.poo.detranst.io.LeituraEscrita;
import br.com.poo.detranst.menu.Menu;

public class Relacao_Pessoa_Carro {

	public static void main(String[] args) {
		try {
			LeituraEscrita.leitor("banco");
			Menu.menu();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}