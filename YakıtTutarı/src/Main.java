
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner =new Scanner(System.in);
        
        System.out.print("Kilometrede ne kadar para harcıyorsunuz?");
        
        int para = scanner.nextInt();
        
        System.out.print("Kaç kilometre gittiniz?");
        
        int km = scanner.nextInt();
        
        int yakit_tutari = km*para;
        
        System.out.println("Yakıt tutarınız :"+yakit_tutari+"tl dir");
        
        
 

    }
    
}
