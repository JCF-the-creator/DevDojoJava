package academy.devdojo.maratonajava.javacore.FModificadorEstatico.Dominio;

public class Anime {
    
    private String nome;
    private static int[] episodios;

    // 0 - Bloco de inicializacao é executado quando o JVM carregar a classe
    // 1 - Aloca espaço em memoria para objetpo
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou quer for passada
    // 3 - Executa o bloco de inicializacao
    // 4 - Construtor é executado

    static{ //com static no bloco de inicialização ele roda apenas 1 vez na inicialização do programa
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];
        for (int i = 0; i< episodios.length; i++){
            episodios[i] = i+1; 
        }
    }

    { //é executado apos o statico
        System.out.println("Dentro do bloco de inicializacao nao estatico");
    }

    static{ //Com mais Blocos de inicialização no programa ele vai rodar na sequencia os blocos
        System.out.println("Dentro do bloco de inicializacao 2");
    }

    
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        
        for(int episodios:Anime.episodios){
            System.out.println(episodios+ " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    
}
