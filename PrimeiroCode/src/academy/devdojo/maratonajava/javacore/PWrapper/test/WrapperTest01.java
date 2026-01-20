package academy.devdojo.maratonajava.javacore.PWrapper.test;

public class WrapperTest01 {

    //Wrapper gera o encapsulamento dos tipos primitivos e transforma em objetos
    public static void main(String[] args) {
        //tipos primitivos:
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        //Abaixo tem a transformação dos primitivos em classes

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; //(int) autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W'; //(char)
        Boolean booleanW = false;

        //Listas usa referencia a objetos e não metodos primitivos assim o Wrapper é utilizados em listas


        //-----------------------
        int i = intW;//unboxing

        Integer intW2 = Integer.parseInt("1"); 
        //Character não pega o valor da String por ser apenas 1 caractere e String permite o uso de mais caracteres
        
        boolean verdadeiro = Boolean.parseBoolean("trUe");
        System.out.println(verdadeiro); //Boolean verifica se está escrito true ou false, ignorando se tem letra maiuscula ou minuscula no meio
        //qualquer coisa escrita alem de true é considerado false

        //usos do Character
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.toUpperCase('p'));
        System.out.println(Character.toLowerCase('A'));
    }
}
