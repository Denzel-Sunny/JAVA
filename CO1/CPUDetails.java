class CPU{
	
	double price;
	
	class Processor{
		
		double cores;
		String manufacturer;
		
		double getCache(){
			return 4.3;
		}
	}
	
	protected class RAM{
		
		double memory;
		String manufacturer;
		
		double getClockSpeed(){
			return 5.5;
		}
	}
}

public class CPUDetails{
	
	public static void main(String[] args){
		System.out.println("Name: Denzel Sunny");
System.out.println("Addmission_no: 22MCA022");
System.out.println("Course ID & Code : OOP LAB, 20MCA132");
System.out.println("Date: 24/03/2023");
System.out.println("____________________________________\n\n");

		CPU cpu = new CPU();
		
		CPU.Processor processor = cpu.new Processor();
		
		CPU.RAM ram = cpu.new RAM();
		System.out.println("Processor Cache = " + processor.getCache());
		System.out.println("Ram Clock speed = " + ram.getClockSpeed());
	}
}
