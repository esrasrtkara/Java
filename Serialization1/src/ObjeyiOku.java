
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ObjeyiOku implements Serializable{
    
    public static void main(String[] args)  {
        
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("Ogrenci.bin"))){
            
            Ogrenci ogrenci1 = (Ogrenci) in.readObject();
            Ogrenci ogrenci2 = (Ogrenci) in.readObject();
           
            System.out.println(ogrenci1);
            System.out.println(ogrenci2);
            
        } catch (IOException ex) {
            System.out.println("Dosya açılırken Hata oluştu...");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ObjeyiOku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
