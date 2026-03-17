package academy.devdojo.maratonajava.javacore.YColection.Dominio;

public class Celular {
    
    private String serialNumber;
    private String marca;

    public Celular(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    // Reflexivo: x.equals(x) deve ser true para qualquer objeto x diferente de null
    // Simétrico: para x e y diferentes de null, se x.equals(y) for true, então y.equals(x) também deve ser true
    // Transitividade: para x, y, z diferentes de null, se x.equals(y) for true e x.equals(z) for true, então y.equals(z) também deve ser true
    // Consistente: x.equals(x) sempre retorna true, desde que x seja diferente de null
    // Para x diferente de null, x.equals(null) deve retornar false
    @Override
    public boolean equals(Object obj) {

        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Celular celular = (Celular) obj;
        return serialNumber != null && serialNumber.equals(celular.serialNumber);
    }

    /*hashCode é utilizado para que seja encontrado o valor em Arrays grandes, utilizando um indice para encontrar os valores na lista, por exemplo:

    a lista possui os seguintes valores:

    ana = 12+8
    caio = 1+3
    renato = 16+4

    vc define os resultados das somas como indice(aqui pode ser um int, String, aqui determina a perfomace do seu hash, procurar no indice é mais rapido que o equals). 

    ao procurar o hash 4, vai retornar o equals, verificando se o valor Caio é verdadeiro

    no hash 20, ele vai verificar se ana e renato é verdadeiro
    
    */ 

    /*Se x=equals(y) == true, y.hashCode() == x.hashCode()

    y.hashCode() == x.hashCode() não necessariamente o equals de y.equals(x) tem q ser true */

    /*Se x.equals(y) == false
    y.hashCode() != x.hashCode() , x.equals(y) deverá ser false */

    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Celular [serialNumber=" + serialNumber + ", marca=" + marca + "]";
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
