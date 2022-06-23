package duplicados;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class NumerosDuplicados {
    public static TreeSet<Integer> buscar(int[] numeros) {
        TreeSet<Integer> set = new TreeSet<>();

        Set<Integer> duplicados = new HashSet<>();

        for (int i : numeros) {
            if (duplicados.contains(i)) {
                set.add(i);
            } else {
                duplicados.add(i);
            }

        }

        return set;
    }

}
