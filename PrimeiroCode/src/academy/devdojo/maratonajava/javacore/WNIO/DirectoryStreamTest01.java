package academy.devdojo.maratonajava.javacore.WNIO;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest01 {
     public static void main(String[] args) {
        Path dir = Paths.get(".");//com o "." ele pega o diretorio atual

        //DirectoryStream faz um array com todos os itens da pasta, porem não percorre os intens das subpastas
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path path : stream) {
                System.out.println(path.getFileName()); 
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

