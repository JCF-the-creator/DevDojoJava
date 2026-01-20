package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisSwitchCase {
    public static void main(String[] args) {
        //imprima o dia da semana, considerando 1 com domingo
        byte dia =6;
        //char, int, byte, short, enum, String
        switch(dia){
            case 1:
                System.out.println("Domingo");
                break; // se coloca o break para ele não continuar o programa caso o valor seja maior do que a condicional
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("opção inválida selecione de 1 a 7");
        }

    // de 1 a 7, impima se o dia util ou fim de semana considerando 1 como domingo

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Fim de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia utíl");
                break;
            default:
                System.out.println("Opção inválida selecione de 1 a 7");
                break;
        }
    }
}
