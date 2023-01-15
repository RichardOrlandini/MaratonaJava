package academy.devdojo.maratonajava.introducao;

public class RepeticãoExercicio06 {
    // dado um valor de um carro, descubra o quanto ele pode ser parcelado.
    // a condição é que o value of parcela deve ser igual a 1000
    public static void main(String[] args) {

            double valorTotal = 30000;

        for (int parcela = 1; parcela <valorTotal ; parcela++) {
               double valorParcela = valorTotal / parcela;
               if (valorParcela < 1000){
                   break;
               }
            System.out.println("Parcela: " +parcela+ " R$" +valorParcela);

        }

    }
}
