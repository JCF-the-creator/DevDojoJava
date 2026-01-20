package academy.devdojo.maratonajava.javacore.GAssociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {

        //next é o comando para ele pegar dados do console, deve-se utilizar o tipo da variavel correta para a captura do dado no console
        //next pega String, somente a primeira palavra, para pegar a linha utiliza-se nextLine
        //Scanner é uma api do Java para leitura no Console

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();
        
        System.out.println("Digite sua idade:");
        int idade = teclado.nextInt();
        
        System.out.println("--------------------------------------");
        System.out.println("Seu nome é "+nome);
        System.out.println("Sua idade é "+idade);
        teclado.close();//Finaliza a funcionalidade do Scanner, assim não funcionando em segundo plano
    }
}
