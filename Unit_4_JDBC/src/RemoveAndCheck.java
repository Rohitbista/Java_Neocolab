import java.util.Scanner;
import java.sql.*;

public class RemoveAndCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String dept = sc.nextLine();
        double cgpa = sc.nextDouble();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ri_db", "test", "test123");
            PreparedStatement ps = conn.prepareStatement("delete from student where dept = ? and cgpa > ?");
            ps.setString(1, dept);
            ps.setDouble(2, cgpa);
            ps.execute();
            ResultSet rs = ps.executeQuery("select * from student");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9));
            }
            ps.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
