package academy.devdojo.maratonajava.javacore.AintroducaoClasses.test;

import academy.devdojo.maratonajava.javacore.AintroducaoClasses.dominio.Professor;

public class ProfessorTest01 {
        public static void main(String[] args) {
        
        Professor professor = new Professor();
        
        professor.nome = "Mestre";
        professor.idade = 58;
        professor.sexo = 'M';

        System.out.println(professor.nome);
        System.out.println(professor.idade);
        System.out.println(professor.sexo);
        }
}
