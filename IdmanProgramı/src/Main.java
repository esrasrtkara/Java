
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Idman Programına Hoşgeldiniz...");
        String idmanlar = "Geçerli Hareketler\n"
                        + "Burpee\n"
                        + "Pushup\n"
                        + "Situp\n"
                        + "Squat";
        
        System.out.println(idmanlar);
        
        System.out.println("Bir idman oluşturunuz...");
        
        System.out.print("Burpee Sayısı : ");
        int Burpee = scanner.nextInt();
        System.out.print("Pushup Sayısı : ");
        int Pushup = scanner.nextInt();
        System.out.print("Situp Sayısı : ");
        int Situp = scanner.nextInt();
        System.out.print("Squat Sayısı : ");
        int Squat = scanner.nextInt();
        
        scanner.nextLine();
        
        Idman idman =new Idman(Burpee, Pushup, Situp, Squat);
        
        
        while(idman.IdmanBittiMi() == false)
        {
            System.out.print("Hareket Türü(Burpee,Pushup,Situp,Squat) :");
            String tur = scanner.nextLine();
            System.out.print("Hareket Sayısını Belirleyiniz :");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(tur,sayi);
            
            
            
        }
        
        
        System.out.println("İdmanınızı Başarıyla tamamladınız...");
    }
    
}
