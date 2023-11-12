package com.cbfacademy.strings;

public class App {
    private static String format;

    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }

    public static String concatenate(String word1, String word2, String word3) {
        // TODO: Write code that concatenates the input parameters and returns the result

    
       String result = word1 + word2 + word3;

       return result;
    
       
    }

    public static Boolean areEqual(String word1, String word2) {
        //TODO: Write code to determine whether the input parameters are equal strings
        

        Boolean result = word1 == word2;

        return result;

    }


    public static String format(String item, int quantity, double price) {
        // TODO: Write code to return a string formatted as follows: "Item: [item]. Price: £[amount]. Quantity: [quantity]". The date should be formatted as DD/MM/YYYY, e.g. 24/10/2023
        


        return String.format("Item: %s. Price: £%.2f. Quantity: %d", item, price, quantity);

    



    }
}

