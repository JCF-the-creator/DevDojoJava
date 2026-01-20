package academy.devdojo.maratonajava.javacore.KEnum.Dominio;
// utilizando o override vc utiliza o calcular desconto para mudar o valor de acordo com as variaveis
 public enum TipoPagamento{ 
    DEBITO{

      @Override
      public double calcularDesconto(double valor) {
         
         return valor * 0.1;
      }
      
    },
    CREDITO{

      @Override
      public double calcularDesconto(double valor) {
        
         return valor * 0.05;
      }
      
    };

    // o termo abstrato é usado para declarar um metodo que vai ser sobrescrito, e ele não carrega nenhum codigo com ele, já que serve apenas para declarar a variavel
    public abstract double calcularDesconto(double valor);
 }
