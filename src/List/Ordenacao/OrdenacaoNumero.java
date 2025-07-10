package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumero {
    //atributo
    private List<Integer> numerosList;

    public OrdenacaoNumero() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendente = new ArrayList<>(numerosList);
        if (!numerosList.isEmpty()) {
            Collections.sort(numerosAscendente);
        }
        return numerosAscendente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDescendente = new ArrayList<>(numerosList);
        if (!numerosList.isEmpty()) {
            numerosDescendente.sort(Collections.reverseOrder());
        }
        return numerosDescendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumero ordenacaoNumero = new OrdenacaoNumero();
        ordenacaoNumero.adicionarNumero(2);
        ordenacaoNumero.adicionarNumero(1);
        ordenacaoNumero.adicionarNumero(5);

        System.out.println(ordenacaoNumero.ordenarAscendente());
        System.out.println(ordenacaoNumero.ordenarDescendente());
    }
}
