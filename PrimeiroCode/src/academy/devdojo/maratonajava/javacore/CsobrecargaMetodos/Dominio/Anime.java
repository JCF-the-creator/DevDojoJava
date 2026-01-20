package academy.devdojo.maratonajava.javacore.CsobrecargaMetodos.Dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public void imprime(){

        System.out.println("Nome: "+ this.nome);
        System.out.println("Anime do tipo "+this.tipo);
        System.out.println("Tem "+ this.episodios+" episodios");
        System.out.println("Anime do Genero: "+this.genero);

    }

    //init é para iniciar os valores somente com 1 linha, sem precisar declarar o Set para cada um
    public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }
    //genero foi adicionado depois da implementação do programa no serviço
    // aqui realizamos a sobrecarga de Metodo para adicionar o genero sem parar o sistema
    public void init(String nome, String tipo, int episodios, String genero){
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
    public String getTipo() {
        return this.tipo;
    }
    public int getEpisodios() {
        return this.episodios;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
