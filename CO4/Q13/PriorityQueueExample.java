import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class PriorityQueueExample {
    public static void main(String[] args) {
    
    System.out.println("Name: Denzel Sunny");
System.out.println("Addmission_no: 22MCA022");
System.out.println("Course ID & Code : OOP LAB, 20MCA132");
System.out.println("Date: 27/06/2023");
System.out.println("____________________________________\n");

    
        // Create a PriorityQueue object
        Queue<Integer> queue = new PriorityQueue<>();

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements
        System.out.print("Enter the number of elements: ");
        int numElements = scanner.nextInt();

        // Prompt the user to enter the elements
        System.out.println("Enter the elements:");

        for (int i = 0; i < numElements; i++) {
            int element = scanner.nextInt();
            queue.offer(element);
        }

        System.out.println("Queue elements: " + queue);

        // Remove and process elements from the queue
        System.out.println("Processing elements:");

        while (!queue.isEmpty()) {
            int element = queue.poll();
            System.out.println("Processing element: " + element);
        }

        // Close the scanner
        scanner.close();
    }
}

