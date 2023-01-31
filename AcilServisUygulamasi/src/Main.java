
import java.util.PriorityQueue;
import java.util.Queue;


public class Main {
    
    
    public static void main(String[] args) throws InterruptedException {
        
        Queue<Hasta> acilservis = new PriorityQueue<Hasta>();
        
        acilservis.offer(new Hasta("Esra", "Baş Ağrısı"));
        acilservis.offer(new Hasta("Hakan", "Apandisit"));
        acilservis.offer(new Hasta("Kübra", "Yanık"));
        acilservis.offer(new Hasta("Recep", "Apandisit"));
        acilservis.offer(new Hasta("Leyla", "Yanık"));
        acilservis.offer(new Hasta("Merve", "Yanık"));
        
        int i = 1;
        while(!acilservis.isEmpty()){
            System.out.println("************************************************");
            System.out.println(i + ".sırada");
            System.out.println( acilservis.poll());
            System.out.println("************************************************");
            i++;
                    
            
        }
        
    }
    
}
