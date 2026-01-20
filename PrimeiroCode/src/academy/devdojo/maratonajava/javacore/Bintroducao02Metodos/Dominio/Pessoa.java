package academy.devdojo.maratonajava.javacore.Bintroducao02Metodos.Dominio;

public class Pessoa {
    // em private ele não permite o acesso a esse atributo na memoria deixando um valor padrão que aqui foi atribuido
    private String nome;
    private int idade;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    //Para que voce possa alterar o valor em privado voce abre um novo atributo de memoria que vai funcionar enquanto o programa estiver nessa parte
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        if (idade<0) {
            System.out.println("Digite uma idade valida");
            return;
        } 
        this.idade = idade;
    }

    //Aqui voce altera o valor da variavel nome
    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }
}
