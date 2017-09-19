package learn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectH2 {
	public static void main(String[] a) throws Exception {
		Class.forName("org.h2.Driver");
		Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		conn.close();
	}
}
