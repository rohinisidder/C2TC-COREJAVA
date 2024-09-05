package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
	
	private static final String db_driverclass = "com.mysql.cj.jdbc.Driver";
	private static final String db_username = "root";
	private static final String db_password = "12345678";
	private static final String db_url = "jdbc:mysql//localhost:3306/a03jdbcdb";
	private static Connection con = null;
	static {
		try {
			Class.forName(db_driverclass);
			con = DriverManager.getConnection(db_url,db_username,db_password);
		}
		catch(ClassNotFoundException e){
			System.out.println(e);
		}
		catch(SQLException s) {
			System.out.println(s);
		}
	}
	public static Connection getConnection() {
		return con;
	}
}
