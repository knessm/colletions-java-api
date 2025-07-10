package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //atributo lista de numeros inteiros
    private List<Integer> listaInteiros;

    public SomaNumeros() {
        this.listaInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaInteiros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        if(!listaInteiros.isEmpty()){
            for (int i : listaInteiros){
                soma += i;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if (!listaInteiros.isEmpty()){
            for (Integer i : listaInteiros){
                if(i >= maiorNumero){
                    maiorNumero = i;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if (!listaInteiros.isEmpty()){
            for (Integer i : listaInteiros){
                if(i <= menorNumero){
                    menorNumero = i;
                }
            }
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        System.out.println(listaInteiros);
    }

    @Override
    public String toString() {
        return "SomaNumeros{" +
                "listaInteiros=" + listaInteiros +
                '}';
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(1);

//        System.out.println("--------------------------------------");
        somaNumeros.exibirNumeros();
        System.out.println("--------------------------------------");
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
        System.out.println(somaNumeros.calcularSoma());
    }
}
