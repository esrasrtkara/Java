
public abstract class Aday {
    
    private int Turkçe;
    private int Matematik;
    private int Fizik;
    private int Edebiyat;
    private  String isim;

    public Aday(int Turkçe, int Matematik, int Fizik, int Edebiyat , String isim) {
        this.Turkçe = Turkçe;
        this.Matematik = Matematik;
        this.Fizik = Fizik;
        this.Edebiyat = Edebiyat;
        this.isim =  isim;
    }

    public String getİsim() {
        return isim;
    }

    public void setİsim(String isim) {
        this.isim = isim;
    }

    public int getTurkçe() {
        return Turkçe;
    }

    public void setTurkçe(int Türkçe) {
        this.Turkçe = Türkçe;
    }

    public int getMatematik() {
        return Matematik;
    }

    public void setMatematik(int Matematik) {
        this.Matematik = Matematik;
    }

    public int getFizik() {
        return Fizik;
    }

    public void setFizik(int Fizik) {
        this.Fizik = Fizik;
    }

    public int getEdebiyat() {
        return Edebiyat;
    }

    public void setEdebiyat(int Edebiyat) {
        this.Edebiyat = Edebiyat;
    }
    
    abstract int puanHesapla();
    
}
