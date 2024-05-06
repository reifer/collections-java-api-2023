package Map.OperacoesBasicasMap;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        } else {
            System.out.println("O dicionário está vazio!");
        }
    }

    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String palavraPorNome = null;
        if (!dicionarioMap.isEmpty()) {
            palavraPorNome = dicionarioMap.get(palavra);
            if (palavraPorNome == null) {
                System.out.println("Palavra não encontrada.");
            }
        } else {
            System.out.println("O dicionário está vazio!");
        }
        return palavraPorNome;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Jesus", "O nome Jesus tem origem no hebraico Yeshua, que significa \"Yahweh é salvação\" ou \"Deus é salvação\".");
        dicionario.adicionarPalavra("Abraão", "Derivado da palavra \"Avraham,\" que significa \"pai de muitas nações,\"");
        dicionario.adicionarPalavra("Isaque", "O significado do nome Isaque é \"riso\" ou \"ele ri\". Ele deriva da raiz hebraica \"tzachaq\", que significa \"rir\" ou \"dar rir\".");
        dicionario.adicionarPalavra("Jacó", "Jacó significado suplantador em hebraico, ou seja, aquele que segura pelo calcanhar, e em grego, significa \"aquele que lutou com Deus\".");
        dicionario.exibirPalavras();

        dicionario.removerPalavra("Jacó");
        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("Jesus"));
    }
}
