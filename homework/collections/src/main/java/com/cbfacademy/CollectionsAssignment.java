package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsAssignment {

    /**
     * This method removes all values from the provided list that are smaller
     * than the indicated integer. The remaining elements retain their original
     * ordering.
     *
     * @param list   - the list of integers
     * @param minValue the minimum value to retain
     */
    public static void removeSmallInts(List<Integer> list, int minValue) {
        // Your solution must traverse the list from last to first element
        // removing any values less than minValue.

        /**  Loop through all items in the list
        * public means public access to the method and class. Code from other packages can use this

        * static means the variable or mathod belongs to the class rather than a specific instance

        * void means there is no return

        * removeSmallInts is a method

        * this code is demonstrating a list of Intergers with the variable name list
        * and an int with the variable name minValue

        *  Start at the end of the list using i = list.size() - 1

        * i >=0 means i is equal to or greater than 0

        * i-- means you are counting down

        * Created a new Interger variable called currentItem which is where you are when looping through the list 
        * by getting the value with list.get(i);

        * if statement states if currentItem is less than minValue, remove currentItem from list 
        **/
        for (int i = list.size() - 1; i >= 0 ; i--) {
            Integer currentItem = list.get(i);
            if (currentItem < minValue) {
                list.remove(currentItem);
            }
        }
    }

    /**
     * This method returns true if the provided collection contains any
     * duplicate elements.
     *
     * @param integers - a collection of integers
     * @return true if integers contains duplicates, false otherwise
     */
    // Creating a method to return a boolean value if the data contains duplicates
    // Using collection of Intergers called intergers
    public static boolean containsDuplicates(Collection<Integer> integers) {
        // Your solution must not use any loops.
        
        // Creating a new set called uniqueNumbers the end is a HashSet, that is using the collection of intergers from the above parameter
        
        // If condition is if uniqueNumbers size is smaller than intergers.size return true as it will mean there is duplicates
        
        // As a HashSet cannot contain duplicates so the size will be smaller if it contains duplicates
        
        // Return false if the data does not contain duplicates
        Set<Integer> uniqueNumbers = new HashSet<Integer>(integers);
   
        if (uniqueNumbers.size() < integers.size()) {
            return true;
        }
      
        return false;
    }

    /**
     * This method returns an ArrayList containing all elements that appear in
     * either of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order.
     * <p>
     * For example, if the two arguments contain {2, 1, 2, 3} and {3, 4, 4, 5},
     * the returned ArrayList will contain {1, 2, 3, 4, 5}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return A sorted ArrayList containing the integers that appear in either
     * collection.
     */

    // Created a HashSet of Interger called setOf Numbers

    //because Hashset does not contain duplicates

    //Added the collections of ints1 & ints2 to the setOfNumbers Hashset

    //To consolidate the 2 collections into 1

    // Created a new ArrayList of Integers using the setOfNumbers variable to return the consolidated collections

    public static ArrayList<Integer> inEither(Collection<Integer> ints1, Collection<Integer> ints2) {
        // This must be done with no loops.
        Set<Integer> setOfNumbers = new HashSet <Integer>();
        setOfNumbers.addAll(ints1);
        setOfNumbers.addAll(ints2);

        ArrayList <Integer> result = new ArrayList<Integer>(setOfNumbers);
        return result;

    }

    /**
     * This method returns an ArrayList containing all elements that appear in
     * both of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order. For example, if the two arguments contain {2, 1, 2, 3} and
     * {3, 4, 4, 5}, the returned ArrayList will contain {3}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return An ArrayList containing the integers that appear in both
     * collections.
     */

     //Created 2 Hashsets called mySet1 & mySet2

     //put the collections ints1 & ints2 in the new HashSets

     //used the retainAll method to identify common elements from 2 different sets

     //Converted mySet1 into a new ArrayList with the variable name result

     //returned the result

    public static ArrayList<Integer> inBoth(Collection<Integer> ints1, Collection<Integer> ints2) {
        // This must be done with no loops.
        Set<Integer> mySet1 = new HashSet<Integer>();
        mySet1.addAll(ints1);
        Set<Integer> mySet2 = new HashSet<Integer>();
        mySet2.addAll(ints2);

        mySet1.retainAll(mySet2);
        ArrayList<Integer> result = new ArrayList<Integer>(mySet1);

        return result;

    }

    /**
     * This method returns the String that appears most frequently in the
     * provided list. For example, if the input list contains the elements
     * {"Bob", "Alice", "Bob"}, this method will return "Bob". If there are
     * ties, any of the most frequently occurring elements may be returned.
     * If the list is empty, return the empty string "".
     *
     * @param list - a list of Strings
     * @return the most frequently occurring String
     */
    public static String mostFrequent(List<String> list) {
        // You should solve this problem in two stages: First iterate through
        // the list to count occurrences of each String. Then iterate through
        // your counts to find the largest. You'll need a collection that allows
        // you to store a mapping from Strings to counts.
        // No nested loops or non-enhanced for-loops are allowed.

        // 1. Create a hashmap with key of strings and value of integers called countOfStrings.
        // 2. Create a Strinv variable called mostFrequentString that is used to store the most common word
        // 3. Create a for loop with String variable called 'key' which is each word in the list. 
        // Loop through the : list in the parameters that contains the words
        // 4. create an integer variable in for loop called countOfOccurance that gets the value of the current word using .get(key)
        // 5. Use an if statement to check if countOfOccurance == null to check if the word exists in map. if it is null then we change
        // the value to 0
        // 6. Create if statement to check if mostFrequentString is equal to "". If it is we assign the value to the key variable
        // 7. Use countOfStrings.put(key,countOfOccurance +1) to add word to hashmap with the value of how many times it occurred
        // 8. Create if statement that checks countOfOccurance > countOfStrings.get(mostFrequentString) to see if a word
        // has come up more and if so assign mostFrequentString to be equal to key which is the new word
        HashMap<String,Integer> countOfStrings = new HashMap<String, Integer>();
        String mostFrequentString = "";
        for(String key : list) {
            Integer countOfOccurance = countOfStrings.get(key);
            if (countOfOccurance == null){
                countOfOccurance = 0;
            }   
            if (mostFrequentString == "" ) {
                mostFrequentString = key;
            }

            countOfStrings.put(key,countOfOccurance +1);
            if (countOfOccurance > countOfStrings.get(mostFrequentString)) {
                mostFrequentString = key;
            }
        }


        return mostFrequentString;
    }

    public static String getName() {
        return "Collections Assignment";
    }
}
