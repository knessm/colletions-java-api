package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {

    private Set<Tarefa> tarefaSet;

    public ListaTarefa() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefa = null;
        if(!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefa = t;
                    break;
                }
            }
            tarefaSet.remove(tarefa);
        }
    }

    public void exibirTarefa(){
        System.out.println(tarefaSet);
    }

    public void contarTarefa(){
        System.out.println("A lista de tarefas tem " + tarefaSet.size() + " Tarefas");
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet){
                if (t.isConluida()){
                    tarefasConcluidas.add(t);
                }
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet){
                if (!t.isConluida()){
                    tarefasConcluidas.add(t);
                }
            }
        }
        return tarefasConcluidas;
    }

    public void marcarTarefaConcluida(String descricao){
        if (!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConluida(true);
                    System.out.println("A tarefa foi marcada como concluida");
                }
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        if (!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConluida(false);
                    System.out.println("A tarefa foi marcada como Pendente");
                }
            }
        }
    }

    public void limparListaTarefas(){
        if (!tarefaSet.isEmpty()){
            tarefaSet.clear();
            System.out.println("A lista de tarefas foi esvaziada");
        }
    }

    @Override
    public String toString() {
        return "ListaTarefa{" +
                "tarefaSet=" + tarefaSet +
                '}';
    }

    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        listaTarefa.adicionarTarefa("Tarefa 4");
        listaTarefa.adicionarTarefa("Tarefa 5");

        listaTarefa.exibirTarefa();
        listaTarefa.contarTarefa();

        listaTarefa.marcarTarefaConcluida("Tarefa 1");
        listaTarefa.marcarTarefaConcluida("Tarefa 2");
        listaTarefa.marcarTarefaConcluida("Tarefa 3");

        System.out.println(listaTarefa.obterTarefasConcluidas());
        System.out.println(listaTarefa.obterTarefasPendentes());

        listaTarefa.marcarTarefaPendente("Tarefa 1");

        listaTarefa.exibirTarefa();
        listaTarefa.limparListaTarefas();

        listaTarefa.exibirTarefa();

    }

}
