import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseUtil {

	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(null/*new com.microsoft.jdbc.sqlserver.SQLServerDriver()*/);//jdbc driver
		String url="jdbc:microsoft:sqlserver://psdbs01\\psdbs01A:1717;DatabaseName=ARROW_0_4_5_0";
		Connection con = DriverManager.getConnection(url,"arrow_sqa","arrow_sqa");// Connection
		
		String query = "select case_id,workitemid,userid from workbasket where case_id=?";
		PreparedStatement prepState = con.prepareStatement(query);
		ResultSet rstSet= prepState.executeQuery();
		while (rstSet.next()) {
			String s1 = rstSet.getString("case_id");
			if (s1.equalsIgnoreCase("Pranav")) {
				System.out.println("correct result is stored in database");
			}
			
		}
		rstSet.close();
		prepState.close();
		con.close();
	}

}
