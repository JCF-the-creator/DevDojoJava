package academy.devdojo.maratonajava.javacore.OException.Dominio;

import java.io.FileNotFoundException;


public class Funcionario extends Pessoa{

    //Na sobrescrita, voce tem que declarar as Excessões novamente se for utilizar elas, e sempre deve-se utlizar a mesma excessão ou filha delas, nunca uma hierarquia antes, por ser uma sobrescrita 
      public void salvar() throws LoginInvalidoException, FileNotFoundException{
        System.out.println("Salvando em Funcionario");
    }

}
