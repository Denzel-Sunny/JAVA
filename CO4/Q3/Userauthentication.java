import java.util.Scanner;

class authException extends Exception{
    
    public authException(String s){
       super(s);
    }
}

public class Userauthentication{
  
  public static void main(String[] args){
  	System.out.println("Name: Denzel Sunny");
System.out.println("Addmission_no: 22MCA022");
System.out.println("Course ID & Code : OOP LAB, 20MCA132");
System.out.println("Date: 21/06/2023");
System.out.println("____________________________________\n");

  
  
     String username = "student";
     String passcode = "student123";
     String user_name,password;
     Scanner sc = new Scanner(System.in);
     try
     {
       System.out.println("Enter username: ");
       user_name = sc.nextLine();
       
       System.out.println("Enter password: ");
       password = sc.nextLine();
       
       if(username.equals(user_name) && passcode.equals(password)){
         System.out.println("Authentication successful...");
       }
       else
          throw new authException("Invalid user credentials");
     }
     catch(authException e)
     {
       System.out.println("Exception caught "+e);
     }
  }
}
