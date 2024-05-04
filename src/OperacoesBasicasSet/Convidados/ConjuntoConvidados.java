package OperacoesBasicasSet.Convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Ana Lara", 1003);
        conjuntoConvidados.adicionarConvidado("Natália", 0403);
        conjuntoConvidados.adicionarConvidado("Mirela", 2807);
        conjuntoConvidados.adicionarConvidado("Renata", 2610);
        conjuntoConvidados.adicionarConvidado("Junior", 1512);
        System.out.println("Exixtem " + conjuntoConvidados.contarConvidados() + " conviados dentro do Set de Convidados");

        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(0403);
        System.out.println("Exixtem " + conjuntoConvidados.contarConvidados() + " conviados dentro do Set de Convidados");
        conjuntoConvidados.exibirConvidados();
    }
}