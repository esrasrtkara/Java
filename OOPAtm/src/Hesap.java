
public class Hesap {
    
    private int bakiye;
    private String kullanici_adi;
    private String parola;

    public Hesap(int bakiye, String kullanici_adi, String parola) {
        this.bakiye = bakiye;
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }
    public void paraYatir(int tutar){
        bakiye += tutar;
        System.out.println("Yeni Bakiyeniz:"+bakiye);
    }
    public void paraCek(int tutar){
        if(tutar>1500)
        {
            System.out.println("Günlük para çekme limitinizi aştığınız için istediğiniz tutar verilemiyor limitinizi artırıp tekrar deneyiniz.");
        }
        else if(bakiye - tutar < 0)
        {
            System.out.println("Girdiğiniz tutar için yeterli bakiyeniz yok.");
        }
        else
        {
            bakiye -= tutar;
            System.out.println("Yeni Bakiyeniz:"+bakiye);
        }
    }
    
    
}
