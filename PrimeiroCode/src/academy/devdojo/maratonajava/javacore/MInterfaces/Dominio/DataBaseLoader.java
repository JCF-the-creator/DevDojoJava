package academy.devdojo.maratonajava.javacore.MInterfaces.Dominio;
//o implements carrega arquivos de interface para a classe
// utilizando o interface voce consegue implementar varias interfaces para serem utilizadaas
public class DataBaseLoader implements DataLoader, DataRemover{
    @Override
    public void load(){
        System.out.println("Carregando dados do banco de dados");
    } 

    @Override 
    public void remove(){
        System.out.println("Removendo Dados do Banco de Dados");
    }

    //o default pode ser sobrescrito 
    @Override
    public void checkPermission(){
        System.out.println("Fazendo a checagem das Permissões no Banco de Dados");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize da classe Banco de Dados");
    }
}
