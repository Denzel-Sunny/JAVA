import java.util.Arrays;
import java.util.Scanner;

public class StringSort {
	public static void main(String [] args){
		int count = 0;
		String tmp;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of strings to sort: ");
		count = scan.nextInt();
		
		// array to store strings 
		String str [] = new String[count];
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter strings: ");
		for(int i=0; i<count; i++)
			str [i] = scan1.nextLine();
			
		
		System.out.println("1. inbuilt sort() \n 2. user defined sorting()");
		System.out.println("Enter your choice: ");
		int choice;
		choice = scan.nextInt();
		
		switch (choice){
			// inbuilt sort.
			case 1: Arrays.sort(str);
				System.out.println(Arrays.toString(str));
				break;
			
			// user defined sorting.	
			case 2: for(int i=0; i<count; i++)
					for(int j=1; j<str.length; j++)
					//compare each element to remaining elements.
					if(str[i].compareTo(str[j])>0)
					{
					  //swap elements.
					  tmp = str[i];
					  str[i] = str[j];
					  str[j] = tmp;	
					}
			//prints sorted in ascending order.
			System.out.println(Arrays.toString(str));
			break;
		}
	}
}

