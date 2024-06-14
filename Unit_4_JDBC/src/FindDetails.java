import java.util.Scanner;
import java.sql.*;

public class FindDetails {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            String gender = sc.nextLine();
            String dept = sc.nextLine();
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ri_db", "test", "test123");
            PreparedStatement ps = conn.prepareStatement("select * from employee where gender = ? and dept = ?");
            ps.setString(1, gender);
            ps.setString(2, dept);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("Employee ID : "+rs.getInt(1)+" Name : "+rs.getString(3)+" "+rs.getString(4));
            }
            conn.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
