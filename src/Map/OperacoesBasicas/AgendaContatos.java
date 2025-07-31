package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatosMap.isEmpty()) {
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer telefonePorNome = null;
        if (!agendaContatosMap.isEmpty()) {
            telefonePorNome = agendaContatosMap.get(nome);
        }
        return telefonePorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Marcelo", 12345);
        agendaContatos.adicionarContato("João", 18479);
        agendaContatos.adicionarContato("Caio", 14783);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Marcelo");

        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Caio"));
    }


}
