import java.util.Scanner;
public class floatChall {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double poundNum = 0d;
		
		
		System.out.println("Type a pound value to convert to kilo: ");
		poundNum = sc.nextDouble();
		
		double kiloNum = (poundNum*0.45359237);
		
		System.out.println("Kilo value: "+kiloNum);
		

		
		
			
	}
	
}
