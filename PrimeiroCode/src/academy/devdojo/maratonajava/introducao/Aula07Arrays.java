package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays {
    public static void main(String[] args) {
        // arrays são as listas
        // a estrutura se baseia em declarar o tipo da variavel, indentificar como array para ser referenciado e alocar a quantidade de memoria a ser utilizada na lista(quantidade de itens na lista)

        String[] nomes = new String[3];
        // a posição na lista se inicia com 0, tendo 3 itens fica 0,1,2
        nomes[0] = "Goku";
        nomes[1] = "Luffy";
        nomes[2] = "Mob";

        //.length ele pega o tamanho do array
        for (int i = 0; i<nomes.length; i++){
            System.out.println(nomes[i]);
        } 

        // assim é a escrita de um array em somente 1 linha
        int [] numeros = {12,24,35,48,50};
        
        // nesse for ele sempre pega o valor da lista de forma crescente, sendo o primeiro a posição 0 da lista
        for (int n : numeros){
            System.out.println(n);
        }

    }
}
