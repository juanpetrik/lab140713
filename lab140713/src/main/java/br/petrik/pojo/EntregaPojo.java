package br.petrik.pojo;

import java.io.Serializable;

public class EntregaPojo implements Serializable {

	private static final long serialVersionUID = 1L;

	private int idEntrega;
	private String endereco;

	public EntregaPojo(int i, String string) {
		this.idEntrega = i;
		this.endereco = string;
	}

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
