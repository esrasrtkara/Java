
import java.util.Scanner;


/*
    while Döngüsü ile bir kullanıcı girişi yazmaya çalışın.

*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen üye olup girişinizi yapınız...");
        
        
        System.out.println("Adınız:");
        String Ad = scanner.next();
        System.out.println("Soyad:");
        String Soyad = scanner.next();
        System.out.println("E-mail adresi:");
        String email2 = scanner.next();
        System.out.println("Parola Belirleyiniz:");
        String parola2 = scanner.next();
        while (true) {   
  
            System.out.println("Lütfen E-mail adresini giriniz.");
            String email = scanner.next();
            if( email.equals(email2))
            {
                System.out.println("Lütfen parolanızı Giriniz.");
                String parola = scanner.next();
                if(parola.equals(parola2))
                {
                    System.out.println("Giriş Başarılı Hoşgeldiniz"+"   "+Ad+"   "+Soyad);
                    break;
                }
                else
                {
                    System.out.println("Lütfen parolanızı tekrar giriniz");
                }
            }
            else
            {
                
                System.out.println("Lütfen E-mail adresinizi konrol ediniz");
            }
            
        }
      
    }
}
