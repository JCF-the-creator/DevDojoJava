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


    public String getSerialNumber() {
        return serialNumber;
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
