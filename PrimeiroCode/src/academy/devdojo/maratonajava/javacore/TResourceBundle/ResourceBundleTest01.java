package academy.devdojo.maratonajava.javacore.TResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        System.out.println();
        ResourceBundle bundle =  ResourceBundle.getBundle("messages", new Locale("pt","BR"));//busca o arquivo

        System.out.println(bundle.getString("hello"));// coloque as chaves do arquivo
        System.out.println(bundle.getString("good.morning"));
        System.out.println();

        bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));// em caso de trabalhar com varios arquivos recomenda-se usar as mesmas chaves, assim mudando apenas o arquivo para realizar a tradução do texto por completo 
        System.out.println(bundle.getString("good.morning"));
        System.out.println();
    }
}
