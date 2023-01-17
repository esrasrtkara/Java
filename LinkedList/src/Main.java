
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Main {
    
    public static void islemleri_bastir(){
        
        System.out.println("0 - İşlemleri Görüntüle... ");
        System.out.println("1 - Bir sonraki şehre git...");
        System.out.println("2 - Bir önceki şehre git ...");
        System.out.println("3 - Uygulamadan çık");
    }
    
    public static void sehirleri_turla(LinkedList<String>sehirler){
        
        ListIterator<String> iterator = sehirler.listIterator();
        
        int islem;
        
        islemleri_bastir();
        
        Scanner scanner = new Scanner(System.in);
        
        if(!iterator.hasNext()){
            System.out.println("Herhangi bir şehir bulunmuyor");
        }
        
        boolean cikis = false;
        boolean ileri = true;
        
        while(!cikis){
             
            System.out.print("Bir işlem seçiniz : ");
            islem = scanner.nextInt();
            
            if(islem == 3){
                System.out.println("Uygulamadan Çıkılıyor...");
                cikis = true;
            }
            
            else if(islem == 0){
                islemleri_bastir();
            }
            else if(islem == 1){
                if(!ileri){
                    if(iterator.hasNext()){
                        iterator.next();
                    }
                    ileri = true;
                }
                if(iterator.hasNext()){
                    System.out.println("Şehre gidiliyor : " + iterator.next() );
                     
                }
                else{
                    System.out.println("Gidilecek şehir kalmadı...");
                    ileri = true;
                }
               
            }
            else if(islem == 2){
                if(ileri){
                    if(iterator.hasPrevious()){
                        iterator.previous();
                    }
                    ileri = false;
                }
                if(iterator.hasPrevious()){
                    System.out.println("Şehre gidiliyor : " + iterator.previous());
                     
                }
                
                else{
                    System.out.println("Şehir Turu Başladı...");
                    
                   // ileri = true;
                }
               
            }
            else{
                
                System.out.println("Geçersiz işlem seçtiniz...");
              
            }
                    
        }
        
        
    }
    
    public static void main(String[] args) {
        
        LinkedList<String> sehirler = new LinkedList<String>();
        
        sehirler.add("Ankara");
        sehirler.add("Eskisehir");
        sehirler.add("Afyon");
        
        
        sehirleri_turla(sehirler);
    }
    
}
