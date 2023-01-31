
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;





public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Ramazan Pidesi Uygulaması....");
        Queue<String> pideKuyrugu = new LinkedList<String>();
        Random random = new Random();
        
        pideKuyrugu.offer("Esra");
        pideKuyrugu.offer("Halil");
        pideKuyrugu.offer("Rojda");
        pideKuyrugu.offer("Hüseyin");
        pideKuyrugu.offer("Ali");
        pideKuyrugu.offer("Eren");
        pideKuyrugu.offer("Kevser");
        pideKuyrugu.offer("Ebru");
        pideKuyrugu.offer("Seyda");
        pideKuyrugu.offer("Saliha");
        
        int pidesayisi = 1 + random.nextInt(10);
        
        System.out.println("Pideler çıkıyor ...." );
        System.out.println("Çıkan Pide Sayısı : " + pidesayisi);
        
        Thread.sleep(3000);
        
        
        while(pidesayisi != 0){
            
            System.out.println(pideKuyrugu.poll() + " pideyi aldı...");
            pidesayisi--;
            Thread.sleep(1000);
            
        }
        System.out.println("Pide kalmadı....");
        
    }
    
}
