package academy.devdojo.maratonajava.javacore.Bintroducao02Metodos.Dominio;


public class impressoraEstudante {
    //por estar na mesma pasta ele não precisa importar o Estudante
    public void imprime(Estudante estudante){
        
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        estudante.nome = "Gohan";
    }
}
