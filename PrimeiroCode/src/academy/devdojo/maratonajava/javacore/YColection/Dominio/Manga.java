package academy.devdojo.maratonajava.javacore.YColection.Dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga>{

    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    
    public Manga(Long id, String nome, double preco) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(nome); // gera uma excessão se o valor for nulo
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    
    public Manga(Long id, String nome, double preco, int quantidade) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(nome); 
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        long temp;
        temp = Double.doubleToLongBits(preco);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Manga other = (Manga) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco))
            return false;
        return true;
    }

    


    @Override
    public String toString() {
        return "Manga [id=" + id + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade
                + "]";
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getPreco() {
        return preco;
    }


    public void setPreco(double preco) {
        this.preco = preco;
    }



    @Override
    public int compareTo(Manga outroManga) {
        // negativo se o this < outroManga
        // se this == outroManga, return 0
        // positivo se this > outroManga


        /*if(this.id < outroManga.getId()) {
            return -1;
        } else if(this.id.equals(outroManga.getId())) {
            return 0;
        } else {
            return 1;
        }
        */

        //return this.id.compareTo(outroManga.getId()); funciona da mesma forma acima 
 
        //return Double.valueOf(preco).compareTo(outroManga.getPreco()); organiza por preço

        //return Double.compare(preco, outroManga.getPreco()); //funciona da mesma maneira acima 

        return this.nome.compareTo(outroManga.getNome()); // organiza por ordem alfabica no nome
    }


    public int getQuantidade() {
        return quantidade;
    }


    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
