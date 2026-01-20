package academy.devdojo.maratonajava.javacore.QString.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome1 = "João";  //String constant pool
        String nome2 = "João";
        // concat é o mesmo de nome1 += " Carvalho"
        nome1 = nome1.concat(" Carvalho"); //Ele adiciona "João Carvalho" a pool de string e faz referencia a ele
        System.out.println(nome1);
        System.out.println(nome1==nome2);
        String nome3 = new String("João");//cria um objeto dentro da memoria fora da pool
        System.out.println(nome2 == nome3);//nome3 está fora da pool, assim n participando da mesma área de memoria
        System.out.println(nome2 == nome3.intern());//verifica se o dado é o mesmo da pool
    }
}
