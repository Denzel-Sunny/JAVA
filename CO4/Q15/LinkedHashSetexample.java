import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class LinkedHashSetexample {
    public static void main(String[] args) {
    
      System.out.println("Name: Denzel Sunny");
System.out.println("Addmission_no: 22MCA022");
System.out.println("Course ID & Code : OOP LAB, 20MCA132");
System.out.println("Date: 27/06/2023");
System.out.println("____________________________________\n");

    
        // Create a LinkedHashSet object
        Set<String> set = new LinkedHashSet<>();

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements to add
        System.out.print("Enter the number of elements to add: ");
        int numElementsToAdd = scanner.nextInt();

        // Prompt the user to enter the elements
        System.out.println("Enter the elements to add:");

        for (int i = 0; i < numElementsToAdd; i++) {
            String element = scanner.next();
            set.add(element);
        }

        System.out.println("Set elements after addition: " + set);

        // Prompt the user to enter an element to remove
        System.out.print("Enter an element to remove: ");
        String elementToRemove = scanner.next();

        // Remove the element from the set
        set.remove(elementToRemove);
        System.out.println("Set elements after removal: " + set);

        // Close the scanner
        scanner.close();
    }
}

