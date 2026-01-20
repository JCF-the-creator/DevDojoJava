package academy.devdojo.maratonajava.javacore.Bintroducao02Metodos.Dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void impreme(){
        // this, traduzindo "este", utiliza a alocação de memoria "Estudante" a ser utilizada
        System.out.println(this.nome); 
        System.out.println(this.idade);
        System.out.println(this.sexo);
        System.out.println("------------------------");
    }
}
