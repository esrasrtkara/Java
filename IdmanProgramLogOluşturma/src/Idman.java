
public class Idman {
    private int Burpee;
    private int Pushup;
    private int Situp;
    private int Squat;

    public Idman(int Burpee, int Pushup, int Situp, int Squat) {
        this.Burpee = Burpee;
        this.Pushup = Pushup;
        this.Situp = Situp;
        this.Squat = Squat;
    }

    public int getBurpee() {
        return Burpee;
    }

    public void setBurpee(int Burpee) {
        this.Burpee = Burpee;
    }

    public int getPushup() {
        return Pushup;
    }

    public void setPushup(int Pushup) {
        this.Pushup = Pushup;
    }

    public int getSitup() {
        return Situp;
    }

    public void setSitup(int Situp) {
        this.Situp = Situp;
    }

    public int getSquat() {
        return Squat;
    }

    public void setSquat(int Squat) {
        this.Squat = Squat;
    }
    
    public void hareketYap(String hareket_turu , int sayi)
    {
        if(hareket_turu.equals("Burpee"))
        {
            burpeeYap(sayi);
        }
        else if(hareket_turu.equals("Pushup"))
        {
            pushupYap(sayi);
        }
        else if(hareket_turu.equals("Situp"))
        {
            situpYap(sayi);
        }
        else if(hareket_turu.equals("Squat"))
        {
            squatYap(sayi);
        }
        else
        {
            System.out.println("Geçersiz Hareket...");
        }
    }
    public void burpeeYap(int sayi)
    {
        if(Burpee == 0)
        {
            System.out.println("Yapacak burpee kalmadı...");
        }
        else if(Burpee - sayi < 0)
        {
            System.out.println("Hedeflediğiniz burpee geçtin. Tebrikler...");
            Burpee = 0;
            System.out.println("Kalan burpee sayınız ="+Burpee);
        }
        else
        {
            Burpee -= sayi;
            System.out.println("Kalan burpee sayınız ="+Burpee);
           
        }
    }
    public void pushupYap(int sayi)
    {
        if(Pushup == 0)
        {
            System.out.println("Yapacak pushup kalmadı...");
        }
        else if(Pushup - sayi < 0)
        {
            System.out.println("Hedeflediğiniz pushup geçtin. Tebrikler...");
            Pushup = 0;
            System.out.println("Kalan pushup sayınız ="+Pushup);
        }
        else
        {
            Pushup -= sayi;
            System.out.println("Kalan pushup sayınız ="+Pushup);
           
        }
    }
    public void situpYap(int sayi)
    {
        if(Situp == 0)
        {
            System.out.println("Yapacak situp kalmadı...");
        }
        else if(Situp - sayi < 0)
        {
            System.out.println("Hedeflediğiniz situp geçtin. Tebrikler...");
            Situp = 0;
            System.out.println("Kalan situp sayınız ="+Situp);
        }
        else
        {
            Situp -= sayi;
            System.out.println("Kalan situp sayınız ="+Situp);
           
        }
    }
    public void squatYap(int sayi)
    {
        if(Squat == 0)
        {
            System.out.println("Yapacak squat kalmadı...");
        }
        else if(Squat - sayi < 0)
        {
            System.out.println("Hedeflediğiniz squat geçtin. Tebrikler...");
            Squat = 0;
            System.out.println("Kalan squat sayınız ="+Squat);
        }
        else
        {
            Squat -= sayi;
            System.out.println("Kalan squat sayınız ="+Squat);
           
        }
    }
    
    public boolean IdmanBittiMi()
    {
        return ((Burpee == 0) && (Pushup == 0) && (Situp == 0) && (Squat == 0));
    }
}
