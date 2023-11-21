package com.cbfacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method such that
        //  it creates a list where for each element of the input list ${numbers}
        //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
        //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
        //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
        //  - it adds the element to the list in any other case
        //  - it returns the constructed list

        //Created an ArrayList called result
        // create a for condition looping the list of numbers to a number element
        // Created a for an enhanced for loop to add "FizzBuzz", "Fizz" and "Buzz" if the code met the condition
        // result is adding the number element to the list and converting it into a string

        List<String> result = new ArrayList<>();

        for(Integer number : numbers){
            if(number % 3 == 0 && number % 5 == 0){
                result.add("FizzBuzz");
            }
            else if (number % 3 == 0){
             result.add("Fizz");   
            }
             else if (number % 5 == 0){
             result.add("Buzz");
             }  
             else {
                result.add(number.toString());
             }
            
       }
       return result;
    }
         






        //throw new RuntimeException("Not implemented");
    //}

    public String whichMonth(Integer number) {
        // TODO - Implement this method such that
        //  - it returns the month corresponding to the input ${number}
        //  - if the ${number} is invalid, the method should return "Invalid month number"
        //throw new RuntimeException("Not implemented");

        String[] months ={
            "January", "February", "March", "April", "May", "June",
    "July", "August", "September", "October", "November", "December"
        };
        //Check if the input number is within the valid range
        if (number >= 1 && number <= 12){

    
        //Subtracting 1 to align with the array indices
            return months[number -1];
        }
        else {
            return "Invalid month number";
        }

    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        //  - determines the sum of all the even numbers in the list
        //  - determines the sum of all the odd numbers in the list
        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        //throw new RuntimeException("Not implemented");

         //numbers [i - 1] = i;
          //int[] numbers = new int [100];

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }
        // - determines the sum of all the even numbers in the list 
        // Initialize varaibles to store the sum of odds and evens
        int sumOfEvens = 0;
        int sumOfOdds = 0;

        //Determine the sum of odds and evens
        for (int num : numbers) {
            if (num % 2 ==0) {
                //Even number
                sumOfEvens += num;
            } else {
                //Odd number
                sumOfOdds += num;
            }
        }
        // Create and return a map with the calculated sums
        Map<String, Integer> resultMap = new HashMap<>();
        resultMap.put("SumOfEvens", sumOfEvens);
        resultMap.put ("SumOfOdds", sumOfOdds);
        //{"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}

        return resultMap;


    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that
        //  - it takes an array list of integers
        //  - it returns the list in reverse order
        //throw new RuntimeException("Not implemented");
        System.out.println("numbers = " + numbers);
        List<Integer> reversedList = new ArrayList<Integer>();
        for (int i = numbers.size() - 1; i >= 0; i --) {
            reversedList.add(numbers.get(i));
        }

        return reversedList;
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
