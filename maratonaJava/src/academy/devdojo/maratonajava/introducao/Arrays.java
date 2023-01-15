package academy.devdojo.maratonajava.introducao;

public class Arrays {
    // somente variaveis do tipo reference podem ser inicializadas com null : ex [], String

    // ao declarar um array precisamos utilizar o new e declarar o espaço em mémoria que ele vai ocupar;
    public static void main(String[] args) {

       int[] idades = new int[10];
      //  System.out.println(idades); imprimimos a posição dele na memoria.

        System.out.println(idades[0]);

        // inserir valores dentro do indice:

       String[] names = new String[10];

       names[0] = "Goku";
       names[1] = "Vegeta";
       names[2] = "Gohan";

       // para inprimir esses valores:
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }

}
