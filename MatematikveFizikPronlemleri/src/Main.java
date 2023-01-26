
import java.util.Scanner;


// Basit matematik ve fizik problemleri
// Daire Alan -Matematik
// Üçgen çevresi -Matematik
// 3 boyutlu vektörlerin iç çarpımı -Fizik

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Matematik ve Fizik Problemlerine Hoşgeldiniz...");
        
        
        String islemler = "İşlemler...\n"
                + "1. Daire Alanı Hesaplama\n"
                + "2. Üçgen Çevresi Hesaplama\n"
                + "3. 2 vektörün İç Çarpımını Hesaplama\n"
                + "Çıkış : q";
        
        
        while(true){
            System.out.println(islemler);
            
            System.out.print("İşlemi Seçiniz :");
            
            String islem = scanner.nextLine();
            //scanner.next();
            
            if(islem.equals("q")){
                System.out.println("Çıkılıyor...");
                break;
            }
            else if(islem.equals("1")){
                System.out.print("Dairenin yarıçapı : ");
                
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                Problem.Matematik.daireAlan(yaricap);
 
            }
            else if(islem.equals("2")){
                System.out.print("Üçgenin Kenarlarını giriniz :");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                scanner.nextLine();
                Problem.Matematik.ucgenCevresi(a, b, c);
                
              
            }
            
            else if(islem.equals("3")){
                
                
               Vec vec1 = new Vec("Vektor1");
               Vec vec2 = new Vec("Vektor2");
               
               Problem.Fizik.icCarpim(vec1, vec2);
            }
            
            else{
                System.out.println("Geçersiz işlem....");
            }
                
            
            
        }
                
        
        
        
    }
    
}
