package academy.devdojo.maratonajava.javacore.EBlocosDeInicializacao.Dominio;

public class Anime {
    
    private String nome;
    private int[] episodios;

    // Bloco de inicializacao 
    // 1 - Aloca espaço em memoria para objetpo
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou quer for passada
    // 3 - Executa o bloco de inicializacao
    // 4 - Construtor é executado

    {
        //Aqui se inicia a Estancia, ele roda toda vez que o programa é iniciado
        //Assim sempre que iniciado o programa ele cria a lista
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];//cria uma lista de 100 itens
        for (int i = 0; i< episodios.length; i++){
            episodios[i] = i+1; //adiciona os valores dos itens na lista
        }
    }
    
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        
        for(int episodios:this.episodios){
            System.out.println(episodios+ ""); //"for" utilizado para rodar todos os itens da lista
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    
}
