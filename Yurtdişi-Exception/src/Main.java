
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        
        
        System.out.println("Sabiha Gökçen Havalimanına  Hoşgeldiniz ...");
        
        String sartlar = "Yurtdışı Çıkış Kuralları \n"
                       + "Herhangi bir siyasi yasağınızın bulunmamsı geregiyor...\n"
                       + "15 TL harç bedelinizi tam olarak yatırmanız gerekiyor...\n"
                       + "Gideceğiniz ülkeye vizenizin bulunması gerekiyor";
        
        
        String message = "Yurtdışı Şartlarından hepsini sağlamanız gerekiyor...";
        
      
        
        
        while(true){
            
            System.out.println("************************************************");
             System.out.println(sartlar);
            System.out.println("************************************************");
           
           
            
            Yolcu yolcu = new Yolcu();
            
            System.out.println("Harç bedeli kontrol ediliyor...");
            
            Thread.sleep(3000);
            
            
            try {
                yolcu.yurtdisiHarci();
            } catch (HarcException ex) {
                ex.printStackTrace();
                continue;
            }
           
            System.out.println("Siyasi yasak kontrol ediliyor...");
            
            Thread.sleep(3000);
            
            try {
                yolcu.siyasiYasak();
            } catch (SiyasiException ex) {
                ex.printStackTrace();
                continue;
            }
            
            System.out.println("Vize durumu Kontrol ediliyor...");
            
            Thread.sleep(3000);
            
            try {
                yolcu.vizeDurumu();
            } catch (VizeException ex) {
                ex.printStackTrace();
                continue;
            }
            
            
            System.out.println("İşlemleriniz tamamlandı. Yurtdışına çıkabilirsiniz.");
            break;
        
            
            
        }
    }
    
}
