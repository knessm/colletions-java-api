package List.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributo
    private List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }


    public void adicionarItem(String nome, double preco, int qtde){
        Item item = new Item(nome,preco, qtde);
        this.listaItens.add(item);
    }

    public void removerItem(String nome){
        List<Item> itensRemover = new ArrayList<>();

        if (!listaItens.isEmpty()) {
            for(Item i : listaItens){
                if (i.getNome().equalsIgnoreCase(nome)){
                    itensRemover.add(i);
                }
            }
            listaItens.retainAll(itensRemover);
        } else {
            System.out.println("A lista está vazia");
        }

    }

    public double calcularValorTotal(){
        double valorTotal = 0;

        if (!listaItens.isEmpty()) {
            for (Item i : listaItens){
               double valorItem = i.getPreco() * i.getQtde();
               valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirItens(){

        if (!listaItens.isEmpty()) {
            System.out.println(this.listaItens);
        } else {
            System.out.println("A lista está vazia");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "listaItens=" + listaItens +
                '}';
    }
}
