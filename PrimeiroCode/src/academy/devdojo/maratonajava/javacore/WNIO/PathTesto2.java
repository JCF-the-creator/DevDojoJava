package academy.devdojo.maratonajava.javacore.WNIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class PathTesto2 {
    public static void main(String[] args) {

        // Usando Directories ele cria as pastas necessáras e sobrepoem caso já exista
        Path pastaPath = Paths.get("pasta\\subpasta\\subsub");
        //como o Path não foi totalmente declarado ele adicona a partir do inicio do package

        try{
            Path pastaDirectory = Files.createDirectories(pastaPath);
        } catch(IOException exception){
            exception.printStackTrace();
        }
        
        Path filePath = Paths.get(pastaPath.toString(), "File.txt"); //cria um arquivo no Path do pastaPath
        try{
            if (Files.notExists(filePath)){
                Path filePathCreated = Files.createFile(filePath); 
            } else{
                System.out.println("Arquivo já foi criado");
            }
        } catch (Exception e) {} //Cria somente se o arquivo não existe, caso exista é lançada uma Execeção, como o if verifica se possu arquivo, ele continua o programa
        
        Path source = filePath;
        //.getParent pega o primeiro Path do filePath
        Path target = Paths.get(filePath.getParent().toString(), "File_rename.txt");
        try{
        Files.copy(source, target);
        } catch(IOException e){
            System.out.println("Já fo criado a cópia, delete e tente novamente");
        }
    }
}
