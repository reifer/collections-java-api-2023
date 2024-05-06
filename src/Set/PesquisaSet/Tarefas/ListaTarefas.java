package Set.PesquisaSet.Tarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>() ;
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefasParaRemover = null;

        if (!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefasParaRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefasParaRemover);
        } else {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        for (Tarefa t : tarefaSet) {
            if (!t.isTarefaConcluida()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();

        for (Tarefa t : tarefaSet) {
            if (!t.isTarefaConcluida()) {
                tarefasNaoConcluidas.add(t);
            }
        }
        return tarefasNaoConcluidas;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setTarefaConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaMarcarComoPendente = null;

        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaMarcarComoPendente = t;
                break;
            }
        }
        if (tarefaMarcarComoPendente!= null) {
            if (tarefaMarcarComoPendente.isTarefaConcluida()) {
                tarefaMarcarComoPendente.setTarefaConcluida(false);
            }
        } else {
            System.out.println("A tarefa não foi encontrada na lista.");
        }
    }

    public void limparListaTarefas() {
        if (tarefaSet.isEmpty()) {
            System.out.println("A lista já está vazia!");
        } else {
            tarefaSet.clear();
        }
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Estudar Python");
        listaTarefas.adicionarTarefa("Estudar Cobol");
        listaTarefas.adicionarTarefa("Se preparar para aula de MBA");
        listaTarefas.adicionarTarefa("Estudar para o vestibular");
        listaTarefas.exibirTarefas();

        listaTarefas.removerTarefa("Estudar Python");
        listaTarefas.exibirTarefas();

        System.out.println("O total de tarefas na lista é: " + listaTarefas.contarTarefas());

        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaConcluida("Estudar Java");
        listaTarefas.marcarTarefaConcluida("Se preparar para aula de MBA");

        System.out.println(listaTarefas.obterTarefasConcluidas());

        listaTarefas.marcarTarefaPendente("Estudar para o vestibular");
        listaTarefas.marcarTarefaPendente("Estudar Python");

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
