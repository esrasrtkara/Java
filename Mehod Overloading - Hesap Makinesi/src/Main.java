/*
    Method Overloading kullanarak bir tane hesap makinesi tasarlamaya çalışın.
    Toplama ve çarpma metodlarını 2 veya 3 parametre alacak şekilde hesaplayınız.
*/
public class Main {
    public static int toplama(int a, int b, int c)
    {
        return (a+b+c);
    }
    public static int toplama(int a, int b)
    {
        return (a+b);
    }
    public static int çıkarma(int a, int b)
    {
        return (a-b);
    }
    public static int çarpma(int a, int b, int c)
    {
        return (a*b*c);
    }
    public static int çarpma(int a, int b)
    {
        return (a*b);
    }
    public static double bölme(double a, double b)
    {
        return (a/b);
    }
    public static void main(String[] args) {
        toplama(5,8,9);
        toplama(21,68);
        
        
    }
    
}
