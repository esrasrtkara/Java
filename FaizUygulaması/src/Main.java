
import java.util.Scanner;

/*
    Faiz Uygulaması
    Kullanıcıdan ana para değerini ve parasını kaç yıl vadeli yatırmak istediği bilgisini alın ve her sene sonunda toplam para miktarının ekrana yazdırın.
    Faiz oranı :%6 
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Lütfen yatıracağınız parayı giriniz:");
        double anapara =scanner.nextDouble();
        
        System.out.println("Lütfen Kaç yıl vade istediğinizi giriniz:");
        int yıl =scanner.nextInt();
        
        for(int i =1; i<=yıl;i++)
        {
            anapara += anapara * 0.06;
            System.out.println("Toplam paranız:"+"   "+i+"  "+" = "+anapara);
            
        }
    }
    
}
