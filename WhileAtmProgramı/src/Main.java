
import java.util.Scanner;


/*
    While döngüsü yardımıyla bir tane ATM programı yapmaya çalışın

    İşlemler:
    1.İşlem : Bakiye Öğrenma
    2.İşlem : Para Çekme
    3.İşlem : Para Yatırm
    Çıkış : q
*/
public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("*************************************");
        System.out.println("Bakiye Öğrenmek için 1'e Basınız\n"
                         + "Para Çekmek için 2'ye basınız\n"
                         + "Para Yatırmak için 3'e Basınız\n"
                         + "İşleme Devam Etmek İsremiyorsanız q'a basınız");
        System.out.println("*************************************");
        
        int Bakiye =5000;
        while(true)
        {
            System.out.println("Lütfen Yapaçağınız İşlemi Seçiniz:");
            String işlem = scanner.next();
            if(işlem.equals("1") )System.out.println("Bakiyeniz:"+Bakiye);
            else if(işlem.equals("2"))
            {
                System.out.println("Çekmek istediğiniz  tutarı giriniz:");
                int çekilentutar =scanner.nextInt();
                Bakiye -= çekilentutar; 
                System.out.println("Kalan Bakiyeniz:"+Bakiye);
            }
            else if(işlem.equals("3"))
            {
                System.out.println("Eklemek İstediğiniz Tutarı Giriniz");
                int eklenentutar = scanner.nextInt();
                Bakiye += eklenentutar;
                System.out.println("Toplam Bakiyeniz :"+ Bakiye);
            }
            else if(işlem.equals("q"))
            {
                System.out.println("Sistemden Çıkılıyor...");
                break;
            }
            
            else System.out.println("Geçersiz İşlem Girdiniz!");
        }
                
       
    }
    
}
