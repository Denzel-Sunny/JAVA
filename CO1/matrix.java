import java.util.Scanner; 
public class matrix
{
	public static void main(String args[])
	{
		System.out.println("Name: Denzel Sunny");
System.out.println("Addmission_no: 22MCA022");
System.out.println("Course ID & Code : OOP LAB, 20MCA132");
System.out.println("Date: 24/03/2023");
System.out.println("____________________________________\n\n");
		int p, q, m, n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of rows in first matrix: ");
		p = in.nextInt();
		System.out.println("Enter number of columns in first matrix: ");
		q = in.nextInt();
		System.out.println("Enter number of rows in second matrix: ");
		m = in.nextInt();
		System.out.println("Enter number of columns in second matrix: ");
		n = in.nextInt();
		
		if (p == m && q == n)
		{
		  int a[][] = new int[p][q];
		  int b[][] = new int[m][n];
		  int c[][] = new int[m][n];
		  System.out.println("Enter elements of first matrix: ");
		  for (int i = 0; i < p; i++)
		  	for (int j = 0; j < q; j++)
		  		a[i][j] = in.nextInt();
		  		
		  System.out.println("Enter elements of second matrix: ");
		  for (int i = 0; i < m; i++)
		  	for (int j = 0; j < n; j++)
		  		b[i][j] = in.nextInt();
		  		
		  System.out.println("First Matrix: ");
		  for (int i = 0; i < p; i++)
		  {
		    for (int j = 0; j < q; j++)
                   	System.out.print(a[i][j]+" ");
		    System.out.println(" ");
		  }
		  
		  System.out.println("second Matrix: ");
		  for (int i = 0; i < m; i++)
		  {
		    for (int j = 0; j < n; j++)
		    {
                   	System.out.print(b[i][j]+" ");
                   }
		    System.out.println(" ");
		  }
		  
		  for(int i=0; i<p; i++)
		  	for(int j=0; j<n; j++)
		  		for(int k=0; k<q; k++)
		  			c[i][j] = a[i][j] + b[i][j];
		 
		  System.out.println("Matrix after addition: ");
		  for(int i=0; i<p; i++)
		  {
		  	for(int j=0; j<n; j++)
		  		System.out.print(c[i][j]+" ");
		  	System.out.println(" ");
		  }
	}
	else
	{
		System.out.println("Addition would not be possible");
		  
	}
  }
}
