package academy.devdojo.maratonajava.javacore.Bintroducao02Metodos.Dominio;

public class Funcionarios {

    private String nome;
    private int idade;
    private double [] salarios;
    private double media;

    public void imprime(){
        System.out.println(this.nome); 
        System.out.println(this.idade);
        if (salarios == null){
            return;
        }

        for(double salarios:salarios){
            System.out.println(salarios+" ");
        }
        
        ImprimeMediaSalarial();
    }

    public void ImprimeMediaSalarial(){
        if (salarios == null){
            return;
        }
        
        for(double salarios : salarios){
            media += salarios;
        }
        media /= salarios.length;
        System.out.println("\nMedia Salarial: " +media);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

}
