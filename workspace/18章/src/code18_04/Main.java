package code18_04;
import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

	public static void main(String[] args) throws Exception{
		Class.forName("org.h2.Driver");
		String dburl = "jdbc:h2:~/test";
		String sql = "INSERT INTO EXPLOYEES(name) VALUES('aoki')";

		Connection conn = DriverManager.getConnection(dburl);
		conn.createStatement().executeUpdate(sql);
		conn.close();
	}

}
