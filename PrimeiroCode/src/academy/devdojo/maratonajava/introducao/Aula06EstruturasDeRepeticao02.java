package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Dado valor de um carro, descubra os valores das parcelas partindo da parcela numero 30
        
        double valorTotal = 30000;
        // (int) está na inha abaixo porque a variavel parcela é uma int, e só pode ser comparado pelo mesmo tipo
        for( int parcela = (int) valorTotal; parcela>=1; parcela--){
            double valorParcela = valorTotal / parcela;
            if (valorParcela<1000) {
                continue; //aqui o programa realizar o codigo abaixo somente quando o if é dado como verdadeiro
            }
            System.out.println("Parcela "+parcela+" R$ "+valorParcela);
        }

        //Break e Continue é utilizado principalmente quando os laços realizam execuções externas, aqui temos um print, mas se fosse chamar um banco de dados ou servidor, o uso seria muito maior já nesse caso acima em vez de usar 30 parcelas, ele iria fazer as 30000 parcelas 
        //exemplo de muito uso de processamento
        boolean exemplo = false; //coloque true para executar o exemplo

        if (exemplo){
            double valorTotal02 = 30000;
        
            for( int parcela02 = (int) valorTotal02; parcela02>=1; parcela02--){
                double valorParcela02 = valorTotal02 / parcela02;
                if (valorParcela02>=1000) {
                System.out.println("Parcela "+parcela02+" R$ "+valorParcela02);      
                }
                //se colocar um break no lugar desse comentario, a linha abaixo para de funcionar por conta da varivel parcela02 deixar de existir porque o for foi descontinuado
                System.out.println("fora do if " +parcela02);
            }
        }

    }
}
