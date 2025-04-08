import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DBInsert {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your id and name");
		int id=scanner.nextInt();
		String name=scanner.next();		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root","root");
			Statement statement=connection.createStatement();
			String query="insert into user values('"+id+"','"+name+"')";
			statement.executeUpdate(query);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}