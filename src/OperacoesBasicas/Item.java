package OperacoesBasicas;

public class Item {
    private String nome;
    private double preco;
    private int qtde;


    public Item(String nome, double preco, int qtde){
        this.nome = nome;
        this.preco = preco;
        this.qtde = qtde;
    }

    public String getNome() {
        return nome;
    }

    public int getQtde() {
        return qtde;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", qtde=" + qtde +
                '}';
    }
}
