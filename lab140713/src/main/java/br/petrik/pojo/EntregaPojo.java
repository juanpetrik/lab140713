package br.petrik.pojo;

import java.io.Serializable;

public class EntregaPojo implements Serializable{

	private int idEntrega;
	private String endereco;


	public int getIdEntrega() {
		return idEntrega;
	}
	public void setIdEntrega(int idEntrega) {
		this.idEntrega = idEntrega;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
