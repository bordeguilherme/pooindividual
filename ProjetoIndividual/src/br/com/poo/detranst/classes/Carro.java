package br.com.poo.detranst.classes;

import java.util.HashMap;
import java.util.Map;

public class Carro {

	private Integer idcarro;
	private String modelo;
	private String marca;
	private String placa;
	private Integer ano;
	private String cddregistro;
	private String ufregistro;
	private String paisregistro;
	private Integer idPessoa;
	
	public static Map<Integer, Carro> mapaCarro = new HashMap<>();
	
	public Carro() {
		super();
	}
	
	public Carro(Integer idcarro, String modelo, String marca, String placa, Integer ano, String cddregistro, String ufregistro,
			String paisregistro, Integer idPessoa) {
		super();
		this.idcarro = idcarro;
		this.modelo = modelo;
		this.marca = marca;
		this.placa = placa;
		this.ano = ano;
		this.cddregistro = cddregistro;
		this.ufregistro = ufregistro;
		this.paisregistro = paisregistro;
		this.idPessoa = idPessoa;
	}

	public Integer getIdCarro() {
		return idcarro;
	}

	public String getModelo() {
		return modelo;
	}
	public String getMarca() {
		return marca;
	}

	public String getPlaca() {
		return placa;
	}
	public Integer getAno() {
		return ano;
	}
	public String getCddRegistro() {
		return cddregistro;
	}
	public String getUfRegistro() {
		return ufregistro;
	}

	public String getPaisRegistro() {
		return paisregistro;
	}
	public Integer getIdPessoa() {
		return idPessoa;
	}
}
