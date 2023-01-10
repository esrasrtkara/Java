
import java.util.ArrayList;


public class Sarkicilar {
    
    ArrayList<String> sarkici_listesi = new ArrayList<String>();
    
    public void sarkicilariBastir(){
        
        System.out.println("Şarkıcı Listesinde " + sarkici_listesi.size() + " kadar şarkıcı var");
        for(int i = 0; i < sarkici_listesi.size();i++){
            System.out.println((i+1) + ".Şarkıcı :" + sarkici_listesi.get(i));
        }
    }
    
    public void sarkiciEkle(String sarkici){
        
        sarkici_listesi.add(sarkici);
        
        
        System.out.println("Şarkıcı Listesi Güncellendi...");
                
    }
    
    public void sarkiciGüncelle(String yeni_sarkici,int pozisyon){
        
        sarkici_listesi.set(pozisyon, yeni_sarkici);
        
        System.out.println("Şarkıcı Listesi Güncellendi...");
    }
    
    public void sarkiciSil(int pozisyon){
        
        String isim = sarkici_listesi.get(pozisyon);
        sarkici_listesi.remove(pozisyon);
        
        System.out.println(isim + " isimli şarkıcı listeden silindi...");
    }
    
    public void sarkiciAra(String isim){
        
        int pozisyon = sarkici_listesi.indexOf(isim);
        
        if(pozisyon >= 0){
            System.out.println(isim + " isimli şarkıcı bulundu" + (pozisyon+1) + " .pozisyonda");
        }
        else{
            System.out.println("Şarkıcı Bulunamadı...");
        }
        
        
    }
    
}
