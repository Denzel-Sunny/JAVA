import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
    
    System.out.println("Name: Denzel Sunny");
System.out.println("Addmission_no: 22MCA022");
System.out.println("Course ID & Code : OOP LAB, 20MCA132");
System.out.println("Date: 23/06/2023");
System.out.println("____________________________________\n");
    
        // Create an empty ArrayList
        List<String> stringList = new ArrayList<>();

        // Add elements to the ArrayList
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Mango");

        // Print the ArrayList
        System.out.println("ArrayList: " + stringList);

        // Get the size of the ArrayList
        System.out.println("Size: " + stringList.size());

        // Check if the ArrayList is empty
        System.out.println("Is Empty? " + stringList.isEmpty());

        // Access an element by index
        String element = stringList.get(2);
        System.out.println("Element at index 2: " + element);

        // Check if an element exists in the ArrayList
        boolean contains = stringList.contains("Banana");
        System.out.println("Contains 'Banana'? " + contains);

        // Find the index of an element in the ArrayList
        int index = stringList.indexOf("Mango");
        System.out.println("Index of 'Mango': " + index);

        // Sort the ArrayList in ascending order
        Collections.sort(stringList);
        System.out.println("Sorted ArrayList: " + stringList);

        // Remove an element from the ArrayList
        stringList.remove("Orange");
        System.out.println("After removing 'Orange': " + stringList);

        // Clear all elements from the ArrayList
        stringList.clear();
        System.out.println("After clearing all elements: " + stringList);
    }
}

