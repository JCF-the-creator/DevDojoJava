package academy.devdojo.maratonajava.introducao;

/*
 * Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.
 */

public class Aula03TiposPrimitivosExercicio {

    public static void main(String[] args) {
        String Nome = "Carlos";
        String Endereco = "Rua Ana Maria, 51, Jardim, Sumaré, SP";
        Float Salario = 2500.50f;
        String DataRecebimentoSalario = "20/04/2025";

        System.out.println("Eu "+Nome+", morando no endereço: "+Endereco+", confirmo que recebi o salário de R$ "+Salario+", na data: "+DataRecebimentoSalario);
    }
}