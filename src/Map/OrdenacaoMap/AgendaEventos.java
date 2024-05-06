package Map.OrdenacaoMap;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
//        Set<LocalDate> dateSet = eventoMap.keySet();
//        Collection<Evento> values = eventoMap.values();
//        eventoMap.get();

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("o próximo evento será na data " + proximoEvento + " acontecerá na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        System.out.println(LocalDate.now());

        agendaEventos.adicionarEvento(LocalDate.of(2024, 12, 15), "Meu aniversário", "Comemoração no Outback");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 5, 12), "Dia das Mães", "Almoçar na minha Mãe ou na Sogra");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 7, 7), "Niver da Fofis", "Fazer uma festinha");
        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
