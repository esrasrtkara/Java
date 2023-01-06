
import java.util.Scanner;


public class ATM {
    
    public void calis(Hesap hesap)
    {
        Login login =new Login();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bankamıza Hoşgeldiniz...");
        
        System.out.println("**************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("**************************");
        
        int giriş_hakki =3;
        
        while(true)
        {
            if(login.login(hesap))
            {
                System.out.println("Giriş Başarılı");
                break;
            }
            else
            {
                giriş_hakki -= 1;
                System.out.println("Giriş Başarısız. Tekrar deneyiniz.");
                System.out.println("Giriş hakkı = "+giriş_hakki);
            }
            if(giriş_hakki == 0)
            {
                System.out.println("Giriş Hakkınız Bitti");
                return;
            }
        }
        
        
        System.out.println("*************************");
        String islemler = "1.Bakiye Görüntüle\n"
                        + "2.Para Yatırma\n"
                        + "3.Para Çekme\n"
                        + "Çıkış için q ya basınız";
        System.out.println(islemler);
        System.out.println("*************************");
        
        
        while(true)
        {
            System.out.println("Bir işlem seçiniz");
            islemler = scanner.nextLine();
            if(islemler.equals("q"))
            {
      
                break;
            }
            else if(islemler.equals("1"))
            {
                System.out.println("Bakiyeniz:"+hesap.getBakiye());
                
            }
            else if(islemler.equals("2"))
            {
                System.out.print("Yatırmak İstediğiniz tutarı giriniz:");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
            }
            else if(islemler.equals("3"))
            {
                System.out.println("Çekmek İstediğiniz Tutarı Giriniz.");
                int tutar =scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);
            }
            else
            {
                System.out.println("Geçersiz İşlem...");
            }
        }
    }
    
}
