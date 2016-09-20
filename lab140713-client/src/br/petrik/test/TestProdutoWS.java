package br.petrik.test;

import java.math.BigDecimal;
import java.util.List;

import br.petrik.ProdutoWSclient.Produto;
import br.petrik.ProdutoWSclient.ProdutoWS;
import br.petrik.ProdutoWSclient.ProdutoWSService;

public class TestProdutoWS {

	public static void main(String[] args) {

		ProdutoWSService entregaWS = new ProdutoWSService();

		ProdutoWS produtoWSPort = entregaWS.getProdutoWSPort();

		Produto p = new Produto();
		p.setDescricao("Arroz");
		p.setCodBarras("789347564643");
		p.setPreco(new BigDecimal("12.00"));

		produtoWSPort.salvarService(p);

		Produto p2 = new Produto();
		p2.setDescricao("Feijão");
		p2.setCodBarras("78945646656");
		p2.setPreco(new BigDecimal("9.00"));

		produtoWSPort.salvarService(p2);

		Produto p3 = new Produto();
		p3.setDescricao("Macarrão");
		p3.setCodBarras("78978768768887");
		p3.setPreco(new BigDecimal("6.00"));

		produtoWSPort.salvarService(p3);

		List<Produto> listarTodosService = produtoWSPort.listarTodosService();

		for (Produto produto : listarTodosService) {
			System.out.println(produto.getId() + "\t" + produto.getDescricao() + "\t" + produto.getCodBarras() + "\t" + produto.getPreco());
		}

		produtoWSPort.deletarService(p2);


		List<Produto> listarTodosService2 = produtoWSPort.listarTodosService();

		for (Produto produto : listarTodosService2) {
			System.out.println(produto.getId() + "\t" + produto.getDescricao() + "\t" + produto.getCodBarras() + "\t" + produto.getPreco());
		}
	}


}
