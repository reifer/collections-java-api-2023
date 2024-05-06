package Set.OrdenacaoSet.ListaAlunos;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Aluno alunosParaRemover = null;
        if (!alunoSet.isEmpty()) {
            for (Aluno a : alunoSet) {
                if (a.getMatricula() == matricula) {
                    alunosParaRemover = a;
                    break;
                }
            }
            alunoSet.remove(alunosParaRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
        if (alunosParaRemover == null) {
            System.out.println("Matricula não encontrada!");
        }
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        if (!alunoSet.isEmpty()) {
            System.out.println(alunosPorNome);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
        if (!alunoSet.isEmpty()) {
            alunosPorNota.addAll(alunoSet);
            System.out.println(alunosPorNota);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Ana Lara", 140310L, 9d);
        gerenciadorAlunos.adicionarAluno("Natália", 170304L, 9.5d);
        gerenciadorAlunos.adicionarAluno("Mirela", 180728L, 9.6d);
        gerenciadorAlunos.adicionarAluno("Reinaldo", 791215L, 9d);
        System.out.println(gerenciadorAlunos.alunoSet);

        gerenciadorAlunos.removerAluno(000000L);
        gerenciadorAlunos.removerAluno(791215L);
        System.out.println(gerenciadorAlunos.alunoSet);

        gerenciadorAlunos.exibirAlunosPorNome();
        gerenciadorAlunos.exibirAlunosPorNota();
    }
}