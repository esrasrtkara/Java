/*
        int veri tipi 32 bitlik yer kaplıyor. -2^^-31 -  2^^31
        byte 8 bitlik yer kaplar.
        short 16 bitlik yer kaplar.

        otomatik dönüştürme
        byte --> short --> int --> long  

        */
/*
        Double veri tipi 64 bit yer kaplar
        Float veri tipi  32 bit yer kaplar

        otomatik Dönüştürme
        int --> float ->> double
*/

/*
        char veri tipi : Karakterleri göstermek için kullanılır 16 bit yer kaplar.
        boolen veri tipi; Koşul durumlarında kullanılır. true veya false değeri alır.

*/
public class Main {
    
    public static void main(String[] args) {
     
     //
       
    byte a = 100;
    
    byte b = (byte)(a/2);
        
    
    short i = 100;
    
    byte j = 2;
    
    int k = 4;
    
    
    long d = i+j+k;
    
    double e = 5.25;
    double f = 4.0;
    double g = 4d;
    
    
    float h = (float)5.0;
    
    float t = 4f;
        
        
    }
}
