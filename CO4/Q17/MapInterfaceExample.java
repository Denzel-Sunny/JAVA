import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapInterfaceExample {
    public static void main(String[] args) {
    
    System.out.println("Name: Denzel Sunny");
System.out.println("Addmission_no: 22MCA022");
System.out.println("Course ID & Code : OOP LAB, 20MCA132");
System.out.println("Date: 27/06/2023");
System.out.println("____________________________________\n");

    
        // Create a Map object
        Map<String, Integer> map = new HashMap<>();

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of elements to add
        System.out.print("Enter the number of elements to add: ");
        int numElementsToAdd = scanner.nextInt();

        // Prompt the user to enter the elements
        System.out.println("Enter the elements (key-value pairs) to add:");

        for (int i = 0; i < numElementsToAdd; i++) {
            String key = scanner.next();
            int value = scanner.nextInt();
            map.put(key, value);
        }

        System.out.println("Map elements after addition: " + map);

        // Prompt the user to change the value of an existing key
        System.out.print("Enter a key to change its value: ");
        String keyToChange = scanner.next();
        System.out.print("Enter the new value: ");
        int newValue = scanner.nextInt();
        map.put(keyToChange, newValue);

        System.out.println("Map elements after changing value: " + map);

        // Prompt the user to remove an element from the map
        System.out.print("Enter a key to remove its element: ");
        String keyToRemove = scanner.next();
        map.remove(keyToRemove);

        System.out.println("Map elements after removal: " + map);

        // Close the scanner
        scanner.close();
    }
}

