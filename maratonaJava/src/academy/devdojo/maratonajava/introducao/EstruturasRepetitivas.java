package academy.devdojo.maratonajava.introducao;

public class EstruturasRepetitivas {
    // no intelij se digitamos o fori ele ja monta o for
    public static void main(String[] args) {
        // while , do while, for
        // ctrl f2 paramos o programa, sempre quando utilizarmos devemos colocar uma opção de parada.

        int count =  0;

        while (count <10){
            System.out.println(count);
            count ++;
        }
        //  ou
        while (count <10){
            System.out.println(++count);
        }

        // se colocar um valor falso ele não vai executar..

        // do while: ele vai executar pelomenos 1 vez, independe de ser true ou false.

        count =  0;

        do {
            System.out.printf("Dentro- do do-while"+ ++count); // condição de parada;
        }while (count <10);

        // for: temos 3 partes,
        // 1:  geralmente o indice e a primeira parte,
        // 2: declaramos até onde ele vai.
        // 3: incrementação.

        int number = 10;
        for(int i = 0; i< 1000; i++){
            break;
        }
    };


};
