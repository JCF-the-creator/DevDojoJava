package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {

        // if sempre vai comparar valores boleanos, true or false
        int idade = 25;
        boolean isAutorizado = idade >=18 ;
        if(isAutorizado){
            System.out.println("Autorizado");
        }

        if (!isAutorizado) {
            System.out.println("Não Autorizado");
        }
        
        // Acima ele sempre verifica a boleana, abaixo o else roda apenas naquele if
        if(isAutorizado){
            System.out.println("Autorizado no if/else");
        }else{
            System.out.println("Não Autorizado no if/else");
        }

        // com else if adiciona mais codicinais para a saida
        if (idade<15) {
            System.out.println("Criança");
        } else if (idade >=15 && idade<18){
            System.out.println("Adolescente");
        } else{
            System.out.println("Adulto");
        }
        
        //(codição) ? true : false
        double salario = 8000;
        String VouViajar = "Tenho condição para viajar";
        String NaoVouViajar = "Não tenho condição para viajar";

        System.out.println(salario > 5000 ? VouViajar : NaoVouViajar);
    }
}
