
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class database {

    Connection con;
    Statement stmt;
    ResultSet rs;
    ResultSet viewrs;
    Statement viewstmt;
    ResultSet rowrs;
    Statement rowstmt;
    ResultSet emprs;
    Statement empstmt;
    ArrayList tickets = new ArrayList();
    phonecallTicket currentticket;

    /**
     *
     */
    public enum Status {
        /**
         *
         */
        NEW,
        /**
         *
         */
        IN_PROGRESS,
        /**
         *
         */
        ON_HOLD,
        /**
         *
         */
        COMPLETED
    }

    database() {

        try {

            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/HDDB;create=true", "app", "app");
            stmt = con.createStatement();
            Class.forName("org.apache.derby.jdbc.ClientDriver");

            this.viewstmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            this.viewrs = viewstmt.executeQuery("SELECT * FROM APP.TICKET ORDER BY ID");
            this.viewrs.beforeFirst();
            this.viewrs.next();

            this.rowstmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            this.rowrs = rowstmt.executeQuery("SELECT * FROM APP.TICKET ORDER BY ID");
            this.rowrs.beforeFirst();
            this.rowrs.next();

            this.empstmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            this.emprs = empstmt.executeQuery("SELECT * FROM APP.EMPLOYEE");
            this.emprs.beforeFirst();
            this.emprs.next();

            currentticket = makeTicket(viewrs.getInt("ID"), viewrs.getString("NAME"),
                    viewrs.getString("PHONE"), viewrs.getString("TAG"),
                    viewrs.getString("DATE"), viewrs.getString("PROBLEM"),
                    viewrs.getString("NOTES"), viewrs.getString("STATUS"));

        } catch (Exception e) {
            System.out.println("SQL constructor problem " + e);
        }

    }

    public phonecallTicket getTicket() {
        return currentticket;
    }

    public phonecallTicket getRow(int row) {

        try {
            if (row > total() || row < 0) {

            } else {
                rowrs.absolute(row);
                int id_col = rowrs.getInt("ID");
                String first_name = rowrs.getString("NAME");
                String phone = rowrs.getString("PHONE");
                String tag = rowrs.getString("TAG");
                String date = rowrs.getString("DATE");
                String prob = rowrs.getString("PROBLEM");
                String notes = rowrs.getString("NOTES");
                String status = rowrs.getString("STATUS");
                currentticket = makeTicket(id_col, first_name, phone, tag, date, prob, notes, status);
            }
        } catch (Exception e) {

        }
        return currentticket;
    }

    public int total() {
        int rows = 0;

        try {
            rs = stmt.executeQuery("SELECT * FROM APP.TICKET");
            while (rs.next()) {
                rows++;
            }

        } catch (Exception e) {
        }

        return rows;
    }

    public void updateViewRs() {
        try {
            this.viewrs = viewstmt.executeQuery("SELECT * FROM APP.TICKET ORDER BY ID");
        } catch (Exception e) {

        }
    }

    public void addTicket(phonecallTicket ticket) {
        try {

            String insert = "INSERT INTO APP.TICKET "
                    + "(ID,NAME,PHONE,TAG,DATE,PROBLEM,NOTES,STATUS) "
                    + "VALUES "
                    + "(" + (total() + 1) + ",'"
                    + ticket.who + "','"
                    + ticket.phone + "','"
                    + ticket.tag + "',' "
                    + ticket.date + "',' "
                    + ticket.problem + "',' "
                    + ticket.notes + "','"
                    + "NEW" + "')";

            stmt.executeUpdate(insert);

            rs = stmt.executeQuery("SELECT * FROM APP.TICKET");
            total();
        } catch (Exception e) {
            System.out.println("SQL problem " + e);
        }
        tickets.add(ticket);
    }

    public phonecallTicket makeTicket(int id, String who, String phone, String tag, String date, String problem, String notes, String status) {

        phonecallTicket ticket = new phonecallTicket(id, who, phone, tag, date, problem, notes, status);
        currentticket = ticket;
        return ticket;
    }

    public phonecallTicket nextTicket(phonecallTicket ticket) {

        try {

            if (!viewrs.isLast()) {
                viewrs.next();
                int id_col = viewrs.getInt("ID");
                String first_name = viewrs.getString("NAME");
                String phone = viewrs.getString("PHONE");
                String tag = viewrs.getString("TAG");
                String date = viewrs.getString("DATE");
                String prob = viewrs.getString("PROBLEM");
                String notes = viewrs.getString("NOTES");
                String status = viewrs.getString("STATUS");

                ticket = makeTicket(id_col, first_name, phone, tag, date, prob, notes, status);
            }
        } catch (Exception e) {

        }

        return ticket;

    }

    public phonecallTicket previousTicket(phonecallTicket ticket) {

        try {

            if (!viewrs.isFirst()) {
                viewrs.previous();
                int id_col = viewrs.getInt("ID");
                String first_name = viewrs.getString("NAME");
                String phone = viewrs.getString("PHONE");
                String tag = viewrs.getString("TAG");
                String date = viewrs.getString("DATE");
                String prob = viewrs.getString("PROBLEM");
                String notes = viewrs.getString("NOTES");
                String status = viewrs.getString("STATUS");

                ticket = makeTicket(id_col, first_name, phone, tag, date, prob, notes, status);
            }
        } catch (Exception e) {

        }

        return ticket;

    }

    public String displayAllTickets() {
        String p = " ";
        try {

            rs = stmt.executeQuery("SELECT * FROM APP.TICKET ORDER BY ID");
            p = loopDBInfo(rs);
        } catch (Exception e) {

        }
        return p;

    }

    public String displayNameTickets() {
        String p = " ";
        try {

            rs = stmt.executeQuery("select * from APP.TICKET ORDER BY NAME");
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
                String status = rs.getString("STATUS");
                String prob = rs.getString("PROBLEM");
                String space = "  ";

                p = p + (id_col + "  " + first_name + "   " + phone + "   " + status + "   " + prob + "\n");

            }
        } catch (Exception e) {

        }
        return p;
    }

    public void removeTicket(int num) {
        if (!tickets.isEmpty() && num < tickets.size() && num > 0) {
            tickets.remove(num);
        }
    }

    public void addEmployee(employee emp) {
        try {

            String insert = "INSERT INTO APP.EMPLOYEE (NAME, USERNAME, PASSWORD) VALUES "
                    + "('" + emp.name + "','"
                    + emp.username + "','"
                    + emp.password + "')";

            empstmt.executeUpdate(insert);

            emprs = stmt.executeQuery("SELECT * FROM APP.EMPLOYEE");
            total();
        } catch (Exception e) {

        }

    }

    public void delEmployee(String person) {

        try {
            String delete = "DELETE FROM APP.EMPLOYEE WHERE NAME='" + person + "'";
            stmt.executeUpdate(delete);

        } catch (Exception e) {

        }

    }

    public String displayAllEmployees() {
        String p = " ";

        try {

            emprs = stmt.executeQuery("SELECT * FROM APP.EMPLOYEE");
            p = loopDBEMPInfo(emprs);
            emprs.close();
        } catch (Exception e) {

        }

        return p;
    }

    public String[] getArrayAllEmployees() {

        String[] employees = new String[7];
        try {

            emprs.beforeFirst();
            int i = 0;
            while (emprs.next()) {

                String name = emprs.getString("NAME");
                employees[i] = name;

                i++;
            }
            emprs.close();
        } catch (Exception e) {

        }

        return employees;

    }

    public String loopDBEMPInfo(ResultSet rs) {
        String p = "     USERNAME    |    NAME     \n";

        try {
            while (rs.next()) {

                String username = rs.getString("USERNAME");
                String name = rs.getString("NAME");
                String space = "                           ";

                p = p + ("        " + username + space.substring(0, space.length() - (username.length() * 2)) + name + "\n");

            }
        } catch (Exception e) {

        }
        return p;
    }

    public void updateEmployeeStatus(int ID, int numstatus) {
        try {
            String status = "";

            switch (numstatus) {
                case 0:
                    status = Status.NEW.toString();
                    break;
                case 1:
                    status = Status.IN_PROGRESS.toString();
                    break;
                case 2:
                    status = Status.ON_HOLD.toString();
                    break;
                case 3:
                    status = Status.COMPLETED.toString();
                    break;
                default:
                    status = Status.NEW.toString();
                    break;
            }
            String update = "UPDATE APP.TICKET SET STATUS='" + status + "' WHERE ID=" + ID;

            currentticket.status = status;
            stmt.executeUpdate(update);
        } catch (Exception e) {

        }

    }
}
