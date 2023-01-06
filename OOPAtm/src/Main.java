/*
    Object Oriented(Nesne Yönelimli) Atm Programı

    Login class'ı kullanıcı girişini kontrol edecek.

    Hesap class'ı hesap işlemlerini kontrol edecek.

    ATM ise atmmizi çalıştıracak.
*/
public class Main {
    
    public static void main(String[] args) {
        
        ATM atm = new ATM();
        Hesap hesap = new Hesap(2000,"esrasrtkara","19051996");
        atm.calis(hesap);
        System.out.println("Programdan çıkılıyor...");
    }
    
}
