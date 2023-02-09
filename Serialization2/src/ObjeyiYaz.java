
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ObjeyiYaz {
    
    public static void main(String[] args)  {
        
        Ogrenci ogrenci1 = new Ogrenci("Esra Akbulut", 409, "Elektrik Eletrobik Mühendisliği");
        Ogrenci ogrenci2 = new Ogrenci("Halil Akbulut", 122, "Bilgisayar Mühendisliği");
        Ogrenci ogrenci3 = new Ogrenci("Şeyda Sırtıkara", 570,"İşletme");
        
        Ogrenci[] ogrenciArray = {ogrenci1,ogrenci2,ogrenci3};
        
        ArrayList<Ogrenci> ogrenciList = new ArrayList<Ogrenci>(Arrays.asList(ogrenciArray));
        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Ogrenciler.bin"))){
            
            
            
           out.writeObject(ogrenciArray);
           out.writeObject(ogrenciList);
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya Bulunamadı...");
        } catch (IOException ex) {
            System.out.println("Dosya Açılırken IOException Oluştu...");
        }
    }
    
}
