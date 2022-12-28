
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double boy = scanner.nextDouble();
        boy /=100;
        double kilo = scanner.nextDouble();
        
        double kitle_indeksi = kilo / (boy*boy);
        System.out.println("Kitle İndeksiniz = "+kitle_indeksi);

    }
    
}
