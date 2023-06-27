import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HashToTree {
    public static void main(String[] args) {
    
    System.out.println("Name: Denzel Sunny");
System.out.println("Addmission_no: 22MCA022");
System.out.println("Course ID & Code : OOP LAB, 20MCA132");
System.out.println("Date: 27/06/2023");
System.out.println("____________________________________\n");

    
        // Create a HashMap object
        Map<String, Integer> hashMap = new HashMap<>();

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
            hashMap.put(key, value);
        }

        System.out.println("HashMap elements: " + hashMap);

        // Convert HashMap to TreeMap
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);

        System.out.println("TreeMap elements: " + treeMap);

        // Close the scanner
        scanner.close();
    }
}

