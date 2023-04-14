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
public class deleteRecord {
     public static void deleteRecord(ArrayList<Record> records) {
        // Initialize the Scanner
        Scanner input = new Scanner(System.in);
 
        // Read the data
        System.out.println("--------------------------------");
        System.out.println("Code you want to delete");
        System.out.print("-->");
       
        int code = input.nextInt();
 
        int index = -1;
for (int i = 0; i < records.size(); i++) {
    if (records.get(i).getCode() == code) {
        index = i;
       Record movedRecord = records.get(i);
        records.remove(i);
        records.add(movedRecord);
        break;
    }
}
 
// Delete the record
if (index >= 0) {
    records.remove(index);
     System.out.println("--------------------------------");
    System.out.println("--------------------------------");
    System.out.println("Record deleted.");
    System.out.println("--------------------------------");
} else {
    System.out.println("--------------------------------");
    System.out.println("Record not found.");
}   System.out.println("--------------------------------");
    }
}
