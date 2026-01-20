package academy.devdojo.maratonajava.javacore.OException.ExcepitonTest;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }
    private static void criarNovoArquivo(){
        File file = new File("E:\\Documentos\\Programas\\java\\testejava\\PrimeiroCode\\src\\academy\\devdojo\\maratonajava\\arquivo\\teste.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo Criado "+isCriado);
        }catch(IOException e){ //nunca deixar o bloco catch em branco, ele em branco vai ignorar as excessões e gerar erros
            //catch é usado para trabalhar com as excessões que teve na tratativa dos dados externos
            e.printStackTrace(); //imprime tudo que aconte no Stack
        }
        
    }
}
