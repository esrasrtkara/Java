
import java.util.Scanner;



public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üç Sayi Giriniz:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        if(a>=b && a>=c)
        {
            System.out.println("En Büyük Sayı:"+a);
        }
        else if(b>=a && b>=c)
        {
            System.out.println("En Büyük Sayi:"+b);
        }
        else 
        {
            System.out.println("En Büyük Sayi:"+c);
        }
    }
    
}
