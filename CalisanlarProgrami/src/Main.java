
import java.util.Scanner;

/*
    Çalışanlar Programı

    Çalışan Sınıfı Şeklinde Bir Üst Sınıf

    Çalışan Sınıfından türeyen Yazılımcı adında bir alt sınıf
    Çalışan Sınıfından Türeyen Yönetici adında bir alt sınıf
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Çalışanlar Programına hoş geldiniz..");
        
        String islemler = "İşlemler...\n"
                + "1. Yazılımcı İşlemleri\n"
                + "2. Yönetici  İşlemleri\n"
                + "Çıkış için q'ya basın";
        
        System.out.println("************************");
        System.out.println(islemler);
        System.out.println("************************");
        
        
        while(true)
        {
            System.out.print("Bir işlem Seçiniz:");
            String islem = scanner.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Sistemden çıkılıyor...");
                break;
            }
            else if(islem.equals("1")){
                Yazilimci yazilimci = new Yazilimci("Esra", "Sırtıkara", 409,"C,Java,C++" );
                
                String yazilim_islemleri = "İşlemler...\n"
                                         + "1.Format At\n"
                                         + "2.Bilgileri Göster\n"
                                         + "Çıkmak için q ya basınız.";
                System.out.println("***************************");
                System.out.println(yazilim_islemleri);
                System.out.println("***************************");
                
                while(true){
                    System.out.print("İşlem Seçiniz :");
                    String y_islem = scanner.nextLine();
                    
                    if(y_islem.equals("q")){
                        System.out.println("Yazılım İşlemlerinden Çıkılıyor...");
                        break;
                    }
                    else if(y_islem.equals("1"))
                    {
                        System.out.print("İşletim Sistemi Giriniz :");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    }
                    else if(y_islem.equals("2")){
                        yazilimci.bilgileriGoster();
                    }
                    else{
                        System.out.println("Geçersiz işlem girdiniz...");
                    }
                }
                
            }
            else if(islem.equals("2")){
                Yonetici yonetici = new Yonetici("Halil", "Akbulut", 488, 10);
                
                String yönetici_islemleri = "İşlemler...\n"
                        + "1.Zam Yap\n"
                        + "2.Bilgileri Göster\n"
                        + "Çıkmak için q ya basın.";
                
                System.out.println("**************************");
                System.out.println(yönetici_islemleri);
                System.out.println("**************************");
                
                while(true){
                    System.out.println("Bir işlem seçiniz :");
                    String yo_islem = scanner.nextLine();
                    
                    if(yo_islem.equals("q")){
                        System.out.println("Yönetici İşlemlerinden Çıkılıyor...");
                        break;
                    }
                    else if(yo_islem.equals("1")){
                        System.out.println("Zam miktarını giriniz :");
                        int zam = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zam);
                    }
                    else if(yo_islem.equals("2")){
                        yonetici.bilgileriGoster();
                    }
                    else{
                        System.out.println("Geçersiz işlem girdiniz...");
                    }
                        
                }
                
            }
            else{
                System.out.println("Geçersiz işlem...");
            }
           
        }
        
    }
    
}
