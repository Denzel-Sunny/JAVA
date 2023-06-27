import java.util.Stack;

public class StackRemove {
    public static void main(String[] args) {
    
    System.out.println("Name: Denzel Sunny");
System.out.println("Addmission_no: 22MCA022");
System.out.println("Course ID & Code : OOP LAB, 20MCA132");
System.out.println("Date: 27/06/2023");
System.out.println("____________________________________\n");

    
        // Create a stack
        Stack<String> stack = new Stack<>();

        // Push elements to the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Orange");
        stack.push("Grapes");

        System.out.println("Before removing: " + stack);

        // Remove an object from the stack by position
        int positionToRemove = 2; // Position starts from 1
        removeByPosition(stack, positionToRemove);

        System.out.println("After removing: " + stack);
    }

    public static void removeByPosition(Stack<String> stack, int position) {
        if (position < 1 || position > stack.size()) {
            System.out.println("Invalid position");
            return;
        }

        Stack<String> tempStack = new Stack<>();

        // Pop elements from the original stack and push to the temporary stack until the desired position
        for (int i = 1; i < position; i++) {
            tempStack.push(stack.pop());
        }

        // Pop the element at the desired position
        stack.pop();

        // Push back the elements from the temporary stack to the original stack
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}

