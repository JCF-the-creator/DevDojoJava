package academy.devdojo.maratonajava.javacore.OException.errorTest;

import java.io.FileNotFoundException;
import java.io.IOException;

import academy.devdojo.maratonajava.javacore.OException.Dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.OException.Dominio.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.OException.Dominio.Pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        //Realizamos somente a tratativa das exceções sobrescritas dos objetos 

        try {
            funcionario.salvar();
        } catch (FileNotFoundException | LoginInvalidoException e) {
            e.printStackTrace();
        }

        System.out.println("--------------------");

        try {
            pessoa.salvar();
        } catch (LoginInvalidoException | IOException e) {
            
            e.printStackTrace();
        }
    }
    
}
