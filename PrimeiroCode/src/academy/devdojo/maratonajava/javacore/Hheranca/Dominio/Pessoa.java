package academy.devdojo.maratonajava.javacore.Hheranca.Dominio;

public class Pessoa { //protected permite acesso do this nas extenções, tambem permite o acesso das variaveis no mesmo pacote
    protected String nome; 
    protected String cpf;
    protected Endereco endereco;

    static{
        System.out.println("Dentro do bloco de inicialização estático de pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Pessoa 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Pessoa 2");
    }

    public Pessoa(String nome){
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf){
        this(nome); //this(nome) puxa o construtor acima, essa função deve ser a primeira linha do construtor, se usar o super() não é possivel usar o this()
        this.cpf = cpf;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua()+ " "+this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    

}
