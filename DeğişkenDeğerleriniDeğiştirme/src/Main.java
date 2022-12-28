
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1;
        int sayi2;
        System.out.println("Sayı1 i Giriniz :");
        
        sayi1 = scanner.nextInt();
        
        
        System.out.println("Sayi2 yi Giriniz :");
        
        sayi2 = scanner.nextInt();
        
        int gecici = sayi1;
        System.out.println("Sayi1 :"+ (sayi1 = sayi2));
        System.out.println("Sayi2 :"+ (sayi2 = gecici));
       
    }
}
