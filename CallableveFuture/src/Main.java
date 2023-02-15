
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        
        ExecutorService executer = Executors.newFixedThreadPool(1);
        
      /*  executer.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    Random random = new Random();
                    System.out.println("Thread çalışıyor...");
                    
                    int sure = random.nextInt(1000) + 2000;
                    
                    Thread.sleep(sure);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                System.out.println("Thread çıkıyor....");
                
                
                executer.shutdown();
            }
        });*/
      
      Future<Integer> future = executer.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                
                
                    Random random = new Random();
                    System.out.println("Thread çalışıyor...");
                    
                    int sure = random.nextInt(1000) + 2000;
                 try{   
                    Thread.sleep(sure);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                System.out.println("Thread çıkıyor....");
                
                return sure;
              
            }
           
           
            
        });
        executer.shutdown();
        
        try {
            System.out.println("Dönen değer : "+future.get());
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
