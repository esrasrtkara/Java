
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class WaitNotify {
    
    public void thread1Fonksiyonu(){
        
        synchronized(this){
            
            System.out.println("Thread 1 çalışıyor...");
            
            System.out.println("Thread 1 Thread 2 nin kendisini uyandırmasını bekliyor...");
            
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(WaitNotify.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            System.out.println("Thread 1 Uyandı devam ediyor...");
        }
        
    }
    public void thread2Fonksiyonu(){
        
        Scanner scanner = new Scanner(System.in);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(WaitNotify.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        synchronized(this){
            System.out.println("Thread 2 çalışıyor...");
            
            System.out.println("Devam etmek için bir tuşa basın...");
            
            
            scanner.nextLine();
            
            
           notify();
            
            System.out.println("Uayandırdım ben gidiyorum ama 2 sn bekle...");
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(WaitNotify.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
}
