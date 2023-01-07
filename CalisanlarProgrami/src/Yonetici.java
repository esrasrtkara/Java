
public class Yonetici extends Calisan{
    private  int sorumlu_kişi_sayisi;
    public Yonetici(String ad, String soyad, int id,int sorumlu_kişi_sayisi) {
        super(ad, soyad, id);
        this.sorumlu_kişi_sayisi = sorumlu_kişi_sayisi;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Sorumlu Kişi Sayısı :"+ sorumlu_kişi_sayisi);
    }
    public void zamYap(int zam)
    {
        System.out.println(getAd() +" çalışanlara " + zam + "kadar zam yapıyor...");
    }
    
    
    
}
