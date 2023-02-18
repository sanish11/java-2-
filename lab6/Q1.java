/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.sql.*;
public class Q1 {
    public static void main(String[] args) throws Exception{
        String sql="CREATE TABLE user (id int,name varchar(30),"
                + "age int,phone_number varchar(10),address varchar(30))";
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/db_test";
        Connection con=DriverManager.getConnection(url, "root","");
        if(con!=null){
            Statement stmt=con.createStatement();
            int result=stmt.executeUpdate(sql);
            if(result!=-1){
               System.out.println("Table created successfully");
                    
            }else{
                System.out.println("Table not created");
            }
            stmt.close();
            con.close();
        }else{
            System.out.println("Unabale to get connection");
        }
    }
}
