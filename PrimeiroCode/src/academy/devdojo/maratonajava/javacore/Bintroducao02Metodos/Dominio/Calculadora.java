package academy.devdojo.maratonajava.javacore.Bintroducao02Metodos.Dominio;

public class Calculadora {
    // void ele roda o programa feito, faz output no console, porem não enrega valores de variaveis
    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(21-2);
    }

    //emtre parentesses voce pode declarar uma varivelm, primeiro selecione o tipo da variavel, que pode ser um array tambem e depois nomeie ela
    public void multiplicaDoisNumeros(float num1, double num2){
        System.out.println(num1*num2);

    }

    public double divideDoisNumeros(double num1, double num2){
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero");
            return 0;
        }
        return num1/num2;
    }
    public void imprimeDivisaoDeDoisNumeros(double num1, double num2){
        if (num2 !=0){
            System.out.println(num1/num2);
            return;//dessa maneira se for falso ele continua o programa sem precisar do else, só pode ser utlizado em void
        }
              System.out.println("Não existe Divisão por Zero");
    }
    
    public void alteraDoisNumeros(int num1 , int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro Altera dois numeros");
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    //muda a sintaxe do Array
    //caso seja outro valor, tem que ser adicionado antes para que o java entenda q tem espaço para o array
    //ex:  public void somaVarArgs(double valor, double v2, int... numeros) está correto, public void somaVarArgs(int... numeros, double valor, double v2), dará erro de compilação
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
