package br.petrik.EJB;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.petrik.persistencia.Produto;

@Stateless
public class ProdutoEJB {

	@PersistenceContext(unitName = "lab140713-persistence-unit")
	private EntityManager em;


	public void salvar(Produto produto){
		em.persist(produto);
	}

	public void alterar(Produto produto){
		em.merge(produto);
	}

	public void deletar(Produto produto){
		em.remove(produto);
	}

	public List<Produto> listarTodos(){
		@SuppressWarnings("unchecked")
		List<Produto> resultList = em.createNativeQuery("select * from Produto", Produto.class).getResultList();

		return resultList;
	}

	public Produto getProduto(int id){
		Produto produto = (Produto) em.createNativeQuery("select * from Produto", Produto.class).getSingleResult();

		return produto;
	}

}
