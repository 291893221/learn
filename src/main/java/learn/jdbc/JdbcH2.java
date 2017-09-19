package learn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcH2 {
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		Statement createStatement = null;
		ResultSet executeQuery = null;
		try {
			connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			createStatement = connection.createStatement();
			executeQuery = createStatement.executeQuery("select * from test");
			while (executeQuery.next()) {
				String f1 = executeQuery.getString(1);
				String f2 = executeQuery.getString(2);
				System.out.println(f1 + "\t" + f2);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.close();
			}
			if (createStatement != null) {
				createStatement.close();
			}
			if (executeQuery != null) {
				executeQuery.close();
			}
		}
	}
}
