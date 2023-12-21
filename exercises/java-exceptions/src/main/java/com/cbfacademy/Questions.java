package com.cbfacademy;

public class Questions {
    
}

    //Question 1
    //It is the following code legal code?
   
        try {

        } finally {
    
        }
    //The try block does not need to have a catch block
    //if there is a finally block. 


    //Question 2 
    //What exception types can be caught by the following handler?

    catch (Exception e) {
    
         }

    // I believe this code can catches any exception. 

  
    // What is wrong with using this type of exception handling?

    //This can be a poor implementation 
    //because you are losing valuable information about the type of exception being thrown
    //and making your code less efficient. As a result, your program may be forced to 
    //determine the type of exception before it can decide on the best recovery strategy.

      //Question 3

      //Is there anything wrong with the following exception handler as written? Will this code compile?

      try {

      } catch (Exception e) {
      
      } catch (ArithmeticException a) {
      
      }

      //This first handler catches exceptions of type Exception; therefore, it catches any exception, including ArithmeticException. 
      //The second handler could never be reached. This code will not compile.

      //Question 4 

        int[] A; 
        A[0] = 0;

        //The above code produces
        //(compile error). The array is not initialized and will not compile.
        //(error).
        //(no exception). When you read a stream, you expect there to be an end of stream marker. You should use exceptions to catch unexpected behavior in your program.
        //(checked exception).

        










   

         