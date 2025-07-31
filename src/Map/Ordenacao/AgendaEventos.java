package Map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        Evento evento = null;
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if (entry.getKey().equals(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O proximo evento é :" + entry.getValue() + ", que ira acontecer na data:" + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2025,8,15),"Parque","Carrosel");
        agendaEventos.adicionarEvento(LocalDate.of(2025,9,13),"Praia","ToboAgua");
        agendaEventos.adicionarEvento(LocalDate.of(2025,10,10),"Shangai","MontanhaRussa");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
