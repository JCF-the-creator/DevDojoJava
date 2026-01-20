package academy.devdojo.maratonajava.javacore.KEnum.Dominio;

public class Cliente {
//enum pode ser criado dentro da classe tambem, dependendo da quantidade de itens da lista fica desorganizado


    private String nome;
    private TipoCliente TipoCliente; //dessa maneira voce chama um enumarador no programa, ele gera geters e sters e construtores
    private TipoPagamento TipoPagamento;

    

    public Cliente(String nome, academy.devdojo.maratonajava.javacore.KEnum.Dominio.TipoCliente tipoCliente,
            academy.devdojo.maratonajava.javacore.KEnum.Dominio.TipoPagamento tipoPagamento) {
        this.nome = nome;
        TipoCliente = tipoCliente;
        TipoPagamento = tipoPagamento;
    }



    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", TipoCliente=" + TipoCliente + ", TipoPagamento=" + TipoPagamento + ", TipoClienteInt=" + TipoCliente.getValor() + "]";
    }

    


}
