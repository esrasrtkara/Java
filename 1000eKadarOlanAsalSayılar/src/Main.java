/*
    1'den 1000 'e kadar olan sayılardan asal olanları ekrana yazdırın
*/

public class Main {
    public static boolean AsalMi(int sayi)
{
      for(int i = 2; i < sayi;i++)
      {
          if(sayi % i == 0 )
          {
              return false;
          }
      }
    return true;
}
    public static void main(String[] args) {
        
        for(int i=2; i<1000;i++)
        {
            if(AsalMi(i))
            {
                System.out.println(i);
            }
        }
    }
    
}
