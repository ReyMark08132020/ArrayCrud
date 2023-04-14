/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recordlist;
import static com.mycompany.recordlist.createRecord.Record;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author zulta
 */
public class updateRecord {
    public static void updateRecord(ArrayList<Record> records) {
    
        // Initialize the Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.print("Enter Code want to update:\t ");
        
        int code = Integer.parseInt(input.nextLine());
        System.out.println("--------------------------------------------------");
        System.out.print("Enter name:\t\t ");
        String name = input.nextLine();
        System.out.println("--------------------------------------------------");
        System.out.print("Enter peripheral:\t ");
        String peripheral = input.nextLine();
        System.out.println("--------------------------------------------------");
        System.out.print("Enter quantity:\t\t ");
        int quantity = Integer.parseInt(input.nextLine());
        System.out.println("--------------------------------------------------");
        System.out.print("Enter assigned to:\t ");
        String assignedTo = input.nextLine();
        System.out.println("--------------------------------------------------");
        
        for (Record record : records) {
            if (record.getCode() == code) {
                record.setName(name);
                record.setPeripheral(peripheral);
                record.setQuantity(quantity);
                record.setAssignedTo(assignedTo);
                System.out.println("--------------------------------------------------");
                System.out.println("\tUpdate Record Successful ");
                System.out.println("--------------------------------------------------");
            }
        }
    }
}   
