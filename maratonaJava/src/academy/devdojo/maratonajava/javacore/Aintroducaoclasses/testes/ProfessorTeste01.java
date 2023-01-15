package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.testes;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {

        Professor pf = new Professor();

        pf.nome = "Mestre Kame";
        pf.idade = 147;
        pf.sexo = 'M';
        System.out.println(pf.nome + " de " +pf.idade+ " de " +pf.sexo);
    }
}
