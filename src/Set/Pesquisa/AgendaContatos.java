package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome,numero));
    }

    public void exibrContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        if(!contatoSet.isEmpty()){
            for (Contato c : contatoSet){
                if (c.getNome().startsWith(nome)){
                    contatoPorNome.add(c);
                }
            }
        }
        return contatoPorNome;
    }

    public void atualizarNumeroContato(String nome, int novoNumero){
        if (!contatoSet.isEmpty()){
            for (Contato c :contatoSet){
                if (c.getNome().equalsIgnoreCase(nome)){
                    c.setNumero(novoNumero);
                    System.out.println("Contato Atualizado");
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Marcelo",123);
        agendaContatos.adicionarContato("Socorro", 321);
        agendaContatos.adicionarContato("Amor",990);
        agendaContatos.exibrContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Amor"));
        agendaContatos.atualizarNumeroContato("Marcelo", 678);
        agendaContatos.exibrContatos();
    }
}
