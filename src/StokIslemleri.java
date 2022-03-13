
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StokIslemleri {
     private Connection con = null;
    
    private Statement statement = null;
    private PreparedStatement prepePreparedStatement = null;
    
    public ArrayList<TableData2> cerceveleriGetir(){
        
        ArrayList<TableData2> cikti2 = new ArrayList<TableData2>();
        
         try {
             statement= con.createStatement();
             
             String sorgu2 = "Select * From cercevestock";
             ResultSet rs2 = statement.executeQuery(sorgu2);
            
             while(rs2.next()){
                 
                 String type     = rs2.getString("type");
                 String model    = rs2.getString("model");
                 String brand    = rs2.getString("brand");
                 String color    = rs2.getString("color");
                 int piece       = rs2.getInt("piece");
                 String purchase = rs2.getString("purchase");
                 String sale     = rs2.getString("sale"); 
                 
                 cikti2.add(new TableData2(type, model, brand, color, piece, purchase, sale));
                                  
             }
             return cikti2;
                                                  
         } catch (SQLException ex) {
             Logger.getLogger(StokIslemleri.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         }
        
        
        
        
    }
    
    public ArrayList<Tabledata> camlariGetir(){
       
        ArrayList<Tabledata> cikti = new ArrayList<Tabledata>();
        
         try {
             statement =con.createStatement();
             String sorgu = "Select * From camstock";
             ResultSet rs = statement.executeQuery(sorgu);
             
             while(rs.next()){
                 
                 String glass_type =rs.getString("type");
                 String brand = rs.getString("brand");
                 String sph = rs.getString("sph");
                 String cyl = rs.getString("cyl");
                 int piece = rs.getInt("piece");
                 String purchase = rs.getString("purchase");
                 String sale = rs.getString("sale");
                 
                 cikti.add(new Tabledata(glass_type, brand, sph, cyl, piece, purchase, sale));   
             }
             return cikti;
             
             
             
         } catch (SQLException ex) {
             Logger.getLogger(StokIslemleri.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         }     
    }
    public void cerceveEkle(String type,String model,String brand,String color,String piece,String purchase,String sale){
        
       String sorgu = "Insert into cercevestock (type,model,brand,color,piece,purchase,sale) VALUES (?,?,?,?,?,?,?)";
       
        try {
             prepePreparedStatement = con.prepareStatement(sorgu);
             prepePreparedStatement.setString(1,type);
             prepePreparedStatement.setString(2,model);
             prepePreparedStatement.setString(3,brand);
             prepePreparedStatement.setString(4,color);
             prepePreparedStatement.setString(5,piece);
             prepePreparedStatement.setString(6,purchase);
             prepePreparedStatement.setString(7,sale);
             
             prepePreparedStatement.executeUpdate();
             
         } catch (SQLException ex) {
             Logger.getLogger(StokIslemleri.class.getName()).log(Level.SEVERE, null, ex);
         }      
    }
    public void camEkle(String type,String brand,String sph,String cyl,String piece,String purchase,String sale){
        
       String sorgu = "Insert into camstock (type,brand,sph,cyl,piece,purchase,sale) VALUES (?,?,?,?,?,?,?)";
       
        try {
             prepePreparedStatement = con.prepareStatement(sorgu);
             prepePreparedStatement.setString(1,type);
             prepePreparedStatement.setString(2,brand);
             prepePreparedStatement.setString(3,sph);
             prepePreparedStatement.setString(4,cyl);
             prepePreparedStatement.setString(5,piece);
             prepePreparedStatement.setString(6,purchase);
             prepePreparedStatement.setString(7,sale);
             
             prepePreparedStatement.executeUpdate();
             
         } catch (SQLException ex) {
             Logger.getLogger(StokIslemleri.class.getName()).log(Level.SEVERE, null, ex);
         }      
    }
    public void uyelikEkle(String username,String password){
        
        String sorgu = "Insert into kullanicigiris (username,password) VALUES (?,?)";
         try {
             prepePreparedStatement = con.prepareStatement(sorgu);
             prepePreparedStatement.setString(1,username);
             prepePreparedStatement.setString(2,password);
             prepePreparedStatement.executeUpdate();
             
         } catch (SQLException ex) {
             Logger.getLogger(StokIslemleri.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        
    }
    public boolean girisYap(String kullanici_adi,String parola){
        
        String sorgu = "Select * From kullanicigiris where username = ? and password = ?";
        
         try {
             prepePreparedStatement = con.prepareStatement(sorgu);
             
             prepePreparedStatement.setString(1,kullanici_adi);
             prepePreparedStatement.setString(2,parola);
             
             ResultSet rs = prepePreparedStatement.executeQuery();
             
             return rs.next();
         } catch (SQLException ex) {
             Logger.getLogger(StokIslemleri.class.getName()).log(Level.SEVERE, null, ex);
             return false;
         }
        
        
    }
    public StokIslemleri(){

        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_ismi;
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");   
        }catch (ClassNotFoundException ex){
            System.out.println("Driver bulunamadi.");
        }
        
        try {
            con = DriverManager.getConnection(url, Database.kullanici_adi, Database.parola);
            System.out.println("Bağlantı Başarılı.");
            
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız.");
        }
                       
    }
    
    
    
}
