package OperacoesBasicasSet.PalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "palavraSet=" + palavraSet +
                '}';
    }

    public void adicionarPalavra(String palavra){
        //this.palavraSet.add(palavra);
        palavraSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        if (!palavraSet.isEmpty()){
            if (palavraSet.contains(palavra)){
                palavraSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto!");
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public boolean verificarPalavra(String palavra){
        return palavraSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        if (!palavraSet.isEmpty()){
            System.out.println(palavraSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Java");
        conjuntoPalavrasUnicas.adicionarPalavra("Java");
        conjuntoPalavrasUnicas.adicionarPalavra("Cobol");
        conjuntoPalavrasUnicas.adicionarPalavra("JavaScript");
        conjuntoPalavrasUnicas.adicionarPalavra("C#");
        System.out.println(conjuntoPalavrasUnicas);

        conjuntoPalavrasUnicas.removerPalavra("Cobol");
        System.out.println(conjuntoPalavrasUnicas);

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println("A linguagem 'Cobol' está no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("Cobol"));
        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("Java"));
    }
}