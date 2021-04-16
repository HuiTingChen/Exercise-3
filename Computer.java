package ComputerConstructors;

import java.util.*; //import util package that including Scanner class

public class Computer {
	String Brand;
	String OperateSystem;
	String Processor;
	String Resolution;
	double Size;
	double Weight;
	
	Scanner s = new Scanner(System.in);
	//default construcctor
	//Computer asus = new Computer();
	Computer() {
		System.out.print("Enter the brand of the computer: ");
		this.Brand = s.nextLine();
		System.out.print("Enter the operating system of the computer: ");
		this.OperateSystem = s.nextLine();		
		System.out.print("Enter the processor of the computer: ");
		this.Processor = s.nextLine();
		System.out.print("Enter the resolution of the computer: ");
		this.Resolution = s.nextLine();
		System.out.print("Enter the size of the computer (inches): ");
		this.Size = s.nextDouble();
		System.out.print("Enter the weight of the computer (kg): ");
		this.Weight = s.nextDouble();
		
	}
	
	
	//Parameterized constructor
	Computer(String b, String o, String p, String r, double s, double w){
			this.Brand=b;
			this.OperateSystem=o;
			this.Processor=p;
			this.Resolution=r;
			this.Size=s;
			this.Weight=w;
	}
}