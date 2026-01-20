package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean (tipos de variaveis)
        int age = (int)10000000000L;// assim ele faz um casting, o java corta alguns bits para que o valor long caiba na int
        /*  double salaryDouble = 2000;
        float salaryFloat = 2500.0f; //colocando o f no fim do valor ele declara a vairavel como float, para que ela não fique em double
        byte ageByte = -128;
        short ageShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char letra = 'M'; // caso coletre valor usa a tabela ASCII, ex. 87 ele da print no W char é somente uma letra
        */
        // Acima está comentado para retirar o erro de que n está sendo utilizado
        String texto = " texto enorme ";

        System.out.println("A idadde é "+age+" anos");
        System.out.println("esse texto é"+texto);
    }
}
