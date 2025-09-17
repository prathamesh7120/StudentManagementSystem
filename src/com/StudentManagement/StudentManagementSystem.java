package com.StudentManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n====== Student Management System ======");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // 

            switch (choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    students.add(name);
                    System.out.println("✅ Student added successfully!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No Students Found.");
                    } else {
                        System.out.println("📋 Student List:");
                        for (int i = 0; i < students.size(); i++) {
                            System.out.println((i + 1) + ". " + students.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter student name to search: ");
                    String searchName = sc.nextLine();
                    if (students.contains(searchName)) {
                        System.out.println("✅ Student found: " + searchName);
                    } else {
                        System.out.println("❌ Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter student name to remove: ");
                    String studentName = sc.nextLine();
                    boolean removed = students.remove(studentName);
                    if (removed) {
                        System.out.println("✅ Student removed successfully!");
                    } else {
                        System.out.println("❌ Student not found.");
                    }
                    break;

                case 5:
                    System.out.println("👋 Exiting...");
                    break;

                default:
                    System.out.println("⚠️ Invalid choice, please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
