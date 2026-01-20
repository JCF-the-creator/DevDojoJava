package academy.devdojo.maratonajava.javacore.OException.runtimeTest;

import java.io.FileNotFoundException;
import java.sql.SQLException;

// quando o programa geram varios erros pode se utilizar multiplas excessões
// por regra se utiliza as excessoes mais especificas primeira, e a RuntimeException por ultimo por ser a mais generica possivel.
// o java roda as multiplas excessoes a partir da sequencia dada
public class RuntiemExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
            // utilizando a logica do "ou" | ele verificar em sequencia, se tiver o erro ele utiliza a mesma tratativa para varias excessões
        }catch(IndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Dentro do IndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        }catch(RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }


    // Abaixo é um exemplo que pode se criar um objeto com as excessões e as trativas em multiplas excessões    
    try {
        talvezLanceException();
    }catch(SQLException throwables){
        throwables.printStackTrace();
    }catch(FileNotFoundException e){
        e.printStackTrace();
    }

    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }
}