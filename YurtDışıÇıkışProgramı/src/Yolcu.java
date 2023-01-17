
import java.util.Scanner;


public class Yolcu implements YurtDisiKurallari{
    
    
    private int harc;
    private boolean  siyasiYasak;
    private boolean  vizeDurumu;

    public Yolcu() {
        
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Yatırdığınız Harç Bedeli : ");
        this.harc = scanner.nextInt();
        scanner.nextLine();
        
        
        System.out.print("Herhangi bir Siyasi Yasağınız bulunuyor mu? ");
        String cevap = scanner.nextLine();
        
        if(cevap.equals("Evet")){
            
            this.siyasiYasak = true;
        }
        else if(cevap.equals("Hayır")){
            this.siyasiYasak = false;
        }
        
        System.out.print("Vizeniz Bulunuyor mu ? ");
        
        String cevap2 = scanner.nextLine();
        
        if(cevap2.equals("Evet")){
            
            this.vizeDurumu = true;
        }
        else{
            this.vizeDurumu = false;
        }
     
    }
    

    @Override
    public boolean yurtdisiHarci() {
        
        if(this.harc < 15){
            System.out.println("Lütfen yurtdışı harcını tam yatırın ...");
            
            return false;
        }
        else{
            
            System.out.println("Yurtdışı harcı işlemi tamam!");
            return true;
        }
        
        
    }

    @Override
    public boolean siyasiYasak() {
        
        if(this.siyasiYasak == true){
            
            System.out.println("Siyasi Yasağınız bulunmaktadır. Yurtdışına çıkamazsınız.");
            return false;
            
        }
        else{
            System.out.println("Siyasi yasağınız yoktur.");
            return true;
        }
        
    }

    @Override
    public boolean vizeDurumu() {
        
        if(this.vizeDurumu == true){
            System.out.println("Vizeniz bulunmaktadır.");
            return true;
        }
        else{
            System.out.println("Vizeniz yoktur.");
            return false;
        }
        
        
        
    }
    
    
    
}
