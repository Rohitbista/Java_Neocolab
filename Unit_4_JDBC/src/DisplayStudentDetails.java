import java.sql.*;
import java.util.Scanner;

public class DisplayStudentDetails {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ri_db", "test", "test123");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from student where dept = \""+s1+"\"");
            while(rs.next()){
                System.out.println(rs.getInt("id")+" "+rs.getString("name"));
            }
            conn.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
