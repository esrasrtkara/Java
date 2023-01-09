
public class Drayga extends  Beyblade{
    
    private  String kutsalCanavar;

    public Drayga(String kutsalCanavar, String beybladeci, int donusHizi, int saldiriGucu) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Kutsal Canavarın Adı : " + kutsalCanavar);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ı ortaya çıkarıyor... ");
        System.out.println(getBeybladeci() + " ın Saldırısı : Kaplan Pençesi ");
    }
    
    
    
}
