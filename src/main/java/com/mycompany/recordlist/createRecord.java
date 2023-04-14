/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recordlist;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author zulta
 */
public class createRecord {
    public static int currentIndex = 0;
   
    
    public static int generateCode(ArrayList<Record> records) {
        int code;
        // Get the current year
         if (records.isEmpty()) {
            code = 20230000;
        } else {
            //Get the last record in the list
            Record lastRecord = records.get(records.size() - 1);
             code = lastRecord.getCode() + 1;
        }
       
        return code;
    }
public static class Record {
   
 public int code;
    public String name = null;
    public String peripheral = null;
    public int quantity;
    public String assignedTo = null;
   
    
   public Record(int code, String name, String peripheral,int quantity, String assignedTo) {
           
      this.code = code;
       this.name = name;
      this.peripheral = peripheral;
      this.quantity = quantity;
      this.assignedTo = assignedTo;
   }
   public int getCode() {
      return code;
   }
    public void setCode(int code) {
            this.code = code;
        }
   public String getName() {
      return name;
   }
    public void setName(String name) {
            this.name = name;
        }
   public String getPeripheral() {
      return peripheral;
   }
   public void setPeripheral(String peripheral) {
            this.peripheral = peripheral;
        }
   
    public int getQuantity() {
      return quantity;
   }
    public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
   public String getAssignedTo() {
      return assignedTo;
   }
   public void setAssignedTo(String assignedTo) {
            this.assignedTo = assignedTo;
        }

       
    /**
     *
     * @param records
     */
    public static void createRecord(ArrayList<Record> records) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------");
       System.out.println("--------------------------------");
        System.out.println("\tPC Hardware Information");
        System.out.println("--------------------------------");
        
       int code = generateCode(records);
       System.out.println("Code: "+code);
       System.out.println("--------------------------------");
        System.out.print("Name:\t ");
        String name = input.nextLine();
        System.out.println("----------------------------------------------------------------");
        System.out.println("\t\tEnter peripheral\n(Input Device, Ouput Device or Input and Output Device)");
        System.out.print("--->");
        String peripheral = input.nextLine();
        System.out.println("----------------------------------------------------------------");
        System.out.print("Quantity: ");
        int quantity = Integer.parseInt(input.nextLine());  
        System.out.println("--------------------------------");
        System.out.print("Assigned To (IF NON TYPE: None ): ");
        String assignedTo = input.nextLine();
        System.out.println("--------------------------------");
        
        Record record = new Record(code, name, peripheral, quantity, assignedTo);
 
        // Add the Record to the ArrayList
        records.add(record);
}
}
}
