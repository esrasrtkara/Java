
public class EsitAgirlik extends Aday{

    public EsitAgirlik(int Turkçe, int Matematik, int Fizik, int Edebiyat, String isim) {
        super(Turkçe, Matematik, Fizik, Edebiyat, isim);
    }

    @Override
    int puanHesapla() {
        
        return getTurkçe() * 5 + getMatematik() * 5 + getFizik() * 1 + getEdebiyat() * 4 ;
    }
    
}
