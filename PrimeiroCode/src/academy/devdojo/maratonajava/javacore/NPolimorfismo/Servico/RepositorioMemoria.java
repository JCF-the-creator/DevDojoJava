package academy.devdojo.maratonajava.javacore.NPolimorfismo.Servico;

import academy.devdojo.maratonajava.javacore.NPolimorfismo.Repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio{

    @Override
    public void salvar() {
       System.out.println("Salvando em Memoria"); 
    }
    
}
