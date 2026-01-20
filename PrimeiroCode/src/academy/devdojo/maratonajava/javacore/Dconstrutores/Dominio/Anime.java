package academy.devdojo.maratonajava.javacore.Dconstrutores.Dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String studio;


    // contrutores são o que geram o executavel no java, normalmente se não realizada a escrita no programa, o proprio java realiza a escrita do construtor vazio
    // abaixo o programa só ira executar se tiver os dados requeridos no construtor, se não haverá erro de compilação
    public Anime(String nome, String tipo, int episodios, String genero){
        System.out.println("Dentro do construtor");
        this();//chama o proximo construtor, só chama somente dentro do construtor e deve-se ser a primeira linha do construtor  
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodios, String genero, String studio){
        this(nome, tipo, episodios, genero);
        System.out.println("Dentro do construtor usando sobrecarga");
        this.studio = studio;
    }

    public Anime(){
        //colocando um vazio gera uma Sobrecarga de construtor, assim rodando o programa mesmo não digitando o codigo
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void imprime(){ //com void é declarado método. Pela convenção o construtor tem inicio com letra maiuscula e os metodos com minuscula

        System.out.println("Nome: "+ this.nome);
        System.out.println("Anime do tipo "+this.tipo);
        System.out.println("Tem "+ this.episodios+" episodios");
        System.out.println("Anime do Genero: "+this.genero);
        System.out.println("Estudio: " + this.studio);

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
