
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InitializeDB {
    Connection con;
    Statement stmt;
    /**
     *
     * @param args
     */
    public static void main(String args[]){
    d2 d = new d2();
    d.insert();
    d.insert();
         } 
   } 


class d2 {
    
    Connection con;
    Statement stmt;
    ResultSet rs;
   d2(){
     try{Class.forName("org.apache.derby.jdbc.ClientDriver");
            
             con = DriverManager.getConnection("jdbc:derby://localhost:1527/HDDB", "app", "app");
             stmt = con.createStatement();
            Class.forName("org.apache.derby.jdbc.ClientDriver");}
         catch (Exception e){
             System.out.println("problem " + e);
         } 
   }
   
    public void insert(){try {
         rs = stmt.executeQuery("SELECT * FROM APP.TICKET");
           total();    
       displayAllTickets();
            System.out.println("----------------------------------------------");
            System.out.println("Number of tickets? " + (total()+1));
            String insert ="INSERT INTO APP.TICKET (ID,NAME,PHONE,TAG,DATE,PROBLEM,NOTES,STATUS) VALUES ("+(total()+1)+",'hello','33333','hello',' Wed Jan 08 12:12:05',' hello',' hello','NEW')";
           
            System.out.println(insert);
            
          stmt.executeUpdate(insert);
  rs = stmt.executeQuery("SELECT * FROM APP.TICKET");
           total();
         displayAllTickets();
           rs = stmt.executeQuery("SELECT * FROM APP.TICKET");
           total();
        } catch (Exception e) {
            System.out.println("SQL problem " + e);
        }}
  
    /**
     *
     * @return
     */
    public int total(){
        int rows = 0;
       
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery             
         ("SELECT * FROM APP.TICKET");
          while (rs.next()) {rows++;}
         System.out.println("There are "+ rows + " record in the table"); 
        
        } catch (Exception e) {}
    
    return rows;
      }
    /**
     *
     * @return
     */
    public String displayAllTickets(){
  String p = " ";
   try {
      
            rs = stmt.executeQuery             
         ("SELECT * FROM APP.TICKET");
          p = loopDBInfo(rs);
          System.out.println(p);
        } catch (Exception e) {
            System.out.println("SQL problem " + e);
        } 
  return p;
  
  }
   
    /**
     *
     * @param rs
     * @return
     */
    public String loopDBInfo(ResultSet rs){
      String p = "";
      try{
      while (rs.next()) {
        int id_col = rs.getInt("ID");
        String first_name = rs.getString("NAME");
        String phone = rs.getString("PHONE");
        String date = rs.getString("DATE");
        String status = rs.getString("STATUS");
        String prob = rs.getString("PROBLEM");
       
        
         p = p + (id_col + " " + first_name + " " + phone + " "+ date + " "+ status + " "+ prob + "\n");        
           // System.out.println(p);
        }
      } catch (Exception e) {
            System.out.println("SQL problem " + e);
 
  } return p;
  }//end loopDBInfo
   }



