package br.com.poo.detranst.enums;

public enum SistemaEnum {

	PESSOA("pessoa", 1),
	CARRO("carro", 2);

	private String tipo;
	private int id;
	
	SistemaEnum(String tipo, int id) {
		this.tipo = tipo;
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public int getId() {
		return id;
	}
	
}
