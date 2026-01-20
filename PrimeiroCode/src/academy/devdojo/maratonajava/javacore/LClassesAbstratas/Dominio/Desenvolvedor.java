package academy.devdojo.maratonajava.javacore.LClassesAbstratas.Dominio;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public void calculaBonus(){
        this.salario = this.salario*1.05;
    }

    @Override
    public String toString() {
        return "Desenvolvedor [nome=" + nome + ", salario=" + salario + "]";
    }
    
}
