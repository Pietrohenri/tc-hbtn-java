package analisador_frase;

import java.util.TreeMap;

public class AnalisadorFrase {

    public static TreeMap<String, Integer> contagemPalavras(String frase) {
        frase = frase.toLowerCase();
        TreeMap<String, Integer> map = new TreeMap<>();

        frase = frase.replaceAll("[?.!]*", "");
        String[] lista = frase.split(" ");

        for (int i = 0; i < lista.length; i++) {
            if (map.containsKey(lista[i])) {
                map.put(lista[i], map.get(lista[i]) + 1);
            } else {
                map.put(lista[i], 1);
            }

        }
        return map;
    }

}