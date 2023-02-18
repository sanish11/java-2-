/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.sql.*;


public class P3Q2 {
    static PreparedStatement pstmt = null;
    static Connection con;

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/job";
        con = DriverManager.getConnection(url, "root", "");
        createTable();
        insertintoDatabase(1,"webDeveloper",30000,"programming");
        getFromDatabase();
        con.close();
    }
      private static void createTable() throws Exception {
        String sql = "CREATE TABLE jobs (job_id int,job_title "
                + "varchar(30),salary int,department varchar(30))";
        
        
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

    private static void insertintoDatabase(int job_id, String job_title,
            int salary, String department) throws Exception {
        String query = "INSERT INTO jobs VALUES (?,?,?,?)";
        pstmt = con.prepareStatement(query);
        pstmt.setInt(1, job_id);
        pstmt.setString(2, job_title);
        pstmt.setInt(3,salary);
        pstmt.setString(4, department);
        int result = pstmt.executeUpdate();
        if (result != -1) {
            System.out.println("Inserted successfully");
        } else {
            System.out.println("Fail to insert");
        }
        pstmt.close();

    }

    private static void getFromDatabase() throws Exception {
        String sql = "SELECT * FROM jobs";
        if (con != null) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int job_id = rs.getInt(1);
                String job_title = rs.getString(2);
                int salary=rs.getInt(3);
                String department = rs.getString(4);
                System.out.println("job_id: " + job_id + " ,job_title: " 
                        + job_title + " ,salary: "+salary+
                        " ,department: " + department);
            }// End of While            
        } else {
            System.out.println("Unable to get the connection");
        }
    }
}
