package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome,codigoConvite));
    }

    public void removerConvidado(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidado(){
        return convidadoSet.size();
    }

    public void exibirConvidado(){
        System.out.println(convidadoSet);
    }

    @Override
    public String toString() {
        return "ConjuntoConvidados{" +
                "convidadoSet=" + convidadoSet +
                '}';
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoconvidados = new ConjuntoConvidados();
        conjuntoconvidados.adicionarConvidado("Marcelo",1);
        conjuntoconvidados.adicionarConvidado("Caio",2);
        conjuntoconvidados.adicionarConvidado("Giovanna",3);
        conjuntoconvidados.adicionarConvidado("Bia",4);
        conjuntoconvidados.exibirConvidado();

        conjuntoconvidados.removerConvidado(2);

        conjuntoconvidados.exibirConvidado();
        System.out.println(conjuntoconvidados.contarConvidado());
    }
}
