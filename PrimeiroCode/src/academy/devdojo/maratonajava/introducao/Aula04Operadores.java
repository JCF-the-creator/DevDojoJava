package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {

    public static void main(String[] args) {
        // + - / *
        // o int só pode ser inteiro, caso o resultado necessite de virgula, deve-se trocar para double
        int numero01 = 10;
        int numero02 = 20;
        double resultado = (double)numero01 / (double)numero02; //Assim muda a classe da variavel sem mudar ela, porem normalmente é utilizado a mudança na declaração da variavel

        System.out.println(resultado);

        // os sinais são considerados devido a posição da String "" + ao lado dela adiciona a variavel, se estiver ao lado de outra varivel ela realiza o calculo
        //Antes da String ele soma, apos ele faz a sequencia como texto
        System.out.println(numero01+numero02+" Conta: "+numero01+" + "+numero02+" = "+numero01+numero02);

        // "%" indica o resto de uma divisão
        int resto = 21 % 2;
        System.out.println(resto);
        
        // <menor >maior <=menor igual >=maiorigual ==igual !=difetente , eles sempre dão valor boeleando(true or false)
        
        boolean duvida = 10>20;
        System.out.println("10>20? "+duvida);

        // "&& (AND)" utiliza 2 vaiaveis. se as 2 forem true o resultado é true

        int idadde = 28;
        float salario = 3500f;
        boolean isDentrodaLeiMaiorque30 = idadde>30 && salario>=4612;
        boolean isDentrodaLeiMenorque30 = idadde<30 && salario>=3381;
        
        System.out.println("Maior que 30:" +isDentrodaLeiMaiorque30);
        System.out.println("Menor que 30:" +isDentrodaLeiMenorque30);

        // "|| (or)" uma das variaveis tem que ser true para retornar true

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 10000;

        float valorPS5 = 5000f;

        boolean PS5Compravel = valorTotalContaCorrente > valorPS5 || valorTotalContaPoupança > valorPS5;
        System.out.println("Ps5 é Compravel? "+PS5Compravel);


        // "! (NOT)" inverte o valor da boleana


        // = igual 
        //+= -= *= /= %=
        double bonus = 1800;
        bonus += 1000; // é igual a bonus = bonus + 1000
        bonus *= 2;//apenas mudando o sinal do lado do =, muda o calculo 
        System.out.println("Bonus = "+bonus);

        int contador = 0;
        contador++; //adiciona 1 no contador com -- retira 1
        System.out.println("Contador = "+contador);

        // utlizando o ++ antes da variavel, primeiro ele calcula e depois executa

        int exContador = 0;
        System.out.println(exContador++);
        System.out.println(exContador);

        int contador2 = 0;
        System.out.println(++contador2+" Esse é com ++ antes do contador");
    }
}