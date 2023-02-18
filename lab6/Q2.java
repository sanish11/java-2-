package lab6;
import java.sql.*;

public class Q2 {
    public static void main(String[] args) throws Exception{
        String sql="INSERT INTO user VALUES (1,'rohit','21','9800000000','paknajol')";
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/db_test";
        Connection con=DriverManager.getConnection(url, "root","");
        if(con!=null){
            Statement stmt=con.createStatement();
            int result=stmt.executeUpdate(sql);
            if(result!=-1){
               System.out.println("Data inserted successfully");
                    
            }else{
                System.out.println("Data not inserted");
            }
            stmt.close();
            con.close();
        }else{
            System.out.println("Unabale to get connection");
        }
    }
}
