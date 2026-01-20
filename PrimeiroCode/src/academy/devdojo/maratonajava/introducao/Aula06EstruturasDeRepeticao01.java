package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 10) {
            System.out.println(++count);
        }
        // no do while ele roda a repetiçao peo menos uma vez mesmo sendo a boleana como false
        count = 12;
        do{
            count++;
            System.out.println("Dentro do do while "+count);
        } while(count<10);

        // estrutura do for se baseia em int(declare uma variavel); declare o valor para parar o laço transformando false em true; incremento da variavel

        for(int variavel=0; variavel<10; variavel++){
            System.out.println("For "+variavel);
        }

    }
}
