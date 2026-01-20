package academy.devdojo.maratonajava.javacore.GAssociacao.Exercicio.test;

import academy.devdojo.maratonajava.javacore.GAssociacao.Exercicio.Dominio.Aluno;
import academy.devdojo.maratonajava.javacore.GAssociacao.Exercicio.Dominio.Local;
import academy.devdojo.maratonajava.javacore.GAssociacao.Exercicio.Dominio.Professor;
import academy.devdojo.maratonajava.javacore.GAssociacao.Exercicio.Dominio.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {



        Aluno aluno1 = new Aluno("James", 26);
        //Aluno aluno2 = new Aluno("Flavio", 25);
        Aluno[]alunos = {aluno1};//,aluno2};

        Local endereco = new Local("Avenida dos Amarais");

        Seminario java = new Seminario("Curso Java", alunos, endereco);
        //Seminario kotlin = new Seminario("Curso Kotlin", alunos, endereco);
        

        Seminario[]seminarios = {java};//,kotlin};

        Professor professor = new Professor("Marcos","Programação", seminarios);

        professor.imprime();
        
        
    }
}
