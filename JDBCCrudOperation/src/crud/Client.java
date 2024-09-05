package crud;

import java.sql.Connection;
import java.sql.SQLException;

public class Client {
	public static void main(String[] args) throws SQLException {
		Connection con = JDBCUtil.getConnection();
		if(con!=null) {
			System.out.println("connection established");
		}
		JDBCCrudOperation.addEmplyee();
	}
}
