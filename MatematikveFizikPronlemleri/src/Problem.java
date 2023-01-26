
public class Problem {
    
    public static class Matematik{
        public static void daireAlan(int yariçap){
            System.out.println("Dairenin Alanı : " + (Math.PI*yariçap*yariçap));
        }
        public static void ucgenCevresi(int a,int b,int c){
            System.out.println("Üçgenin Alanı : " + (a+b+c));
        }
        
    }
    
    public static class Fizik{
        
        public static void icCarpim(Vec vec1,Vec vec2){
            
            int iccarpim = vec1.getI()*vec2.getI() + vec1.getJ()*vec2.getJ() + vec1.getK()*vec2.getK();
            
            System.out.println(vec1.getIsim() + "ile" + vec2.getIsim() + " in çarpımı = " + iccarpim);
        }
        
        
    }
    
}
