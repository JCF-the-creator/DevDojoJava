package academy.devdojo.maratonajava.javacore.XSerialization.Dominio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serial;
import java.io.Serializable;

public class Aluno implements Serializable{
    @Serial
    private static final long serialVersionUID = 17676L; //chave aleatória que determina essa serialização, sem ela qualquer mudança feita em Aluna é gerada um novo arquivo de serialização, com ela o arquivo é modificado, determinando que o arquivo a ser utilizado é somente desse ID

    private Long id;
    private String login;
    private transient String password; // transient  não é realizada a serialização dessa variavel 
    private static String nomeEscola = "DevDojo";

    private transient Turma turma;

    
    public Aluno(final Long id, final String login, final String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    

    @Override
    public String toString() {
        return "Aluno [id=" + id + ", login=" + login + ", password=" + password + " Nome da Escola= "+ nomeEscola + " Turma ="+turma+"]";
    }

    @Serial
    private void writeObject(ObjectOutputStream oos){
        try{
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());//UTF é a string no formato UTF-8 modificado. Primeiro escreve o comprimento da string (2 bytes) e depois os bytes da string em si
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream ois){
        try{
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            turma = new Turma(nomeTurma);
            
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }


    public Long getId() {
        return id;
    }
    public void setId(final Long id) {
        this.id = id;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(final String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(final String password) {
        this.password = password;
    }



    public Turma getTurma() {
        return turma;
    }



    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    

}
