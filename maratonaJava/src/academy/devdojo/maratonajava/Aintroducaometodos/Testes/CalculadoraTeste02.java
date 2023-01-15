package academy.devdojo.maratonajava.Aintroducaometodos.Testes;

import academy.devdojo.maratonajava.Aintroducaometodos.Dominio.Calculadora;

public class CalculadoraTeste02 {
    public static void main(String[] args) {
        Calculadora cl = new Calculadora();
// quando passamos os parâmetros na hora que estamos chamando, o nome seria argumento
        // crtl p indentifica os parametros
        cl.multiplaDoisNumeros(10, 20);

        double result = cl.divideDoisNumeros(10,10); // o metodo executa e retorna na variavel result.

        System.out.println(result);  // mostrando o valor que deu no método.






    }
}
