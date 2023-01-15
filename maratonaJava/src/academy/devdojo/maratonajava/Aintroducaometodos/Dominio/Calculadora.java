package academy.devdojo.maratonajava.Aintroducaometodos.Dominio;

// public: modificador de acesso.
public class Calculadora {
 /* Métodos:
 1ª parte sempre vai ser o modificador de acesso.
 2ª parte é o retorno, (não necessariamente o método precisa retornar algo) ex:
   public void nomeDoMétodo = acesso pulico, sem retorno (sem saída para quem chama)

   os metodos sempre sempre são executados dentro do objeto
   crtcl b vai para dentro da classe.
  */

    public void somaDoisNumeros (){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(21 - 2);
    }

    /*
        quando retorna :
       1º precisamos ter um identificador (tipo da variavel e um nome)
            -podemos colocar mais de um parâmetro.
       2º

     */
    public void multiplaDoisNumeros(int num, int num2){
        System.out.println(num * num2);
    }

    /*
    Métodos que possuem retorno:

     */

    public double divideDoisNumeros(double num1, double num2){
        if (num2 != 0){
            return num1 / num2;
        }
        return 0; // funciona como um break..
    }

    // podemos usar para void

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2){
        if(num2 ==0){
            System.out.println("Não existe divisão de dois numeros");
            return; // break para metodos voids, pois se o if for exucutado ele ja para o metodo.(não exucutando o println)
        }
        System.out.println(num1 / num2);
        }

    public void alteraDoisNumeros(int num1, int num2){ // passando variaveis do tipo primitivo dentro da classe
        num1 = 99;
        num2 = 33; // não importa o que aconteca dentro do metodo a variavel não muda

    }
}
