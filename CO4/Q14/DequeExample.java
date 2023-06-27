import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class DequeExample {
    public static void main(String[] args) {
    
    System.out.println("Name: Denzel Sunny");
System.out.println("Addmission_no: 22MCA022");
System.out.println("Course ID & Code : OOP LAB, 20MCA132");
System.out.println("Date: 27/06/2023");
System.out.println("____________________________________\n");

    
    
        // Create a Deque object
        Deque<String> deque = new LinkedList<>();

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of elements to add
        System.out.print("Enter the number of elements to add: ");
        int numElementsToAdd = scanner.nextInt();

        // Prompt the user to enter the elements
        System.out.println("Enter the elements to add:");

        for (int i = 0; i < numElementsToAdd; i++) {
            String element = scanner.next();
            deque.addLast(element);
        }

        System.out.println("Deque elements after addition: " + deque);

        // Prompt the user for the number of elements to remove
        System.out.print("Enter the number of elements to remove: ");
        int numElementsToRemove = scanner.nextInt();

        // Remove elements from the deque
        System.out.println("Removed elements:");

        for (int i = 0; i < numElementsToRemove; i++) {
            String removedElement = deque.removeFirst();
            System.out.println(removedElement);
        }

        System.out.println("Deque elements after removal: " + deque);

        // Close the scanner
        scanner.close();
    }
}

