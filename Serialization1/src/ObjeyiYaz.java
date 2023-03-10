
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ObjeyiYaz {
    
    public static void main(String[] args)  {
        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Ogrenci.bin"))){
            
            Ogrenci ogrenci1 = new Ogrenci("Esra Akbulut", 409, "Elektrik Eletrobik Mühendisliği");
            Ogrenci ogrenci2 = new Ogrenci("Halil Akbulut", 122, "Bilgisayar Mühendisliği");
            
           out.writeObject(ogrenci1);
           out.writeObject(ogrenci2);
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya Bulunamadı...");
        } catch (IOException ex) {
            System.out.println("Dosya Açılırken IOException Oluştu...");
        }
    }
    
}
