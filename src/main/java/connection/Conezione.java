package connection;

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conezione {
	public static Connection conetar() {
		
		
		try {
			Connection cd = DriverManager.getConnection("jdbc:mysql://localhost/gestionare?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "martinez230");
			
			return cd;
		} catch (SQLException e) {
			System.err.println("Errore nella conezione alla DB " + e );
		}
		return null;
	}

}
