import java.util.LinkedList;
import java.util.Scanner;
import java.util.Arrays;
public class RemoveFromLinkedList {
    public static void main(String[] args) {
        
        System.out.println("Name: Denzel Sunny");
System.out.println("Addmission_no: 22MCA022");
System.out.println("Course ID & Code : OOP LAB, 20MCA132");
System.out.println("Date: 27/06/2023");
System.out.println("____________________________________\n");

    
    
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the linked list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grapes");

        System.out.println("Linked List before removal: " + linkedList);

        // Get user input for elements to remove
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter elements to remove (separated by spaces): ");
        String input = scanner.nextLine();

        String[] elementsToRemove = input.split(" ");

        // Remove elements from the linked list
        for (String element : elementsToRemove) {
            linkedList.remove(element);
        }

        // Remove elements from the linked list using removeAll
        linkedList.removeAll(Arrays.asList(elementsToRemove));

        System.out.println("Linked List after removal: " + linkedList);
    }
}

