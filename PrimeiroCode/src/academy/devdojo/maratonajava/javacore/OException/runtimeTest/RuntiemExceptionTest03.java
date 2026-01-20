package academy.devdojo.maratonajava.javacore.OException.runtimeTest;

public class RuntiemExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
        abreConexao2();
    }

    private static String abreConexao(){
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "conexão aberta";
        }catch(Exception e){

            e.printStackTrace();
        }finally{ //finally continua o que está no {} indenpendete das excessões, muito usado para fechar programas para não rodar erros em loop, gerando problemas de memoria ou processamento
             System.out.println("Fechando recurso liberado pelo SO(Sistema Operacional)");
        }
        return null;
    }

    private static void abreConexao2(){
        try{
            System.out.println("Abrindo arquivo 2");
            System.out.println("Escrevendo dados no arquivo 2");
            throw new RuntimeException(); // joga uma excessao para realizar teste
        }finally{ // try finally é utilizado quando não deseja realizar a tratativa da excessão porem quer rodar o codigo seguinte
             System.out.println("Fechando recurso liberado pelo SO(Sistema Operacional 2)");
        }
    }
}