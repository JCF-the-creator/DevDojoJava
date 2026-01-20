package academy.devdojo.maratonajava.javacore.Hheranca.Dominio;

public class Funcionario extends Pessoa { // dessa maneira ele pega a variaveis de pessoa
    private double salario;

    static{
        System.out.println("Dentro do bloco de inicialização estático de Funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Funcionario 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Funcionario 2");
    }



    public Funcionario(String nome){
        super(nome); //puxa o construtor nome da classe Pessoa
        System.out.println("Dentro do construtor Funcionário");
    }

    public void imprime(){
        super.imprime(); //o super traz a função da outra classe para fazer a sobreposição
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){ //this.nome é permitido por conta do protected
        System.out.println("Eu"+this.nome+" recebi salario de "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
}
