package academy.devdojo.maratonajava.introducao;

public class ExerciciosEstruturasCondicionais {
    public static void main(String[] args) {

        byte day = 5;

        switch (day){
            case 1:
                System.out.printf("Final de semana");
                break;
            case 2:
                System.out.printf("Dia util");
                break;
            case 3:
                System.out.printf("Dia util");
                break;
            case 4:
                System.out.printf("Dia util");
                break;
            case 5:
                System.out.printf("Dia util");
                break;
            case 6:
                System.out.printf("Dia util");
                break;
            case 7:
                System.out.printf("Final de semana");
                break;
            default:
                System.out.printf("Valor invalido");
        }

        // forma melhor de executar esse exemplo:

        switch (day){

            case 1:
            case 7:
                System.out.println();
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("opção invalida");
                break;
        }


    }
}
