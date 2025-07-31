package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adcionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavra() {
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicao = null;
        if (!dicionarioMap.isEmpty()) {
            definicao = dicionarioMap.get(palavra);
        }
        return definicao;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adcionarPalavra("Carro","Automovel do seculo 21");
        dicionario.adcionarPalavra("Macarrão","Um tipo de Massa utilizado na culinaria italiana");
        dicionario.adcionarPalavra("Mãe","Progenitoria de um bebê");

        dicionario.exibirPalavra();

        dicionario.removerPalavra("Carro");
        dicionario.exibirPalavra();


        System.out.println(dicionario.pesquisarPorPalavra("Mãe"));
    }
}
