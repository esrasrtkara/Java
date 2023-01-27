
public class Sayisal extends Aday{

    public Sayisal(int Türkçe, int Matematik, int Fizik, int Edebiyat, String isim) {
        super(Türkçe, Matematik, Fizik, Edebiyat, isim);
    }

    @Override
    int puanHesapla() {
        return getTurkçe() * 5 + getMatematik() * 5 + getFizik() * 4 + getEdebiyat() * 1;
    }
    
}
