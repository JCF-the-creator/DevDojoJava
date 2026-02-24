package academy.devdojo.maratonajava.javacore.WNIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
         //Path é uma interface baseada na SO que está trabalhando

         //Maneiras de encontrar um arquivo:
        Path p1 = Paths.get("E:\\Documentos\\rogramas\\java\\testejava\\DevDojoJava\\PrimeiroCode\\src\\academy\\devdojo\\maratonajava\\arquivo\\teste.txt");
        Path p2 = Paths.get("E:","\\Documentos\\rogramas\\java\\testejava\\DevDojoJava\\PrimeiroCode\\src\\academy\\devdojo\\maratonajava\\arquivo","teste.txt"); //usando a virgula para separar o caminho

        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
    }
}
