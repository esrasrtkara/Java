
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bir Sayı Giriniz:");
        int a = scanner.nextInt();
        System.out.println("Yapmak İstediğiniz İşlemi Giriniz: ");
        String İşlem = scanner.next();
        System.out.println("Bir Sayı Giriniz:");
        int b = scanner.nextInt();
        
        
        switch(İşlem)
        {
            case "+":
                System.out.println("Sonuç:"+(a+b));
                break;
            case "-":
                System.out.println("Sonuç:"+(a-b));
                break;
            case "/":
                System.out.println("Sonuç:"+(a/b));
                break;
            case "*":
                System.out.println("Sonuç:"+(a*b));
                
            default:
                System.out.println("Yanlış işlem girdiniz.");
                break;
           
        
        }
        
    }
    
}
