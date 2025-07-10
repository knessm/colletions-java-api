package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        Pessoa pessoa = new Pessoa(nome, idade, altura);
        pessoaList.add(pessoa);
    }

    public List<Pessoa> ordernarPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordernarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    @Override
    public String toString() {
        return "OrdenacaoPessoa{" +
                "pessoaList=" + pessoaList +
                '}';
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Marcelo",18,1.68);
        ordenacaoPessoa.adicionarPessoa("Caio",19,1.80);
        ordenacaoPessoa.adicionarPessoa("Giovanna",20,1.62);

        System.out.println(ordenacaoPessoa.ordernarPorAltura());
        System.out.println(ordenacaoPessoa.ordernarPorIdade());
    }
}
