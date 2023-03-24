public class product {
	int pcode;
	String pname;
	double price;
	product(int code, String name,double rate){
	pcode=code;
	pname=name;
	price=rate;
	}
	void display(){
    		System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
	}
	static void lowest(double p1, double p2, double p3){
    		if(p1<p2&&p1<p3)
    		{    
        		System.out.println("Product 1 has the lowest price");
    		}
    		else if(p2<p1&&p2<p3){
        		System.out.println("Product 2 has the lowest price");
    		}
    		else if(p3<p1&&p2>p3)
    		{
        		System.out.println("Product 3 has the lowest price");

    		}
	} 
	public static void main(String[] args) {
	
		System.out.println("Name: Denzel Sunny");
		System.out.println("Addmission_no: 22MCA022");
		System.out.println("Course ID & Code : OOP LAB, 20MCA132");
		System.out.println("Date: 24/03/2023");
		System.out.println("____________________________________\n");
		
		
    		product obj1=new product(1,"Shampoo",400);
    		product obj2=new product(2,"Glass",20);
    		product obj3=new product(3,"Book",100);
    		System.out.println("\nProduct Information\n\nProduct_Code\tProduct_Name\tProduct_Price");
    		obj1.display();
    		obj2.display();
    		obj3.display();
    		lowest(obj1.price,obj2.price,obj3.price);
		}
    
}
