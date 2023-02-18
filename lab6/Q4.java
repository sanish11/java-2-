/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.sql.*;

public class Q4 {

    public static void main(String[] args) throws Exception {
        readData();
    }

    public static void readData() throws Exception {
        String sql = "SELECT * FROM user";
        // Get the connection using our utils.     
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/db_test";
        Connection con = DriverManager.getConnection(url, "root", "");
        if (con != null) {
// Create statement from connection       
            Statement stmt = con.createStatement();
// Execute the statement by passing the sql.      
            ResultSet rs = stmt.executeQuery(sql);
// Iterate over all the returned records       
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
