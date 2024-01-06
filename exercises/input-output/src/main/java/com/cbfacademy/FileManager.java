package com.cbfacademy;

import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.StandardCopyOption;

//Create a FileManager class
public class FileManager {
    
    //Create readFile method  which returns List<String>
 public List<String> readFile(String filename) throws IOException {
        // Create an ArrayList of strings to store lines of a file
        List<String> fileContents = new ArrayList<>();

        // Create a Path object
        Path filePath = Paths.get(filename);

        // Check if the file exists before attempting to read it
        if (!Files.exists(filePath)) {
            throw new IOException("File not found: " + filename);
        }

        try {
            // Read all lines from the file and add them to the ArrayList
            fileContents.addAll(Files.readAllLines(filePath));

        } catch (IOException e) {
            // If an IOException occurs during reading, rethrow it
            throw e;
        }

        return fileContents;
    }

    // Part 2

    public void copy(String inputFile, String outputFile){
        // get the path to the input file you've been given
        Path filePathInput = Paths.get(inputFile);
        //Read from the input file
        Path filePathOutput = Paths.get(outputFile);

        try{
            //Copy what you've read onto the output file
            Files.copy(filePathInput, filePathOutput, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }


    //Part 3
    public void reverseLines(String inputFile, String outputFile){
        //get the paths to your I/O first
        try{

            Path filePathInput = Paths.get(inputFile);
            Path filePathOutput = Paths.get(outputFile);

            //read the lines from the input, out those in the collection of list 
            //<String> myListOfStrings = Files.readAllLines(filePathInput);

            List<String> myListOfStrings = new ArrayList<>();
            myListOfStrings.addAll(Files.readAllLines(filePathInput));

            //reverse the order that list

            Collections.reverse(myListOfStrings);
        
            // Create the file if it doesn't exit
            Files.newOutputStream(filePathOutput, StandardOpenOption.CREATE);
            // Write the contents of the reversed list into the output file
            Files.write(filePathOutput,myListOfStrings);
            

            

        } catch(IOException e){
            System.out.println(e.getMessage());
        }

        
    }


}
