
import java.util.Scanner;

/*
    Girilen bir sayının armstrong sayısını olup olmadığını bulmaya çalışın.
    Örneğin, 4 basamaklı bir sayının armstrong sayısı olması için şu şartı sağlaması gerekir.
    1634 = 1^4 + 6^4 + 3^4 + 4^4  (Buradaki 4 Basamak Sayısı)
    371  = 3^3 + 7^3 + 1^3  (Buradaki 3 basamak sayısı)

    Bu programı do while döngüsü yardımıyla yapınız.
*/
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz:");
        int Sayı = scanner.nextInt();
        System.out.println("Basamak Sayısını Giriniz:");
        int Basamak_sayısı =scanner.nextInt();
        int gecici_sayı = Sayı;
        
        int Toplam =0;
        
        do { 
            int basamak_degeri = gecici_sayı % 10;
            gecici_sayı /= 10;
            Toplam  += Math.pow(basamak_degeri, Basamak_sayısı) ;
        } while (gecici_sayı >0);
        
        if ( Sayı == Toplam) {
            
            System.out.println("Armstrong Sayısıdır");
            
        }
        else
        {
            System.out.println("Armstrong Sayısı Değildir.");
        }
    }
    
    
    
}
