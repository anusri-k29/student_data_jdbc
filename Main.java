/*
Name: Anusri Kadam
PRN: 23070126016
Batch: SY AIML A1
*/
//Main.java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Student Database Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search by PRN");
            System.out.println("4. Search by Name");
            System.out.println("5. Update Student");
            System.out.println("6. Delete Student");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scan.nextLine());

            switch (choice) {
                case 1 -> StudentOperations.insertStudent();
                case 2 -> StudentOperations.displayAllStudents();
                case 3 -> StudentOperations.searchByPRN();
                case 4 -> StudentOperations.searchByName();
                case 5 -> StudentOperations.updateStudent();
                case 6 -> StudentOperations.deleteStudent();
                case 7 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 7);

        scan.close();
    }
}
