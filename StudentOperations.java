import java.sql.*;
import java.util.Scanner;

public class StudentOperations {
    private static final String URL = "jdbc:mysql://localhost:3306/db_student";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";


    // Insert new student
    public static void insertStudent() {
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement stmt = con.prepareStatement("INSERT INTO student (PRN, Name, Branch, Batch, CGPA) VALUES (?, ?, ?, ?, ?)");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the PRN:");
            int prn = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter the Name:");
            String name = scanner.nextLine();

            System.out.println("Enter the Branch:");
            String branch = scanner.nextLine();

            System.out.println("Enter the Batch:");
            String batch = scanner.nextLine();

            System.out.println("Enter the CGPA:");
            float cgpa = scanner.nextFloat();

            stmt.setInt(1, prn);
            stmt.setString(2, name);
            stmt.setString(3, branch);
            stmt.setString(4, batch);
            stmt.setFloat(5, cgpa);

            int rowsInserted = stmt.executeUpdate();
            System.out.println(rowsInserted > 0 ? "Student record inserted." : "Insert failed.");

            stmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }
    // Display all students
    public static void displayAllStudents() {
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            System.out.println("\n---- Student Records ----");
            while (rs.next()) {
                System.out.println("PRN: " + rs.getInt("PRN") + ", Name: " + rs.getString("Name") +
                        ", Branch: " + rs.getString("Branch") + ", Batch: " + rs.getString("Batch") +
                        ", CGPA: " + rs.getFloat("CGPA"));
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }
    // Search student by PRN
    public static void searchByPRN() {
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter PRN to search: ");
            int prn = scanner.nextInt();

            PreparedStatement stmt = con.prepareStatement("SELECT * FROM student WHERE PRN = ?");
            stmt.setInt(1, prn);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                System.out.println("Found: Name = " + rs.getString("Name") +
                        ", Branch = " + rs.getString("Branch") +
                        ", Batch = " + rs.getString("Batch") +
                        ", CGPA = " + rs.getFloat("CGPA"));
            } else {
                System.out.println(" No student found with PRN: " + prn);
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }
    
    // Search student by Name
    public static void searchByName() {
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter Name to search: ");
            String name = scanner.nextLine();

            PreparedStatement stmt = con.prepareStatement("SELECT * FROM student WHERE Name LIKE ?");
            stmt.setString(1, "%" + name + "%");

            ResultSet rs = stmt.executeQuery();

            boolean found = false;
            while (rs.next()) {
                found = true;
                System.out.println("PRN: " + rs.getInt("PRN") + ", Branch: " + rs.getString("Branch") +
                        ", Batch: " + rs.getString("Batch") + ", CGPA: " + rs.getFloat("CGPA"));
            }

            if (!found) {
                System.out.println(" No student found with name: " + name);
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }
    
