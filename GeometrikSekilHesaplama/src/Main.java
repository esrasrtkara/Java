
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        String islemler = "İşlemler...\n"
                + "1. Kare Alan Hesapla\n"
                + "2. Üçgen Alan Hesapla\n"
                + "3. Daire Alan Hesapla\n"
                + "Çıkış = q";
        
        
        while(true){
            
            System.out.println(islemler);
            System.out.print("Hangi şeklin alanını hesaplamak istiyorsunuz :");
            String sekil_turu = scanner.nextLine();
            Sekil sekil = null;
            
            if(sekil_turu.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else if(sekil_turu.equals("1")){
                System.out.println("Karenin Kenarı : ");
                int kenar = scanner.nextInt();
                scanner.nextLine();
                sekil = new Kare("Kare", kenar);
                
                sekil.alanHesapla();
            }
            else if(sekil_turu.equals("2")){
                System.out.println("Üçgenin kenarlarını girinzi : ");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                scanner.nextLine();
                sekil = new Ucgen("Üçgen", a, b, c);
                
                sekil.alanHesapla();
            }
            else if(sekil_turu.equals("3")){
                System.out.println("Dairenin yarıçapını giriniz : ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                sekil = new Daire("Daire", 3);
                
                sekil.alanHesapla();
            }
            else{
                System.out.println("Geçersiz isşlem girdiniz...");
            }
            
         
                
            
        }
    }
    
}
