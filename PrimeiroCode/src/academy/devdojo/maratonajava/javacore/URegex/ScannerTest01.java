package academy.devdojo.maratonajava.javacore.URegex;

import java.util.Scanner;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Pedro,Carlos,Henrique,true,200";
        Scanner scanner = new Scanner(texto);//verifiica os valores no texto
        scanner.useDelimiter(",");//separa os valores
        while (scanner.hasNext()) { //roda durante todos os valores 
          System.out.println();
           if (scanner.hasNextInt()) { // busca os valores int
                int i = scanner.nextInt();
                System.out.println("int = " + i);
           }
           else if(scanner.hasNextBoolean()){
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean = "+b);
           }
           else {
                System.out.println(scanner.next());
           }
           
        }

        scanner.close();
    }
}
