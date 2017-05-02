
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InitializeDB {

    Connection con;
    Statement stmt;

    public static void main(String args[]) {
        d2 d = new d2();
        d.insert();
        d.insert();
    }
}

class d2 {

    Connection con;
    Statement stmt;
    ResultSet rs;

    d2() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");

            con = DriverManager.getConnection("jdbc:derby://localhost:1527/HDDB", "app", "app");
            stmt = con.createStatement();
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (Exception e) {

        }
    }

    public void insert() {
        try {
            rs = stmt.executeQuery("SELECT * FROM APP.TICKET");
            total();
            displayTickets();
            
            String insert = "INSERT INTO APP.TICKET (ID,NAME,PHONE,TAG,DATE,PROBLEM,NOTES,STATUS) VALUES (" + (total() + 1) + ",'Justin','4678954567','11256',' Tuesday May 02 12:00:00',' HELP PLEASE!!',' Cant find PC power switch','NEW')";

            stmt.executeUpdate(insert);
            rs = stmt.executeQuery("SELECT * FROM APP.TICKET");
            total();
            displayTickets();
            rs = stmt.executeQuery("SELECT * FROM APP.TICKET");
            total();
        } catch (Exception e) {

        }
    }

    public int total() {
        int rows = 0;

        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM APP.TICKET");
            while (rs.next()) {
                rows++;
            }

        } catch (Exception e) {
        }

        return rows;
    }

    public String displayTickets() {
        String p = " ";
        try {

            rs = stmt.executeQuery("SELECT * FROM APP.TICKET");
            p = loopDBInfo(rs);

        } catch (Exception e) {

        }
        return p;

    }

    public String loopDBInfo(ResultSet rs) {
        String p = "";
        try {
            while (rs.next()) {
                int id_col = rs.getInt("ID");
                String first_name = rs.getString("NAME");
                String phone = rs.getString("PHONE");
                String date = rs.getString("DATE");
                String status = rs.getString("STATUS");
                String prob = rs.getString("PROBLEM");

                p = p + (id_col + " " + first_name + " " + phone + " " + date + " " + status + " " + prob + "\n");

            }
        } catch (Exception e) {

        }
        return p;
    }
}
