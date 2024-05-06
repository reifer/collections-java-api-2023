package Set.PesquisaSet.Agenda;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){

        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }
            return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Renata Sarmento", 984755063);
        agendaContatos.adicionarContato("Natalia Sarmento", 984755063);
        agendaContatos.adicionarContato("Mirela Sarmento", 984755063);
        agendaContatos.adicionarContato("Ana Lara Sarmento", 984755063);
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Renata"));

        System.out.println("Contato Atualizado: " + agendaContatos.atualizarNumeroContato("Renata Sarmento", 984757821));

        agendaContatos.exibirContatos();
    }
}