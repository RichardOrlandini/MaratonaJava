package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.testes;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro cr = new Carro();
        Carro cr1 = new Carro();


        cr.name = "Fiate";
        cr.model = "Sporte";
        cr.date= 2019;

        cr1.name = "Ronda";
        cr1.model = "Popular";
        cr1.date = 2021;

        System.out.println("Carro 1");
        System.out.println(cr.name + cr.model + cr.date);
        System.out.println("\n Carro 2");
        System.out.println(cr1.name + cr1.model + cr1.date);

    }

}
