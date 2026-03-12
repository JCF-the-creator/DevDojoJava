package academy.devdojo.maratonajava.javacore.XSerialization.test;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import academy.devdojo.maratonajava.javacore.XSerialization.Dominio.Aluno;
import academy.devdojo.maratonajava.javacore.XSerialization.Dominio.Turma;

public class SerializationTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "James", "8342");

        Turma turma = new Turma("Sala1");
        aluno.setTurma(turma);

        serializar(aluno);
        deserializar(); //não executa o construtor
    }
    
    //ao Serializar vc transforma as informações em um Array de bits trabalhando assim em baixo nivel 
    private static void serializar(Aluno aluno){
        Path nomeArquivo = Paths.get("pasta/aluno.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(nomeArquivo))){ 
            oos.writeObject(aluno);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private static void deserializar(){
        Path nomeArquivo = Paths.get("pasta/aluno.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(nomeArquivo))){ 

            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

}
