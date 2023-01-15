package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
         // condition  IF = se
        if(true){ // o result do if sempre é boolean, temos um bloco
            System.out.println("Dentro do if");
        }

        int idade = 20;
        if (idade  >= 17){
            System.out.println("Dentro do if");
        }else if(idade >= 20 && idade <=30){
            System.out.println("Fora do if");
        }else{
            System.out.println("xxx");
        }

        //imprima o dia da semana, considerando o domingo 1

        byte dia = 5;
        // char, int, byte , short , enum e String
        // utilizamos o break para parar, se não ele executa os casos sem parar.
        switch (dia ){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:                                        // sempre utilizar
                System.out.printf("Opção invalida");
                break;
        }


    }
}
