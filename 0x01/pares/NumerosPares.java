package pares;

public class NumerosPares {
    public static void main(String[] args) {
        int numero = 98;
        for (int i = 0; i < 98; i++){
            if (i % 2 == 0){
                System.out.printf(i + ", ");

            }
        }
        System.out.printf("%d\n", numero);
    }
}
