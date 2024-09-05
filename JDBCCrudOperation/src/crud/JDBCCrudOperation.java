package crud;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCCrudOperation {
	public static void addEmplyee() throws SQLException {
		Connection con = JDBCUtil.getConnection();
		Statement stmt = con.createStatement();
		String sqlinsert = "INSERT into Employee('id','name','salary','bonus')"+"values(1,'rhini',100,100)";
		int status = stmt.executeUpdate(sqlinsert);
		if (status==1) {
			System.out.println("creation is successful");
		}
	}
}
