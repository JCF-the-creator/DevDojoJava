package academy.devdojo.maratonajava.javacore.MInterfaces.test;

import academy.devdojo.maratonajava.javacore.MInterfaces.Dominio.DataBaseLoader;
import academy.devdojo.maratonajava.javacore.MInterfaces.Dominio.DataLoader;
import academy.devdojo.maratonajava.javacore.MInterfaces.Dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
       DataBaseLoader dataBaseLoader = new DataBaseLoader();
       FileLoader fileLoader = new FileLoader();

       dataBaseLoader.load();
       fileLoader.load();
        System.out.println("---------------------");

       dataBaseLoader.remove();
       fileLoader.remove();
        System.out.println("---------------------");
       //aqui ele utiliza a interface para dar print
       dataBaseLoader.checkPermission();
       fileLoader.checkPermission();
       System.out.println("---------------------");

       dataBaseLoader.retrieveMaxDataSize();
       DataLoader.retrieveMaxDataSize();
    }
}
