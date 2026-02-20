package academy.devdojo.maratonajava.javacore.VIoFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");//cria a referencia na memoria
        try{
            //CreateNewFile cria 1x o arquivo, se o mesmo já estiver na pasta não é realizada a produção/troca do arquivo
            boolean isCreated = file.createNewFile();
            System.out.println("Created "+isCreated);
            System.out.println("path "+file.getPath());
            System.out.println("Path Absolute" +file.getAbsolutePath());//pega o caminho completo do arquivo.
            System.out.println("is Directory "+ file.isDirectory());
            System.out.println("is file "+ file.isFile());
            System.out.println("is hidden "+file.isHidden());
            System.out.println("last modified "+ new Date(file.lastModified()));//mostra ultima modificação 
            boolean exists = file.exists(); //verifica se o arquivo existe

            if(exists){
                System.out.println("Deleted" + file.delete());//Apaga o arquivo criado
            }

        } catch(IOException exception){
            exception.printStackTrace();
        }

    }
}
