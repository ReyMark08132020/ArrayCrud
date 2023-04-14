/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recordlist;

import static com.mycompany.recordlist.viewRecord.viewRecord;
import static com.mycompany.recordlist.createRecord.Record;


import java.util.ArrayList;


/**
 *
 * @author zulta
 */
public class generateReport {
    public static void generateReport(ArrayList<Record> records) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("\n\t\t\tReport Record\t\t\n");
        System.out.println("----------------------------------------------------------------");
        // Search for the Record
      int totalNumAvailablePeripherals = 0;
        int totalNumAssigned = 0;
        int totalNumInput = 0;
        int totalNumOutput = 0;
        int totalNumEmployees = 0;
        int totalNumPeripherals = 0;
        for(Record record : records) {
            
            if(record.getPeripheral().equals("Input Device")) {
                totalNumInput++;
                totalNumPeripherals++;
            } else if(record.getPeripheral().equals("Output Device")) {
                totalNumOutput++;
                totalNumPeripherals++;
           
            }if(!"None".equals(record.getAssignedTo())) {
            totalNumAssigned++;
            totalNumEmployees++;
            }else if("None".equals(record.getAssignedTo())) {
                totalNumAvailablePeripherals++;
            }
        }
        System.out.println("----------------------------------------------------------------");
        System.out.print("Total number of Peripherals: " + totalNumPeripherals);
        System.out.println("\n----------------------------------------------------------------");
        System.out.print("Total number of Available peripherals: " + totalNumAvailablePeripherals);
        System.out.println("\n----------------------------------------------------------------");
        System.out.print("Total number of Assigned peripherals: " + totalNumAssigned);
        System.out.println("\n----------------------------------------------------------------");
        System.out.print("Total number of Input devices: " + totalNumInput);
        System.out.println("\n----------------------------------------------------------------");
        System.out.print("Total number of Output devices: " + totalNumOutput);
        System.out.println("\n----------------------------------------------------------------");
        System.out.print("Total number of Employees with a peripheral assigned: " + totalNumEmployees);
        System.out.println("\n----------------------------------------------------------------");
        
        
    }
}

