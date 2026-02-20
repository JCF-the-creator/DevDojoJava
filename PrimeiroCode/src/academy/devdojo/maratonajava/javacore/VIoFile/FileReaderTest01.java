package academy.devdojo.maratonajava.javacore.VIoFile;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try(FileReader fr = new FileReader(file)){
 /*          char[] in = new char[30];
            fr.read(in);
            for (char c : in) {
                System.out.print(c);
            }
*/ //O read lê apenas de char em char. Porem o resultado ao terminar de fazer a leitura de todos os itens do arquivo ele resulta em -1
            int i;

            while((i=fr.read()) != -1){
                System.out.print((char)i);
            } 
        } catch(IOException ex){
            ex.printStackTrace();
    }
}
}