package com.cbfacademy;

import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;

//Create a FileManager class
public class FileManager {
    
    //Create readFile method  which returns List<String>
    public List<String> readFile(String filename){
        // Create an arraylist of strings to store lines of a file
        List<String> myLines = new ArrayList<>();

        // Try and catch block is used to catch errors
        // Very useful when dealing with reading files
        try {
            // Create a File object called 'myFile' which takes in our filename method argument 
            File myFile = new File(filename);

            //Create a new Scanner object. Scanners are used for 
            //reading and writing
            Scanner myScanner = new Scanner(myFile);

            // Use a while loop to loop through the lines
            // Checks whether we have any new lines we haven't checked
            // Only runs if my scanner.hasNextLine returns true
            while (myScanner.hasNextLine()) {
                // Store the next line of the file in our 'line' variable
                String line = myScanner.nextLine();
                // Add the line variable to our arraylist
                myLines.add(line);
            }
            // Closing the file because we are done reading and don't need it anymore
            // This is useful because if we leave the file open, it will drain resources
            myScanner.close();
        
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
       
        return myLines;
    }

    public void copy(String inputFile, String outputFile){

    }


}
