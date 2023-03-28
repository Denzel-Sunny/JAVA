import java.util.Scanner;

class symmetric{
	
	public static void main(String[] args){
	
		System.out.println("Name: Denzel Sunny");
System.out.println("Addmission_no: 22MCA022");
System.out.println("Course ID & Code : OOP LAB, 20MCA132");
System.out.println("Date: 28/03/2023");
System.out.println("____________________________________\n\n");

	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number of rows : ");
		int rows = sc.nextInt();
		
		System.out.println("enter the number of columns : ");
		int cols = sc.nextInt();
		
		int matrix[][] = new int[rows][cols];
		System.out.println("Enter the elements : ");
		for(int i=0; i<rows; i++)
			for(int j=0; j<cols; j++)
				matrix[i][j] = sc.nextInt();
		
		sc.close();
		System.out.println("Printing input matrix : ");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
				System.out.print(matrix[i][j]+"\t");
			System.out.println();
		}
		
		if (rows != cols)
			System.out.println("The given matrix is not a square matix");
		else
		{
			boolean symmetric = true;
			for(int i=0; i<rows; i++)
				for(int j=0; j<cols; j++)
					if(matrix[i][j] != matrix[j][i])
					{
						symmetric = false;
						break;
					}
			if(symmetric)
			{
				System.out.println("The given matrix is symmetric..");
			}
			else
			{
				System.out.println("The given matrix is not symmetric..");
			}
		}
	
	}
}
