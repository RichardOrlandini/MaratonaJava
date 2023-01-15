package academy.devdojo.maratonajava.introducao;

public class ArraysForit {
    public static void main(String[] args) {
        // sabemos que podemos inicializar os arrays da forma convencional
        // Uma nova forma de fazer o mesmo:

        int[] numbers = {1,2,3,4,5};

        for (int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers[i]);
        }

        // ou:
        int[] numberns2 = new int[]{1,2,3,4,5};

        // foreach: Ele faz a mesma coisa porém não utilizamos o indice.
        for (int num: numberns2) {
            System.out.println(num);
        }

    }
}
