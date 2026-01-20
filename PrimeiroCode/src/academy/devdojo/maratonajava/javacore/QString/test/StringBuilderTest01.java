package academy.devdojo.maratonajava.javacore.QString.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Willian Suane";
        nome.concat(" DevDojo");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Willian Suane"); // aqui ele aloca em memoria um objeto para trabalhar com a string, começa com 16byets se passa vai para 32, depois 64 e assim por diante
        sb.append(" DevDojo").append("Academy");//adiciona ao objeto
        System.out.println(sb);
        sb.reverse(); //modificador do objeto
        System.out.println(sb);
        sb.delete(0, 3);  //modificador do objeto
        System.out.println(sb);
    }
}
