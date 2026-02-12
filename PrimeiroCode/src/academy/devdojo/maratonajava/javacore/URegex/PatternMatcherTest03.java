package academy.devdojo.maratonajava.javacore.URegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        //Numeros hexdecimais em java no int é indentificado com 0X e letras vai até F, por Exemplo int 7569818 = Hex 73819A

        // aqui vamos indendificar numeros Hexdecimais no texto

        int numberHEX = 0x73819A; // aqui as letras podem ser maisculas e minusculas 

        // voce pode colocar em sequencia  os valore a serem procurados no regex
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)"; //mas ele tem que estar na ordem que vc procura 

        // "0[xX]([0-9a-fA-F])+(\\s|$)" traduzindo esse regex ele vai buscar primeiramente um 0, depois x ou X, depois de 0-9, a-f e A-F,+ por conta de ter varios valores, um espaço ou até o fim da linha e terminar a leitura

        System.out.println("print numero hexadecimal: "+numberHEX);

        String textoNumHEX= "12 0x 0x 0xffABC 0x10G 0x1";

        Pattern pattern = Pattern.compile(regex); 
        Matcher matcher = pattern.matcher(textoNumHEX); 

        System.out.println("texto:  "+textoNumHEX);
        System.out.println();
        System.out.println("regex:  "+ regex);
        System.out.println();


        while (matcher.find()) {
            System.out.println("posição do indice = " + matcher.start() + ", encontrado o valor = "+ matcher.group() + "\n"); 
        }
    }
}
