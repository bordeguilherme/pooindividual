package br.com.poo.detranst.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import br.com.poo.detranst.classes.Carro;
import br.com.poo.detranst.classes.Pessoa;
import br.com.poo.detranst.enums.SistemaEnum;

public class LeituraEscrita {

	static final String PATH_BASICO = ".\\temp\\";
	static final String EXTENSAO = ".txt";

	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO));
		String linha = "";
		while (true) {
			linha = buffRead.readLine();
			if (linha != null) {
				String[] dados = linha.split(";");
				if (dados[0].equalsIgnoreCase(SistemaEnum.CARRO.getTipo())) {
					Carro c = new Carro(Integer.parseInt(dados[1]), dados[2], dados[3], dados[4], Integer.parseInt(dados[5]),
							dados[6], dados[7], dados[8], Integer.parseInt(dados[9]));
					Carro.mapaCarro.put(Integer.parseInt(dados[1]), c);
				} else if (dados[0].equalsIgnoreCase(SistemaEnum.PESSOA.getTipo())) {
					Pessoa p = new Pessoa(Integer.parseInt(dados[1]), dados[2], dados[3], dados[4], dados[5], dados[6], dados[7]);
					Pessoa.mapaPessoa.put(Integer.parseInt(dados[1]), p);
				}
			} else {
				break;
			}
		}
		buffRead.close();
	}

	public static void relatorioPessoaCarro(Carro carro, List<Pessoa> pessoa) throws IOException {
		String Arquivo = carro.getModelo();
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + Arquivo + EXTENSAO, true));
		buffWrite.append("*************** Relatório **************\n");
		buffWrite.append(carro.getModelo() + ":\n\n");
		if(!pessoa.isEmpty()) {
			for(Pessoa p : pessoa) {
				buffWrite.append(" - " + p.getNome() + "\n");
			}
		} 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		buffWrite.append("\nData da programação: " + sdf.format(date) + "\n");
		buffWrite.append("************* Fim Relatório ************\n");
		buffWrite.close();
	}

}
