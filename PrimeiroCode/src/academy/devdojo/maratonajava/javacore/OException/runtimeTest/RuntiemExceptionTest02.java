package academy.devdojo.maratonajava.javacore.OException.runtimeTest;

public class RuntiemExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(1, 0));
    }
/**
 * 
 * @param a
 * @param b não pode ser 0
 * @return a/b
 * @throws IllegalArgumentException caso b seja 0
 */

    public static int divisao(int a, int b) throws IllegalArgumentException{ // aqui voce adiciona uma flag avisando que é possivel a variavel gerar uma excessao
        if(b==0){
            //assim voce trata uma excessão avisando o que realizou o erro
            throw new IllegalArgumentException("Não é possivel dividir por 0");
        }
        return a/b;
}
}