package academy.devdojo.maratonajava.javacore.VIoFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        //Se deixar da seguinte maneira "FileWriter fw = new FileWriter(file)" o programa substitui o arquivo antigo

        // adicionando o true no final ele adiciona mais texto no arquivo
        try(FileWriter fw = new FileWriter(file, true)){
            fw.write("---Com esse comando é realiziada a escrita dentro do arquivo---");
            fw.flush();// aqui o java espera a prodção do arquvo antes de fechar a função, assim não perdendo dados que estão no buffer
        } catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
