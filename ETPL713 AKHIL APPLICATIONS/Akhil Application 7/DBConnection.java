package Application9;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
	public static Connection getConnection() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection  conn = DriverManager.getConnection(
				  "jdbc:mysql://localhost:3306/evergentdb",
				  "root",
				  "admin"); 
		return conn;
	}
}
