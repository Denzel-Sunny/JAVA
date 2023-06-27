import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetComparison {
    public static void main(String[] args) {
    
    System.out.println("Name: Denzel Sunny");
System.out.println("Addmission_no: 22MCA022");
System.out.println("Course ID & Code : OOP LAB, 20MCA132");
System.out.println("Date: 27/06/2023");
System.out.println("____________________________________\n");

    
        // Create the first HashSet
        Set<String> set1 = new HashSet<>();

        // Create the second HashSet
        Set<String> set2 = new HashSet<>();

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements for the first set
        System.out.print("Enter the number of elements for the first set: ");
        int numElements1 = scanner.nextInt();

        // Prompt the user to enter the elements for the first set
        System.out.println("Enter the elements for the first set:");

        for (int i = 0; i < numElements1; i++) {
            String element = scanner.next();
            set1.add(element);
        }

        // Prompt the user to enter the number of elements for the second set
        System.out.print("Enter the number of elements for the second set: ");
        int numElements2 = scanner.nextInt();

        // Prompt the user to enter the elements for the second set
        System.out.println("Enter the elements for the second set:");

        for (int i = 0; i < numElements2; i++) {
            String element = scanner.next();
            set2.add(element);
        }

        // Compare the two HashSets
        boolean isEqual = set1.equals(set2);

        // Print the comparison result
        System.out.println("HashSet Comparison: " + isEqual);

        // Close the scanner
        scanner.close();
    }
}

