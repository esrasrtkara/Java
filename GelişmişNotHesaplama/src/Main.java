
import java.util.Scanner;

/*
    Kullanıcıdan Vize1,Vize2 ve Final notunu alarak bir harf hesaplama sistemi yapmaya çalışın.
    Ayrıca kullanıcıdan okuldaki genel ortalamasını alarak, DD alma ve 2.50'nin altında olma koşuluna göre ekrana 
    bir tavsiye mesajı yazdırın.

    Vize1 toplam notun %30'una etki edecek.
    Vize2 toplam notun %30'una etki edecek.
    Final toplam notun %40'ına etki edecek.

    Toplam Not >= 90 --->AA
    Toplam Not >= 85 --->BA
    Toplam Not >= 80 --->BB
    Toplam Not >= 75 --->CB
    Toplam Not >= 70 --->CC
    Toplam Not >= 65 --->DC
    Toplam Not >= 60 --->DD
    Toplam Not >= 55 --->FD
    Toplam Not <  55 --->FF
*/
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Vize1 Notunuzu Giriniz:");
        int Vize1 = scanner.nextInt();
        System.out.println("Vize2 Notunuzu Giriniz:");
        int Vize2 = scanner.nextInt();
        System.out.println("Final Notunuzu Giriniz:");
        int Final = scanner.nextInt();
        
        System.out.println("Genel Ortalamanızı Giriniz:");
        double GO = scanner.nextDouble();
        
        double Toplam_Not = (Vize1*0.3)+(Vize2*0.3)+(Final*0.4);
        System.out.println("Toplam Not:"+Toplam_Not);
        
       if(Toplam_Not >= 90)
       {
           System.out.println("Harf Notunuz:AA");
       }
       else if (Toplam_Not >=85) 
       {
            System.out.println("Harf Notunuz:BA");
       }
       else if (Toplam_Not >=80) 
       {
            System.out.println("Harf Notunuz:BB");
       }
       else if (Toplam_Not >=75) 
       {
            System.out.println("Harf Notunuz:CB");
       }
       else if (Toplam_Not >=70) 
       {
            System.out.println("Harf Notunuz:CC");
       }
       else if (Toplam_Not >=65) 
       {
            System.out.println("Harf Notunuz:DC");
       }
       else if (Toplam_Not >=60) 
       {
            System.out.println("Harf Notunuz:DD");
            if (GO < 2.5) {
               System.out.println("Çalışarak Ortalamanızı Düzeltebilirsiniz.");
           }
            
       }
       else if (Toplam_Not >=55) 
       {
            System.out.println("Harf Notunuz:FD");
       }
       else 
       {
            System.out.println("Harf Notunuz:FF");
       }
        
        
    }
    
}
