package academy.devdojo.maratonajava.javacore.LClassesAbstratas.Dominio;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public void calculaBonus(){
        //Aqui pode estar vazio, porem o java pede para sobrescrever para que funcione o abstract
    }
    
    @Override
    public String toString() {
        return "Gerente [nome=" + nome + ", salario=" + salario + "]";
    }
}
