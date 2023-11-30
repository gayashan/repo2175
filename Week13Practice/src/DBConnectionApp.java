// import java.sql.*;

public class DBConnectionApp {

	public static void main(String[] args) {
//		Connection connection = null;
//		Statement statement = null;
//		ResultSet resultSet = null;
//		try {
//			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
//		} catch (ClassNotFoundException cnfex) {
//			System.out.println("Problem in loading or " +
//					"registering MS Access JDBC driver");
//			cnfex.printStackTrace();
//		}
//		
//		try {
//			String msAccDB = "C:/Temp/week12/Employee.accdb";
//			String dbURL = "jdbc:ucanaccess://" +
//			msAccDB;
//			
//			connection = DriverManager.getConnection(dbURL);
//			
//			statement = connection.createStatement();
//			
//			resultSet = statement.executeQuery("SELECT * FROM EMP");
//			while (resultSet.next()) {
//				int id = resultSet.getInt(1);
//				String name = resultSet.getString(2);
//				Double salary = resultSet.getDouble(3);
//				System.out.println("Employee #" + id +
//						": " + name + ", " + salary);
//			} catch (SQLException sqlex) {
//				sqlex.printStackTrace();
//			} finally {
//				try {
//					if (connection != null) {
//						resultSet.close();
//						statement.close();
//						
//						connection.close();
//					}
//				} catch(SQLException sqlex) {
//					sqlex.printStackTrace();
//				}
//			}
//		
//			String insertSQL = "INSERT INTO EMP (NAME, SALARY) " + "VALUES ('SIMON LI', 90000)";
//			statement.executeUpdate(insertSQL);
//			
//			String updateSQL = "UPDATE EMP SET SALARY = 120000 " + "WHERE NAME='SIMON LI'";
//			statement.executeUpdate(updateSQL);
//			
//			String deleteSQL = "DELETE FROM EMP WHERE EName = 'Kim'";
//			statement.executeUpdate(deleteSQL);
		}
	}
