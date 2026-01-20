package academy.devdojo.maratonajava.javacore.MInterfaces.Dominio;

public interface DataLoader { // por padrão todas as interfaces são publicas e abstratas
    int MAX_DATA_SIZE=10;   //todos as variaves da interface são Constantes (static final)
    
    void load(); 

    //o uso do default permite que não seja obrigatorio o uso desse metodo em todas as classes 
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize da interface");
    }
}
