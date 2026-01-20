package academy.devdojo.maratonajava.javacore.OException.errorTest;

public class StackOverflowTest01 {
    //dessa maneira vai ocorrer um erro por estar alocando na memoria em infinito, dando um erro de StackOverflow
    //Todos os erros são objetos no java, tudo dentro da classe Throwable
    // Throwable significa lançavel
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
}
