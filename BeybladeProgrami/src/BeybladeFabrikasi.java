
public class BeybladeFabrikasi {
    
    public Beyblade beybladeUret(String beyblade_turu){
        
        if(beyblade_turu.equals("Dragon")){
            return new Dragon("Mavi Ejderha", "Kutsal Canavarla Konuşma", "Takao", 800, 300);
        }
        else if(beyblade_turu.equals("Dranze")){
            return new Dranza("Kırmızı Anka Kuşu", "Kai", 600, 400);
        }
        else if(beyblade_turu.equals("Drayga")){
            return new Drayga("Beyaz Kaplan", "Rei", 800, 250);
        }
        else if(beyblade_turu.equals("Draciel")){
            return new Draciel("Kara Kaplumbağa", "Max", 400, 1000);
        }
        else{
            return null;
        }
    }
    
}
