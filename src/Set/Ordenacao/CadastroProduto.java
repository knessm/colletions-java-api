package Set.Ordenacao;

import java.util.*;

public class CadastroProduto {

    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long cod, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.adicionarProduto("Macarrao", 1L, 29.90, 5);
        cadastroProduto.adicionarProduto("Carne", 2L, 19.90, 2);
        cadastroProduto.adicionarProduto("Leite", 1L, 15.90, 4);
        cadastroProduto.adicionarProduto("Frngo", 4L, 13.90, 9);

        System.out.println(cadastroProduto.exibirProdutosPorNome());
        System.out.println(cadastroProduto.exibirProdutosPorPreco());
    }

}
