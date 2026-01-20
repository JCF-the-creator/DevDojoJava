package academy.devdojo.maratonajava.javacore.JModificadorfinal.Dominio;

public class Carro { // digitando "public final class" o "final" não permite que a classe troque as funçoes, a função String utiliza desse metodo
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime(){ // metodos final não permite sobrecarga
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    } 

    //final é uma função para gerar constantes, uma constante é uma variavel que não altera valor, a alteração ocorre somente na declaração da variavel
    //constantes normalmente é escrito em maiusculo e com _ para o espaco
    //sempre vem com static antes do final, como é uma constante, deve se inicializar antes das outras variaveis, por conta do seu valor não mudar

    // em COMPRADOR estamos gerando uma referencia ao objeto cujo a referencia é imutavel porem os itens dela pode ser mudados
    // isso é utilizado em banco de dados, atraves do "Singleton pattern", assim voce não precisa criar um objeto para cada item, apenas o COMPRADOR.
}
