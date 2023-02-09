
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ObjeyiOku implements Serializable{
    
    public static void main(String[] args)  {
        
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("Ogrenciler.bin"))){
            
            Ogrenci[] ogrenciArray = (Ogrenci[]) in.readObject();
            ArrayList<Ogrenci> ogrenciList = (ArrayList<Ogrenci>) in.readObject();
            
            
            System.out.println("*****************************************");
            for(Ogrenci o : ogrenciArray){
                System.out.println(o);
                System.out.println("--------------------------------------");
            }
            System.out.println("******************************************");
            for(Ogrenci o : ogrenciList){
                System.out.println(o);
                System.out.println("--------------------------------------");
            }
           
          
            
        } catch (IOException ex) {
            System.out.println("Dosya açılırken Hata oluştu...");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ObjeyiOku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
