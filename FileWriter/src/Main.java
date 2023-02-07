
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    
    public static void main(String[] args) {
        
        FileWriter writer = null;
                
                
        try {
            writer = new FileWriter("dosya.txt",true);
            
            
            
            //writer.write("Esra Akbulut\n");
           // writer.write("Halil Akbulut\n");
           
           writer.write("Seyda Sırtıkara");
        } catch (IOException ex) {
            System.out.println("IO Exception oluştu....");
        }
        
        finally{
            
            if(writer != null){
                try {
                    writer.close();
                } catch (IOException ex) {
                    System.out.println("Dosya kapatılırken bir hata oluştu...");
                }
            }
        }
        
    }
    
}
