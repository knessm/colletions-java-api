package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavras(String palavra, int contagem){
        contagemPalavrasMap.put(palavra,contagem);
    }

    public void removerPalavra(String palavra){
        if(!contagemPalavrasMap.isEmpty()){
            contagemPalavrasMap.remove(palavra);
        }
    }

    public void exibirContagemPalavra(){
        System.out.println(contagemPalavrasMap);
    }

    public String encontrarPalavraMaisFrequente(){
        String palavra = null;
        int qtde = Integer.MIN_VALUE;
        if (!contagemPalavrasMap.isEmpty()){
            for (Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()){
                if (entry.getValue() > qtde){
                    qtde = entry.getValue();
                    palavra = entry.getKey();
                }
            }
        }
        return palavra;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavras("Oi",14);
        contagemPalavras.adicionarPalavras("Carro",18);
        contagemPalavras.adicionarPalavras("Pato",16);
        contagemPalavras.adicionarPalavras("Olá",3);

        contagemPalavras.exibirContagemPalavra();

        contagemPalavras.removerPalavra("Pato");

        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());
    }
}
