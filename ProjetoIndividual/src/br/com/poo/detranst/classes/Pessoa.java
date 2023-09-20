package br.com.poo.detranst.classes;

import java.util.HashMap;
import java.util.Map;

public class Pessoa {

	private Integer idpessoa;
	private String nome;
	private String cpf;
	private String datanasc;
	private String cidade;
	private String uf;
	private String pais;
	
	public static Map<Integer, Pessoa> mapaPessoa = new HashMap<>();
	
	public Pessoa() {
		super();
	}

	public Pessoa(Integer idpessoa, String nome, String cpf,String datanasc, String cidade, String uf, String pais) {
		super();
		this.idpessoa = idpessoa;
		this.nome = nome;
		this.cpf = cpf;
		this.datanasc = datanasc;
		this.cidade = cidade;
		this.uf = uf;
		this.pais = pais;
	}

	public Integer getIdPessoa() {
		return idpessoa;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
	public String getDataNasc() {
		return datanasc;
	}

	public String getCidade() {
		return cidade;
	}
	public String getUf() {
		return uf;
	}

	public String getPais() {
		return pais;
	}
}
