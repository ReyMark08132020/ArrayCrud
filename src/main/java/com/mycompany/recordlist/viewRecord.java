/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recordlist;
import static com.mycompany.recordlist.RecordList.printMenu;
import static com.mycompany.recordlist.createRecord.Record;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author zulta
 */
public class viewRecord {
   public static void viewRecord(ArrayList<Record> records) {
       Scanner input = new Scanner(System.in);
        System.out.println("------------------------------------------");
        System.out.println("\tSelect the view option");
        System.out.println("------------------------------------------");
        System.out.println("1. Peripheral Record");
        System.out.println("2. Available Record");
        System.out.println("3. Assigned Peripherals");
        System.out.println("4. Input Devices");
        System.out.println("5. Output Devices");
        System.out.println("6. Input/Output Devices");
        System.out.println("7. Back");
        System.out.println("--------------------------------");
        System.out.print("Please choose a Number: ");
        int viewOption = Integer.parseInt(input.nextLine());
         switch (viewOption) {
        case 1:
            for(Record record : records) {
            System.out.println("--------------------------------");
            System.out.println("\tPeripheral Record");
            System.out.println("--------------------------------");
            System.out.println("Code: " + record.getCode());
            System.out.println("Name: " + record.getName());
            System.out.println("Peripheral: " + record.getPeripheral());
            System.out.println("Quantity: " + record.getQuantity());
            System.out.println("Assigned To: " + record.getAssignedTo());
            System.out.println();
            System.out.println("--------------------------------");
            }break;
        case 2:
                for(Record record : records){
                System.out.println("--------------------------------");
                System.out.println("\tAvailable Record: ");
                System.out.println("--------------------------------");
                if (record.getAssignedTo().equals("None")) {
                    System.out.println("Code: " + record.getCode());
                    System.out.println("Name: " + record.getName());
                    System.out.println("Peripheral: " + record.getPeripheral());
                    System.out.println("Quantity: " + record.getQuantity());    
                    System.out.println("Assigned To: " + record.getAssignedTo());
                    System.out.println("--------------------------------");
                }
                } break;
        case 3:
               for(Record record : records){
                  
                if (!record.getAssignedTo().equals("None")) {
                    System.out.println("--------------------------------");
                    System.out.println("\tAssigned Peripherals ");
                    System.out.println("--------------------------------");
                    System.out.println("Code: " + record.getCode());
                    System.out.println("Name: " + record.getName());
                    System.out.println("Peripheral: " + record.getPeripheral());
                    System.out.println("Quantity: " + record.getQuantity());    
                    System.out.println("Assigned To: " + record.getAssignedTo());
                    System.out.println("--------------------------------");
                }
                
               } break;
        case 4:
                for(Record record : records){ 
                System.out.println("--------------------------------");
                System.out.println("\tInput Devices ");
                if (record.getPeripheral().equals("Input Device")) {
                    System.out.println("--------------------------------");
                    System.out.println("Code: " + record.getCode());
                    System.out.println("Name: " + record.getName());
                    System.out.println("Peripheral: " + record.getPeripheral());
                    System.out.println("Quantity: " + record.getQuantity());    
                    System.out.println("Assigned To: " + record.getAssignedTo());
                    System.out.println("--------------------------------");
                }
               
                } break;
        case 5:
                for(Record record : records){  
                System.out.println("--------------------------------");
                System.out.println("\tOutput Devices: ");
                System.out.println("--------------------------------");
                if (record.getPeripheral().equals("Output Device")) {
                    System.out.println("Code: " + record.getCode());
                    System.out.println("Name: " + record.getName());
                    System.out.println("Peripheral: " + record.getPeripheral());
                    System.out.println("Quantity: " + record.getQuantity());    
                    System.out.println("Assigned To: " + record.getAssignedTo());
                    System.out.println("--------------------------------");
                }
                } break;
        case 6:
                for(Record record : records){  
                System.out.println("--------------------------------");
                System.out.println("\tInput/Output Devices ");
                System.out.println("--------------------------------");
                if (record.getPeripheral().equals("Input and Output Device")) {
                    System.out.println("Code: " + record.getCode());
                    System.out.println("Name: " + record.getName());
                    System.out.println("Peripheral: " + record.getPeripheral());
                    System.out.println("Quantity: " + record.getQuantity());    
                    System.out.println("Assigned To: " + record.getAssignedTo());
                    System.out.println("--------------------------------");
                }
                break;
                }
        case 7:
                printMenu();
                break;default:
                            System.out.println("--------------------------------");
                            System.out.println("Invalid option!");
                            System.out.println("--------------------------------");
        }
    }
}
