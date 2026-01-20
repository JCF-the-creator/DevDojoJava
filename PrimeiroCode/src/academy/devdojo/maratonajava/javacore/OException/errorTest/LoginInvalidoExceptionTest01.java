package academy.devdojo.maratonajava.javacore.OException.errorTest;

import java.util.Scanner;

import academy.devdojo.maratonajava.javacore.OException.Dominio.LoginInvalidoException;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try{
            Logar();
        }catch(LoginInvalidoException e){
            e.printStackTrace();
        }
    }

    private static void Logar() throws LoginInvalidoException{
        Scanner teclado = new Scanner(System.in);

        String usernameDB = "Goku";
        String senhaDB = "ssj";

        System.out.println("Usuário: ");
        String usernameDigitado = teclado.nextLine();

        System.out.println("Senha: ");
        String senhaDigitado = teclado.nextLine();

        if(!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitado)){
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }

        System.out.println("Usuário logado com sucesso");

       }
}
