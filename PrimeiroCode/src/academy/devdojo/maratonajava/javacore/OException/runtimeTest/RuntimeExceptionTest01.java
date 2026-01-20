package academy.devdojo.maratonajava.javacore.OException.runtimeTest;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
    //RuntimeException são erros que ocorre antes de compilar o programa
    //Como por exemplo tentar da Print em algo que não existe
   // Object object = null;
   // System.out.println(object.toString()); //toString n é declaro a nenhum valor, esta comentado para executar o exemplo abaixo 
    //erro comum é não ter a posição em uma lista, o 2 seria o terceiro item da lista já que a contagem é 0,1,2 e tem somente 2 itens posição 0,1
    int [] nums = {1,2};
    System.out.println(nums[2]);
    }
}
