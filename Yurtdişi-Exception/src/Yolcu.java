
import java.util.Scanner;
class SiyasiException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("Siyasi yasağınız bulunuyor...");
    }   
}

class VizeException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("Güdeceğiniz Ülkeye Vizeniz bulunmamaktadır...");
        
    }         
}
class HarcException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("Lütfen yurtdışı harcını tam yatırın...");
    }
    
}


public class Yolcu {
    
    
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
    

   
    public void yurtdisiHarci() throws HarcException {
        
        if(this.harc < 15){
            throw new HarcException();
            
        }
        else{
            
            System.out.println("Yurtdışı harcı işlemi tamam!");
            
        }
        
        
    }

   
    public void siyasiYasak() throws SiyasiException {
        
        if(this.siyasiYasak == true){
            
          throw new SiyasiException();
            
        }
        else{
            System.out.println("Siyasi yasağınız yoktur.");
            
        }
        
    }

    
    public void vizeDurumu() throws VizeException {
        
        if(this.vizeDurumu == true){
           
            System.out.println("Vize işlemleri tamam!");
        }
        else{
            throw new VizeException();
           
        }
        
        
        
    }

   
    
    
    
}
