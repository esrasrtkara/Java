
public class Main {
    
    public static void main(String[] args) {
        Kare kare1 = new Kare("kare1", 5);
        Daire daire1 = new Daire("daire1", 3);
        
        
        kare1.alan_hesapla();
        daire1.alan_hesapla();
        
        Sekil sekil = new Kare("kare", 7);
        
        //sekil.ismini_soyle();
        
        kare1.ismini_soyle();
    }
    
}
