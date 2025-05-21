import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class DBConnectMySQL {
    private Statement stmt;
    public DBConnectMySQL(){
 
    final String DB_HOST = "jdbc:mysql://localhost/ua_s2025";
	final String DB_USER = "root";
	final String DB_PWD = "";
	try {
        	Connection con = DriverManager.getConnection(DB_HOST, DB_USER, DB_PWD);
         	stmt = con.createStatement(
				ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_READ_ONLY);
	} catch (SQLException e) {
		e.printStackTrace();
	}
    }
    public Statement getStatement(){
        return this.stmt;
    }
}