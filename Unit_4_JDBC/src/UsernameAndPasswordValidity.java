import java.util.Scanner;
import java.sql.*;

public class UsernameAndPasswordValidity {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        String pwd = sc.nextLine();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ri_db", "test", "test123");
            PreparedStatement ps = conn.prepareStatement("select * from userdetails where user_name = ?");
            ps.setString(1, user);
            ResultSet rs = ps.executeQuery();
            rs.next();
            if(rs.getString(2).equals(pwd)){
                System.out.println("Login Successful");
            }else{
                System.out.println("Invalid username/password");
            }
            conn.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
