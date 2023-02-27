
import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;




public class Baglanti {
    
    private String kullanici_adi = "root";
    private  String parola = "";
    
    private String db_ismi = "demo";
    
    private  String host = "localhost";
    
    private int port = 3306;
    
    private  Connection con = null;
    
    private Statement statement = null;
    
    private  PreparedStatement preparedStatement = null;
    
    public void preparedCalisanlariGetir(int id){
        
      /*  try {
            statement = con.createStatement();
            String sorgu = "Select * From calisanlar where ad like 'E%'";
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
                System.out.println("Ad : " + rs.getString("ad"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        String sorgu = "Select * From calisanlar where id > ?";
        
        try {
            preparedStatement =  con.prepareStatement(sorgu);
            preparedStatement.setInt(1,id);
            
           ResultSet rs = preparedStatement.executeQuery();
           
           while(rs.next()){
               
               String ad = rs.getString("ad");
               String soyad = rs.getString("soyad");
               String email = rs.getString("email");
               
               System.out.println("Ad : " + ad + " Soyad : " + soyad + " Email : " + email);
                       
           }
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
    }
    
    public void calisanSil(){
        
        try {
            statement = con.createStatement();
            
            String sorgu = "Delete from calisanlar Where id > 4";
            
            int deger = statement.executeUpdate(sorgu);
            
            System.out.println(deger + " kadar veri etkilendi...");
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void calisanEkle(){
        
        try {
            statement = con.createStatement();
            int id = 6;
            
            String ad = "Eren";
            String soyad = "Akkoç";
            String email = "e@gmail.com";
            
            String sorgu = "Insert Into calisanlar (id,ad,soyad,email) VALUES (" + " '" +id + "'," + " '" +ad + "'," + " '" +soyad + "'," + " '" +email + "')";
            
            statement.executeUpdate(sorgu);
                    
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public void calisanGuncelle(){
        
        try {
            statement = con.createStatement();
            String sorgu = "Update calisanlar Set email = 'esra@gmail.com' where id = 1";
            
            statement.executeUpdate(sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void calisanlariGetir(){
        
        String sorgu = "Select * From calisanlar ";
        
        try {
            statement = con.createStatement();
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
                int id = rs.getInt("id");
                
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");
                
                System.out.println("Id : " + id + " Ad : " + ad + " Soyad : " + soyad + " Email : " + email);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public Baglanti(){
        
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi + "?useUnicode=true&characterEncoding=utf8";
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı...");
        }
        
        try {
            con = DriverManager.getConnection(url, kullanici_adi, parola);
            System.out.println("Bağlantı başarılı...");
                    } catch (SQLException ex) {
            System.out.println("Bağlantı başarısız...");
          //  ex.printStackTrace();
        }
        
      
    }
    
    public static void main(String[] args) {
        Baglanti baglanti = new Baglanti();
      //  System.out.println("Eklenmeden Önce.......");
       // baglanti.calisanlariGetir();
       // System.out.println("************************************");
       // baglanti.calisanGuncelle();
       // baglanti.calisanEkle();
       // baglanti.calisanSil();
       // baglanti.calisanlariGetir();
       
       baglanti.preparedCalisanlariGetir(4);
    }
    
    
    
}
