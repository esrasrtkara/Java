
import java.util.Scanner;


public class Test {
    
    private static Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner scanner  = new Scanner(System.in);
    
    
    public static void islemleri_bastir(){
        
        System.out.println("\t 0-İşlemleri Görüntüle");
        System.out.println("\t 1-Şarkıcıları Görüntüle");
        System.out.println("\t 2-Şarkı Ekle");
        System.out.println("\t 3-Şarkıcı Güncelle");
        System.out.println("\t 4-Şarkıcı Sil");
        System.out.println("\t 5-Şarkıcı Ara");
        System.out.println("\t 6-Uygulamadan Çık");
    }
    public static void main(String[] args) {
        
        System.out.println("\t Şarkıcı Uygulamasına Hoşgeldiniz...");
        
        islemleri_bastir();
        
        boolean cikis = false;
        
        int islem;
        
        while(!cikis){
            
            System.out.print("Bir İşlem Seçiniz : ");
            
            islem = scanner.nextInt();
            scanner.nextLine();
            
            if(islem == 6){
                cikis = true;
                System.out.println("Uygulamadan çıkılıyor...");
            }
            else if(islem == 0){
                islemleri_bastir();
            }
            else if (islem == 1){
                sarkicilar.sarkicilariBastir();
            }
            else if(islem == 2){
                System.out.print("Eklemek istediğiniz şarkıcının adını giriniz :");
                String sarkici = scanner.nextLine();
                sarkicilar.sarkiciEkle(sarkici);
            }
            else if(islem == 3){
                System.out.print("Değiştirmek İstediğiniz Şarkıcının pozisyonunu ve yeni eklenecek şarkıcının ismini giriniz :");
                int pozisyon = scanner.nextInt();
                scanner.nextLine();
                String yeni_sarkici = scanner.nextLine();
                
                sarkicilar.sarkiciGüncelle(yeni_sarkici, pozisyon);
            }
            else if(islem == 4){
                System.out.print("Silmek istediğiniz şarkıcının pozisyonunu seçinix :");
                int pozisyon = scanner.nextInt();
                
                sarkicilar.sarkiciSil(pozisyon);
            }
            else if(islem == 5){
                System.out.print("Aramak istediğiniz şarkıcının ismini giriniz :");
                String isim = scanner.nextLine();
                sarkicilar.sarkiciAra(isim);
            }
            else{
                System.out.println("Geçersiz İşlem Girdiniz...");
            }
        }
        
    }
    
}
