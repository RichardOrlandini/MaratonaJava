package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {


        // operation logics
        // && = AND  || = or  ! = not

        int idade = 35;
        float salario = 1000F; // 1000

        // forma de atribuir o valor mais uma segunda atribuição.
        System.out.println(salario);
        salario += 1000; // 2000
        System.out.println(salario);

        salario -= 1000; // 1000
        System.out.println(salario);

        // incrementation
        // adicionar 1
        int xAttemps  = 0;
        xAttemps += 1;
        // ++ --
        xAttemps++; // adicionando + 1 em memória.
        xAttemps--;


        //

        int contador2 = 0;
        System.out.println(contador2++); // 0 valor quando imprimir ainda vai ser 0, pois o ++ está depois
        System.out.println(contador2); // aqui o valor ja será 1.

    }
}
