import java.util.Scanner;

public class Overload {
  void calculateArea(float x) {
    System.out.println("Area of the square: "+x*x+ "sq units");
  }
  
  void calculateArea(float x, float y) {
    System.out.println("Area of rectangle: " +x*y+ "sq units");
  }
  
  void calculateArea(double r) {
    double area = 3.14*r*r;
    System.out.println("Area of the circle: " +area+ "sq units");
  }
  
  public static void main(String args[]) {
  
    
System.out.println("Name: Denzel Sunny");
System.out.println("Addmission_no: 22MCA022");
System.out.println("Course ID & Code : OOP LAB, 20MCA132");
System.out.println("Date: 2/05/2023");
System.out.println("____________________________________\n\n");


    Overload obj = new Overload();
    
    System.out.println("Enter the side of the square: ");
    Scanner sc = new Scanner(System.in);
    float side = sc.nextFloat();
    obj.calculateArea(side);
    
    System.out.println("Enter sides of the rectangle: ");
    float side1 = sc.nextFloat();
    float side2 = sc.nextFloat();
    obj.calculateArea(side1, side2);
    
    
    System.out.println("Enter the radius of the circle: ");
    double rad = sc.nextDouble();
    obj.calculateArea(rad);
  }
  
}
