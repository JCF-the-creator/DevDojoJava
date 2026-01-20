package academy.devdojo.maratonajava.javacore.OException.Dominio;

import java.io.IOException;

public class Pessoa {

    //em sobrescrita aqui deve-se colocar as excessões desejadas 
    public void salvar() throws LoginInvalidoException, IOException{
        System.out.println("Salvando em Pessoa");
    }
}
