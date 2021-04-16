package ComputerConstructors;

public class Main {

	public static void main(String[] args) {
		
		
		Computer asus = new Computer();
		System.out.println("");
		System.out.println("_________________________________________");
		System.out.println("Computer's Brand            : " + asus.Brand);
		System.out.println("Computer's Operating System : " + asus.OperateSystem);
		System.out.println("Processor of Computer       : " + asus.Processor);
		System.out.println("Resolution of Computer      : " + asus.Resolution);
		System.out.println("Size of Computer            : " + asus.Size);
		System.out.println("Weight of Computer          : " + asus.Weight);
		System.out.println("_________________________________________");
		
		System.out.println("_________________________________________");
		Computer lenovo = new Computer("Lenovo", "Windows 10", "i7", "2160x1350", 13, 0.9);
		System.out.println("Computer's Brand            : " + lenovo.Brand);
		System.out.println("Computer's Operating System : " + lenovo.OperateSystem);
		System.out.println("Processor of Computer       : " + lenovo.Processor);
		System.out.println("Resolution of Computer      : " + lenovo.Resolution);
		System.out.println("Size of Computer (inches)   : " + lenovo.Size);
		System.out.println("Weight of Computer (kg)     : " + lenovo.Weight);
		System.out.println("_________________________________________");
		System.out.println("");
		
	}
}
