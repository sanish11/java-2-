/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.sql.*;

public class P3Q3 {

    static PreparedStatement pstmt = null;
    static Connection con;
    static Statement stmt = null;
    static ResultSet rs = null;

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/college";
        con = DriverManager.getConnection(url, "root", "");
        createTable();
        
        insertintoDatabase(1, "Sam", "Kathmandu", "male", "BCIS");
        getFromDatabase();
        UpdateData();
        getFromDatabase();
        DeleteData();
        getFromDatabase();
        con.close();
    }

     private static void createTable() throws Exception {
        String sql = "CREATE TABLE Student (s_id int,name varchar(30),"
                + "address varchar(30),gender varchar(6),"
                + "program varchar(30))";
        if (con != null) {
            Statement stmt = con.createStatement();
            int result = stmt.executeUpdate(sql);
            if (result != -1) {
                System.out.println("Table created successfully");

            } else {
                System.out.println("Table not created");
            }
            stmt.close();
        } else {
            System.out.println("Unabale to get connection");
        }
    }


    private static void insertintoDatabase(int s_id, String name, 
            String address, String gender, String program) throws Exception {
        String query = "INSERT INTO Student VALUES (" + s_id + ",'" 
                + name + "','" + address + "','" + gender + "','" + program + "')";
        if (con != null) {
            Statement stmt = con.createStatement();
            int result = stmt.executeUpdate(query);
            if (result != -1) {
                System.out.println("Record inserted successfully");
            } else {
                System.out.println("Unable to insert record. Please check your SQL syntax");
            }
            stmt.close();
        } else {
            System.out.println("Unable to get the connection");
        }

    }

    private static void getFromDatabase() throws Exception {
        String sql = "SELECT * FROM Student";
        if (con != null) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int s_id = rs.getInt(1);
                String name = rs.getString(2);
                String address = rs.getString(3);
                String gender = rs.getString(4);
                String program = rs.getString(5);
                System.out.println("s_id: " + s_id + " ,name: " 
                        + name + " ,address: " + address
                        + " ,gender: " + gender + " ,program" + program);
            }// End of While            
        } else {
            System.out.println("Unable to get the connection");
        }
    }

    private static void UpdateData() throws Exception {
        String sql = "UPDATE Student SET program = 'BBA' where program='BCIS'";
        if (con != null) {
            stmt = con.createStatement();
            int result = stmt.executeUpdate(sql);
            if (result != -1) {
                System.out.println("Update record Successfully");
            } else {
                System.out.println("Failed to update record ");
            }
        } else {
            System.out.println("Unable to get the connection");
        }
    }

    private static void DeleteData() throws Exception {
        String sql = "DELETE FROM Student where s_id='1'";
        if (con != null) {
            stmt = con.createStatement();
            int result = stmt.executeUpdate(sql);
            if (result != -1) {
                System.out.println("deleted");
            } else {
                System.out.println("Failed to Delete record ");
            }

        } else {
            System.out.println("Unable to get the connection");
        }
    }

}
