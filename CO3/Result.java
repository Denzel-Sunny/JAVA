import java.util.Scanner;
class sports{
    String sport;
    int Rating;
    sports(String spo, int rat){
        sport = spo;
        Rating = rat;
    }

}
class student extends sports{
    String Grade;
    double Overall_per;
    student(String spo, int rat,String gd, double per ){
        super(spo, rat);
        Grade = gd;
        Overall_per = per;
    }
}
public class Result extends student {
    Result(String spo, int rat,String gd, double per ){
        super(spo, rat, gd, per);
    }
    void display(){
        System.out.println("Sports Details of Student");
        System.out.println("Sport :"+sport);
        System.out.println("Rating :"+Rating);
        System.out.println("Academic Details of Student");
        System.out.println("Academic Grade :"+Grade);
        System.out.println("Overall percentage :"+Overall_per);
    }
    
    public static void main(String[] args) {
        
System.out.println("Name: Denzel Sunny");
System.out.println("Addmission_no: 22MCA022");
System.out.println("Course ID & Code : OOP LAB, 20MCA132");
System.out.println("Date: 7/06/2023");
System.out.println("____________________________________\n");

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Sports Details of Student");
        System.out.println(" Sport: ");
        String a =sc.nextLine();
        System.out.println(" Sport Rating  out of 10: ");
        int b =sc.nextInt();
        System.out.println("Enter the Sports Details of Student");
        System.out.println(" Academic Grade: ");
        String c =sc.next();
        System.out.println(" Overall percentage: ");
        double d =sc.nextDouble();
        sc.close();
        Result obj= new Result(a,b,c,d);
        obj.display();
    }
}
