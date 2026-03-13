package academy.devdojo.maratonajava.javacore.YColection.test;

import academy.devdojo.maratonajava.javacore.YColection.Dominio.Celular;
import academy.devdojo.maratonajava.javacore.YColection.Dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        String nome = "James";
        String nome2 = "James";

        System.out.println(nome == nome2); //nesse metodo como a String está na pool ele encontra o valor e retorna True
        System.out.println();

        String dia = "Segunda";
        String dia2 = new String("Segunda");//aqui a String está fora da pool retornando False
        System.out.println(dia==dia2);
        System.out.println();

        System.out.println(dia.equals(dia2));//verifica o valor da String, nesse caso sendo True
        System.out.println();
        System.out.println("-------------------------------");

        Smartphone s1 = new Smartphone("1AB", "Iphone");
        Smartphone s2 = new Smartphone("1AB", "Iphone");

        System.out.println(s1.equals(s2));//aqui retorna o valor falso por conta de serem 2 objetos diferentes s1 e s2
        System.out.println();
    
        Smartphone s3 = new Smartphone("1AB", "Iphone");
        Smartphone s4 = s3;

        System.out.println(s3.equals(s4));// Aqui da verdadeiro por conta de fazerem referencia ao mesmo objeto
        System.out.println();

        System.out.println("---Com sobrescrita no Equals--------");

        System.out.println();

        Celular c1 = new Celular("AF1", "Iphone");
        Celular c2 = new Celular("AF1", "Samsung");

        System.out.println(c1.equals(c2)); //Com a sobrescrita do metodo Equals, ele vai retornar True, mesmo que a marca seja diferente, pq na sobrescrita foi especificado apenas o serialNumber.

    }
}
