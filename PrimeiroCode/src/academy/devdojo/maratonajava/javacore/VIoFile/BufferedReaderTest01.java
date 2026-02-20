package academy.devdojo.maratonajava.javacore.VIoFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try(FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr)){
                //Lê a linha inteira e quanto acaba o texto da null como resultado
                String linha;
                while ((linha = br.readLine()) != null) {
                   System.out.println(linha); 
                }

        } catch(IOException ex){
            ex.printStackTrace();
    }
    }
}
