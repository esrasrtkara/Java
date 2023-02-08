
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    
    public static void main(String[] args) {
        
       /* try(FileWriter writer = new FileWriter("ogrenciler.txt",true)){
            
        /*   writer.write("Esra Akbulut,Elektrik Elektronik Mühendisliği\n");
            writer.write("Ali Şahin,Bilgisaya Mühendisliği\n");
            writer.write("Eren Yılmaz,İşletme\n");
            writer.write("Hatice Yalçın,Bilgisayar Mühendisliği\n");
            writer.write("Ebru Doğan,Finansal Matematik\n");
            writer.write("Halil Say,Bilgisayar Mühendisliği\n");
            writer.write("Emine Gök,Elektrik Elektronik Mühendisliği\n");
            
            
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }*/
       
       
      // try(Scanner scanner = new Scanner (new FileReader("ogrenciler.txt"))){
     /*  try(Scanner scanner = new Scanner (new BufferedReader(new FileReader("ogrenciler.txt")))){    
          
             while(scanner.hasNextLine()){
                 
                 String ogrenci_bilgisi = scanner.nextLine();
                 
                 String[] array = ogrenci_bilgisi.split(",");
                 
                if(array[1].equals("Bilgisayar Mühendisliği")){
                    System.out.println("Öğrenci Bölgesi :" + ogrenci_bilgisi);
                }
             }     
           
            
          
           
           
       } catch (FileNotFoundException ex) {
            System.out.println("Dosya Bulunamadı.");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken bir hata oluştu.");
        }*/
     
     try(BufferedWriter writer = new BufferedWriter(new FileWriter("ogrenciler.txt",true))){
         
         writer.write("Ali Ozan,İnşaat Mühendisliği\n");
         
     }  catch (IOException ex) {
           System.out.println("Dosya açılırken hata oluştu...");
        }
    }
    
}
