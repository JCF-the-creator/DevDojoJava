package academy.devdojo.maratonajava.javacore.KEnum.test;

import academy.devdojo.maratonajava.javacore.KEnum.Dominio.Cliente;
import academy.devdojo.maratonajava.javacore.KEnum.Dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.KEnum.Dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Rogerio",TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO ); //Aqui ele acessa a lista do enumerador e seleciona o desejado
        Cliente cliente2 = new Cliente("ANA",TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente3 = new Cliente("CLARA",TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente4 = new Cliente("Gustavo",TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));


        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA"); //valueOf pega o texto da variavel no Enum
        System.out.println(tipoCliente.getNomeRelatorio());

        TipoCliente tipoCliente2 = TipoCliente.TipoClientePorNomeRelatorio("Pessoa Fisica"); //dessa maneira pega o valor da variavel no Enum
        System.out.println(tipoCliente2);

    }
}
