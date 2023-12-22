package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Produto;
import ecommerce.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int numero = 0;

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nO produto '" + produto.getName() + "' foi cadastrado com sucesso!");
	}

	@Override
	public void listarTodos() {
		for (var produto : listaProdutos) {
			produto.verInfoProduto();
		}
	}

	@Override
	public void atualizar(Produto produto) {

	}

	@Override
	public void deletar(Produto produto) {

	}

	public int gerarIdProduto() {
		return ++numero;
	}

	public void listarProdutosCategoria(int category) {
		for (Produto produto : listaProdutos) {
			if (produto.getCategory() == category) {
			System.out.println("\n\nProdutos disponíveis na categoria '" + produto.getCategoryName() + "': ");			
				produto.verInfoProduto();
			}
		}
	}
	
	public void buyProduct(int productId) {
		for (Produto produto : listaProdutos) {
			if (produto.getId() == productId) {
				System.out.println("\nCompra efetuada com sucesso! Você comprou: " + produto.getName() + ", por R$" + produto.getPrice());
			}
		}
	}

}
