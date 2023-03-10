
package com.esra.thread2;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Printer implements Runnable{
    private String isim;

    public Printer(String isim) {
        this.isim = isim;
    }
    
    @Override
    public void run() {
        
        System.out.println(isim + " Çalışıyor...");
        
        for(int i = 1 ; i <= 10 ; i++){
            
            try {
                System.out.println(isim + " yazıyor : " + i);
                
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Çalışırken bir kesintiye uğradı.");
            }
        }
        
    } 
    
}
