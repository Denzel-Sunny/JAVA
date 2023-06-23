import java.util.Arrays;

class BubbleSort {
    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    // Swap array[j] and array[j+1]
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}

public class BubbleSortExample {
    public static void main(String[] args) {
    
    System.out.println("Name: Denzel Sunny");
System.out.println("Addmission_no: 22MCA022");
System.out.println("Course ID & Code : OOP LAB, 20MCA132");
System.out.println("Date: 23/06/2023");
System.out.println("____________________________________\n");
    
        Integer[] intArray = {5, 2, 8, 1, 9};
        System.out.println("Before sorting: " + Arrays.toString(intArray));
        BubbleSort.bubbleSort(intArray);
        System.out.println("After sorting: " + Arrays.toString(intArray));

        String[] stringArray = {"apple", "banana", "pear", "orange"};
        System.out.println("Before sorting: " + Arrays.toString(stringArray));
        BubbleSort.bubbleSort(stringArray);
        System.out.println("After sorting: " + Arrays.toString(stringArray));
    }
}

