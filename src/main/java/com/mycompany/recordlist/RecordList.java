/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recordlist;
import static com.mycompany.recordlist.createRecord.Record.createRecord;
import java.util.*;
import static com.mycompany.recordlist.generateReport.generateReport;
import static com.mycompany.recordlist.updateRecord.updateRecord;
import static com.mycompany.recordlist.deleteRecord.deleteRecord;
import static com.mycompany.recordlist.viewRecord.viewRecord;



/**
 *
 * @author zulta
 */
public class RecordList {
  


    public static void main(String[] args) {
        
    
    do{ // Initialize the Scanner
        Scanner input = new Scanner(System.in);
 
        // Create an ArrayList to store the records
        ArrayList records = new ArrayList<>();
 
        // Set a flag to control the while loop
        boolean flag = true;
 
        // Main Loop
        while(flag) {
            // Print the Menu
            printMenu();
 
            // Read the user input
            int option = input.nextInt();
            input.nextLine();
 
            // Switch on the option
            switch(option) {
                case 1:
                    // Create a Record
                    createRecord(records);
                    break;
                case 2:
                    // Read a Record
                    viewRecord(records);
                    break;
                case 3:
                    // Update a Record
                    updateRecord(records);
                    break;
                case 4:
                    // Delete a Record
                    deleteRecord(records);
                    break;
                case 5:
                    // Generate a Report
                    generateReport(records);
                    break;
                case 6:
                    // Exit the program
                    flag = false;
                    break;
            }
        }
    }while(true);
    }
   
    public static void printMenu() {
     final String Red = "\u001b[31m";
 
        System.out.println("--------------------------------");
        System.out.println("\tWELCOME"+Red);
        System.out.println("--------------------------------");
        System.out.println("1. Create a Record  ");
        System.out.println("2. View a Record   ");
        System.out.println("3. Update a Record  ");
        System.out.println("4. Delete a Record  ");
        System.out.println("5. Generate a Report");
        System.out.println("6. Exit Program");
        System.out.println("--------------------------------");
        System.out.print("Please choose a Number: ");
        
    }
}
