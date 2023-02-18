/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.sql.*;


/**
 *
 * @author nccs
 */
public class P2Q2 {
     static Connection con;
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/db_test";
        con=DriverManager.getConnection(url, "root","");
        insertintoDatabase(2,"shyam",21,"9700000000","nayabazar");
        getFromDatabase();
        con.close();
    }
    private static void insertintoDatabase(int id,String name,int age,
            String phone_number,String address) throws Exception{
        String sql="INSERT INTO user VALUES ("+id+",'"+name+"',"
                +age+",'"+phone_number+"','"+address+"')";
       
        if(con!=null){
            Statement stmt=con.createStatement();
            int result=stmt.executeUpdate(sql);
            if(result!=-1){
               System.out.println("Data inserted successfully");
                    
            }else{
                System.out.println("Data not inserted");
            }
            stmt.close();
        }else{
            System.out.println("Unabale to get connection");
        }
    }
    private static void getFromDatabase() throws Exception{
        String sql = "SELECT * FROM user";
        if (con != null) {  
            Statement stmt = con.createStatement();     
            ResultSet rs = stmt.executeQuery(sql);     
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int age = rs.getInt(3);
                String phone_number = rs.getString(4);
                String address = rs.getString(5);
                System.out.println("id: "+id + " ,name: " + name + " ,age: " 
                        + age + " ,phone_number: " + 
                        phone_number + " ,address: " + address);
            }// End of While            
        } else {
            System.out.println("Unable to get the connection");
        }
    }
}
