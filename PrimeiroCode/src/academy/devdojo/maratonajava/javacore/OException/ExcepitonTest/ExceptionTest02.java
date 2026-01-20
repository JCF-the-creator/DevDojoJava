package academy.devdojo.maratonajava.javacore.OException.ExcepitonTest;

import java.io.File;
import java.io.IOException;

// Quando utilizamos Try catch estamos usando o modo privado, ou seja sabemos quem vai gerar o arquivo, quando está publico e não sabemos quem vai realizar a tratativa, normalmente utiliza o IOException para que possa ser gerado outra tratativa
public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }
    public static void criarNovoArquivo() throws IOException{
        File file = new File("E:\\Documentos\\Programas\\java\\testejava\\PrimeiroCode\\src\\academy\\devdojo\\maratonajava\\arquivo\\teste.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo Criado "+isCriado);
        }
        catch(IOException e){  
            e.printStackTrace();
            throw e; // aqui realizamos a informação do erro no console e lançamos o erro novamente para que o programa não rode com o erro sem arrumar
        }
    }
}
