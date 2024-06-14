import java.util.Scanner;
import java.sql.*;

public class StallMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ri_db", "test", "test123");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Stall");
            rs.absolute(a);
            System.out.printf("%-10s%-10s%-10s\n", "ID", "Name", "Deposit");
            System.out.printf("%-10s%-10s%-10s", rs.getInt("id"), rs.getString("name"), rs.getDouble("deposit"));
            conn.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
