package academy.devdojo.maratonajava.introducao;

public class ExerciciosEstruturarRepetitivas {
    public static void main(String[] args) {
        // imprima todos numeros pares de ate 1000.


//        int number = 0;
//
//        for (int i = 0; i < 1000; i++) {
//            if ( i  % 2 == 0){
//                System.out.println(i);
//        }
//        }

        // proximo exercicio:
        int valueMax = 50;

        for (int i = 0; i <= valueMax; i++) {
            if(i > 25){
                break;                              // condição de parada.
            }
            System.out.println(i);

        }

    }
}
