
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


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
        
        
        int i = 1;
        
       
            
            
         try(FileWriter writer = new FileWriter("log.txt")){
             
             writer.write("Idman Programı...\n");
             writer.write("Burpee Sayısı : "+idman.getBurpee() + "\n");
             writer.write("Pushup Sayısı : "+idman.getPushup()+ "\n");
             writer.write("Situp Sayısı : "+idman.getSitup()+ "\n");
             writer.write("Squat Sayısı : "+idman.getSitup()+ "\n");
             
        
        
        while(idman.IdmanBittiMi() == false)
        {
            System.out.print("Hareket Türü(Burpee,Pushup,Situp,Squat) :");
            String tur = scanner.nextLine();
            System.out.print("Hareket Sayısını Belirleyiniz :");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(tur,sayi);
            
            writer.write(i + ". İşlem -------------->  Hareket : " + tur + "Sayı : "+ sayi + "\n");
            
            i++;
          
        }
        
        
        System.out.println("İdmanınızı Başarıyla tamamladınız...");
    }   catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

