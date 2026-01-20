package academy.devdojo.maratonajava.javacore.Bintroducao02Metodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducao02Metodos.Dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducao02Metodos.Dominio.impressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        impressoraEstudante impressora = new impressoraEstudante();

        estudante01.nome = "Luffy";
        estudante01.idade = 18;
        estudante01.sexo = 'M';

        estudante02.nome = "Nami";
        estudante02.idade = 19;
        estudante02.sexo = 'F';


        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);

        System.out.println("---------------------------");

        System.out.println(estudante02.nome);
        System.out.println(estudante02.idade);
        System.out.println(estudante02.sexo);

        System.out.println("-------Usando Referencia-------");

        impressora.imprime(estudante01);
        System.out.println("---------------------------");
        impressora.imprime(estudante02);

        System.out.println("-Roda novamente, mas pega a referencia do Gohan por ser sequencia-");
        impressora.imprime(estudante01);
        System.out.println("---------------------------");
        impressora.imprime(estudante02);
    }
}
