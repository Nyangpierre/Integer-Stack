import java.util.Collections; // Import necessary for sorting
import java.util.Stack; // Import Stack class
import java.util.Scanner; // Import Scanner for input

/**
 * This class Stacklist allows for user to input integers into a Stack, which is then sorted
 * and displayed.
 * <p>
 * To compile the program, use the command: javac Stacklist.java
 * <p>
 * To run the program, use the command: java Stacklist
 * <p>
 * To create documentation, use the command: javadoc -d doc Stacklist.java
 * @author Jerryline Pierre
 * @since Week 5 CSC6301 
 */

public class Stacklist {  

    /**
     * Constructs the Stacklist class.
     */
    public Stacklist() {
        // Default constructor.
    }

    /**
     * The main method for the Stacklist class. It reads integers from the user,
     * adds them to a Stack, sorts the stack, and then prints the original and sorted stacks.
     *
     * @param args Standard command line arguments
     * Test case {4,5,7,9,44,55}
     * output {4,5,7,9,44,55}
     */

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); // Creates a Scanner object 
        Stack<Integer> intStack = new Stack <Integer>(); // Initializes a Stack to store integers

        System.out.println("Enter integers (enter `done` when done):");

        while (scanner.hasNext()) {  
            String input = scanner.next();

            if (input.equals("done")) {
                break;
            }
            try {
                int num = Integer.parseInt(input);  
                intStack.push(num);
            } catch (NumberFormatException e) {  // Catches and handles invalid input
                System.out.println("Invalid input. Please enter an integer or 'done' to exit.");
            }
        }

        System.out.println("Original Stack: " + intStack);

        Collections.sort(intStack); 

        System.out.println("Sorted Stack: " + intStack);

        scanner.close(); // Close the scanner 

        // Code Analysis of reuse
        // Stacklistclass can be reused in different projects depending on the project need
        // Stacklist could reuse the code by adding functionalities to the program like calculating length, mode, mean.
        // Stacklist could be reused to change the data type by re-editing the int to string or doubles which can also be stored in a stack
        // Stacklist can also be reused if the input is changed from command line to any other source files
        //Reuse from linked list was way user in the program, hard to import stack ,  replace intlist with instack ,, no other parts of the program was changed
    }
}
