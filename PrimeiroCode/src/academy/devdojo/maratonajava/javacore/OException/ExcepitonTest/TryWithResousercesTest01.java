package academy.devdojo.maratonajava.javacore.OException.ExcepitonTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import academy.devdojo.maratonajava.javacore.OException.Dominio.Leitor1;
import academy.devdojo.maratonajava.javacore.OException.Dominio.Leitor2;

public class TryWithResousercesTest01 {
    public static void main(String[] args) {
        lerArquivo2();
    }
    // codigo base para realizar a leitura de um arquivo
    public static void lerArquivo(){
        Reader reader = null; // aqui ele está fora do try, para ser utilizado no finally
        try{
            reader = new BufferedReader(new FileReader("E:\\Documentos\\Programas\\java\\testejava\\PrimeiroCode\\src\\academy\\devdojo\\maratonajava\\arquivo\\teste.txt"));
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }finally{
            try{ 
                if (reader != null) {
                   reader.close(); 
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void lerArquivo2(){
        //Aqui podemos inicializar o Reader nos () do try por ser um objeto e seguir a regra do Closeble/autoCloseble, como ele mesmo fecha, o proprio java consegue realizar a estancia
        //Utilizando mais objetos, se utiliza o ; para separar eles, o java faz a leitura inversa, sendo de baixo para cima.
        try(Leitor1 leitor1 = new Leitor1();
        Leitor2 leitor2 = new Leitor2()){
           
        }catch(IOException e){
                e.printStackTrace();
        }
        
    }
}
