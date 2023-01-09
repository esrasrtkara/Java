
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
         Scanner scanner =new Scanner(System.in);
         
         System.out.println("Beyblade Programına Hoşgeldiniz...");
         System.out.println("Çıkmak için q' ya basınız.");
         
         while(true){
             
             System.out.print("Beyblade türünü Seçiniz : ");
              String islem = scanner.nextLine();
             
              if(islem.equals("q")){
                  System.out.println("Programdan çıkılıyor...");
                  break;
              }
              else{
                  
                  BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                  
                  Beyblade beyblade = fabrika.beybladeUret(islem);
                  
                  if(beyblade == null){
                      System.out.println("Lütfen geçerli bir beyblade türü giriniz.");
                      
                  }
                  else{
                      beyblade.bilgileriGoster();
                      beyblade.saldir();
                      beyblade.kutsalCanavarOrtayaCikar();
                  }
              }
         }
    }
}
