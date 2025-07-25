package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> conjuntoPalavras;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        conjuntoPalavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        String palavraRemover = null;
        if (!conjuntoPalavras.isEmpty()){
            for (String s : conjuntoPalavras){
                if (s.equalsIgnoreCase(palavra)){
                    palavraRemover = s;
                    break;
                }
            }
            conjuntoPalavras.remove(palavraRemover);
        }
    }

    public boolean verificaPalavra(String palavra){
        boolean terPalavra = false;
        if (!conjuntoPalavras.isEmpty()){
            terPalavra = conjuntoPalavras.contains(palavra);
        }
        return terPalavra;
    }

    public void exibirPalavras(){
        System.out.println(conjuntoPalavras);
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "stringSet=" + conjuntoPalavras +
                '}';
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("Marcelo");
        conjuntoPalavrasUnicas.adicionarPalavra("Carro");
        conjuntoPalavrasUnicas.adicionarPalavra("Mesa");
        conjuntoPalavrasUnicas.adicionarPalavra("Mesa de Cama");
        conjuntoPalavrasUnicas.exibirPalavras();

        conjuntoPalavrasUnicas.removerPalavra("Mesa");
        conjuntoPalavrasUnicas.exibirPalavras();
        System.out.println(conjuntoPalavrasUnicas.verificaPalavra("M"));

    }
}
