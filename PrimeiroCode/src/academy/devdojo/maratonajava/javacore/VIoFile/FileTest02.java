package academy.devdojo.maratonajava.javacore.VIoFile;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {
        File fileDirectory = new File("pasta");
        boolean isDirectorioCriado = fileDirectory.mkdir();// comando tambem utlizado para criar pastas no Linux

        //fileDirectory como é criado a pasta, ele utiliza a variavel para encontrar o diretorio 
        System.out.println(isDirectorioCriado);
        File fileArquivoDiretorio = new File(fileDirectory, "arquivo.txt");
        try{
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println(isFileCreated);
        } catch (IOException e){
            e.printStackTrace();
        }

        File fileRenamed = new File(fileDirectory, "arquivo_renomeado");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println(isRenamed); //da mesma maneira funciona no drectory

    }
}
