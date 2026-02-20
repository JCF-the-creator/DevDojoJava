package academy.devdojo.maratonajava.javacore.VIoFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try(FileWriter fw = new FileWriter(file, true); 
        BufferedWriter bw = new BufferedWriter(fw)){
            bw.write("---Com esse comando é realiziada a escrita dentro do arquivo---");
            bw.newLine();//Cria nova linha de acordo com o uso do SO
            bw.flush();
            //BufferedWriiter encapsula os dados da fileWriter e guarda em um buffer para melhorar os processamentos dos dados no SO
        } catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
