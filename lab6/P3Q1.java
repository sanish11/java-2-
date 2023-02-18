package lab6;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class P3Q1 implements ActionListener {

    static JFrame f, f1;
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1;
    static PreparedStatement pstmt = null;
    static Connection con;

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/countries";
        con = DriverManager.getConnection(url, "root", "");
        new P3Q1();

    }

    P3Q1() {
        f = new JFrame();
        f1 = new JFrame();
        l1 = new JLabel("Country_id");
        l2 = new JLabel("country_name");
        l3 = new JLabel("continent");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        b1 = new JButton("Submit");
        b1.addActionListener(this);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(b1);
        f.setLayout(new GridLayout(4, 2));

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 300);
        f1.setSize(300, 300);
        f.setVisible(true);

    }

    private static void createTable() throws Exception {
        String sql = "CREATE TABLE countries (country_id int,"
                + "country_name varchar(30),continent varchar(30))";
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

    private static void insertintoDatabase(int country_id, 
            String country_name, String continent) throws Exception {
        String query = "INSERT INTO countries VALUES (?,?,?)";
        pstmt = con.prepareStatement(query);
        pstmt.setInt(1, country_id);
        pstmt.setString(2, country_name);
        pstmt.setString(3, continent);
        int result = pstmt.executeUpdate();
        if (result != -1) {
            System.out.println("Inserted successfully");
        } else {
            System.out.println("Fail to insert");
        }
        pstmt.close();

    }

    private static void getFromDatabase() throws Exception {
        String sql = "SELECT * FROM countries";
        String colhead[] = {"country_id", "country_name", "continent"};
        String data[][] = new String[10][3];
        int i = 0;
        if (con != null) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int country_id = rs.getInt(1);
                String country_name = rs.getString(2);
                String continent = rs.getString(3);
                data[i][0] = country_id + "";
                data[i][1] = country_name;
                data[i][2] = continent;
                i++;
//                System.out.println("country_id: " + country_id + " ,country_name: " + country_name + 
//                        " ,continent: " + continent);
            }
            JTable table = new JTable(data, colhead);
            JScrollPane pane = new JScrollPane(table);
            f1.add(pane);
            f1.setVisible(true);// End of While            
        } else {
            System.out.println("Unable to get the connection");
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae){
        try {
            createTable();
            int country_id = Integer.parseInt(t1.getText());
            String country_name = t2.getText();
            String continent = t3.getText();
            insertintoDatabase(country_id, country_name, continent);
            getFromDatabase();
            con.close();
        } catch (Exception ex) {
            System.out.println("Operation Failed");
        }
    }
}
