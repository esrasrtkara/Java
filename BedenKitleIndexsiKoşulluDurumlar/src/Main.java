/*
    Kullanıcıdan alınan boy ve kilo değerlerine göre beden kitle indeksini hesaplayın ve aşağıdaki kurallara göre çıktı oluşturunuz.
        Beden Kitle Indeksi : Kilo / Boy(m) * Boy(m)

        BKİ   18.5' un altındaysa  --------> Zayıf

        BKİ   18.5 ile 25 arasındaysa  ---------> Normal

        BKİ   25 ile  30  arasındaysa  ---------> Fazla Kilolu

        BKİ   30'un üstündeyse  -----------> Obez
*/
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Boyunuzu Giriniz(m):");
        double Boy = scanner.nextDouble();
        System.out.println("Kilonuzu Giriniz:");
        double Kilo = scanner.nextDouble();
        
        double BKI = Kilo / (Boy*Boy);
        
        System.out.println("Beden Kitle Indeksiniz:"+BKI);
        
        if(BKI < 18.5)
        {
            System.out.println("Zayıf");
        }
        else if (BKI >= 18.5  &&  BKI < 25) {
            
            System.out.println("Normal");   
        }
        else if (BKI >= 25  &&  BKI < 30) {
            
            System.out.println("Fazla Kilolu");   
        }
        else if (BKI >= 30) {
            
            System.out.println("Obez");   
        }
       
    }
}
