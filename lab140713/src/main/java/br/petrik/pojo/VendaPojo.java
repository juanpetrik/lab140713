package br.petrik.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class VendaPojo implements Serializable {

	private static final long serialVersionUID = 1L;

	private int idVenda;
	private List<String> itens;
	private BigDecimal total;

	public VendaPojo(int idVenda, List<String> itens, BigDecimal total) {
		super();
		this.idVenda = idVenda;
		this.itens = itens;
		this.total = total;
	}

	public int getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}

	public List<String> getItens() {
		return itens;
	}

	public void setItens(List<String> itens) {
		this.itens = itens;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

}
