import java.util.Scanner;

public class Search {
  public static void main(String[] args){
    int c, n, search, array[];
    
    System.out.println("Name: Denzel Sunny");
System.out.println("Addmission_no: 22MCA022");
System.out.println("Course ID & Code : OOP LAB, 20MCA132");
System.out.println("Date: 12/04/2023");
System.out.println("____________________________________\n\n");

    
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of elements: ");
    n = in.nextInt();
    array = new int[n];
    
    System.out.println("Enter those " + n + " elements: ");
    
    for (c = 0; c < n; c++)
      array[c] = in.nextInt();
    
    System.out.println("Enter value to find: ");
    search = in.nextInt();
    
    for (c=0; c<n; c++)
      if(array[c] == search)
      {
        System.out.println(search + " is present at location " + (c+1));
        
        break;
      }
    if (c == n)
      System.out.println(search + "isn't presesnt in array.");
  }
}
