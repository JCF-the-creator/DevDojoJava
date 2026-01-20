package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimencionais {
    public static void main(String[] args) {
        //Arrays multidimencionais são arrays dentro de outro arrays

        int [] array = {1,2,3};

        int [][] dias = new int[3][];

        dias[0] = new int[2];
        dias[1] = array;
        dias[2] = new int[]{10,11,12,13,14,15};

        // esse primeiro for vai rodar no primeiro array (dias)
        for(int [] segundoArray : dias ){
            System.out.println("\n-------------");
            //nesse for, se cria a variavel d para percorrer os valores do segundoArray declarado acima no array dias
            for (int d: segundoArray){
                System.out.println("dia "+d);
            }
        }

        // apenas com 1 linha
        int [][] meses = {{1,2,3},{1,2,3,4},{1,2,3,4,5,6}};

        for(int [] secondArray : meses ){
            System.out.println("\n-------------");
            for (int m: secondArray){
                System.out.println("mes "+m);
            }
        }
    }
}
