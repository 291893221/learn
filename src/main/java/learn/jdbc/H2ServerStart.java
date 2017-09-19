package learn.jdbc;

import java.sql.SQLException;

import org.h2.tools.Server;

public class H2ServerStart {
	public static void main(String[] args) throws SQLException {
		Server server = Server.createTcpServer(args).start();
	}
}
