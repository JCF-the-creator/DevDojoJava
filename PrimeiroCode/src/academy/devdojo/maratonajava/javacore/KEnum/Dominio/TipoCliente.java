package academy.devdojo.maratonajava.javacore.KEnum.Dominio;

//Trocando o class pelo enum esse programa se torna uma enumeração
// No caso Abaixo o banco de dados coloca valor 1 para Fisica e valor 2 para Juridica

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    private int valor;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente TipoClientePorNomeRelatorio(String nomeRelatorio){
        for(TipoCliente i : values()){
            if(i.getNomeRelatorio().equals(nomeRelatorio)){
                return i;
            }
        }
        return null;
    }

    public int getValor() {
        return valor;
    }



    public String getNomeRelatorio() {
        return nomeRelatorio;
    }


    

}
