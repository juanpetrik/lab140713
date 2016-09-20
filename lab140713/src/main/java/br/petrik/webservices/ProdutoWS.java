package br.petrik.webservices;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebService;

import br.petrik.EJB.ProdutoEJB;
import br.petrik.persistencia.Produto;

@WebService
public class ProdutoWS {

	@EJB
	ProdutoEJB produtoEJB;

	public void salvarService(Produto produto){
		produtoEJB.salvar(produto);
	}

	public void alterarService(Produto produto){
		produtoEJB.alterar(produto);
	}

	public void deletarService(Produto produto){
		produtoEJB.deletar(produto);
	}

	public List<Produto> listarTodosService(){
		return produtoEJB.listarTodos();
	}

	public Produto getProdutoService(int id){
		return produtoEJB.getProduto(id);
	}
}
