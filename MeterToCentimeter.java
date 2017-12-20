package etoday;
import java.util.Scanner;
public class MeterToCentimeter implements LengthConversion{
	/*
	 * While implementing an interface first we need to check package,
	 * whether it is in same package or not.
	 */
	public void conversion() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value in meter : ");
		float meters = input.nextFloat();
		float centimeters = meters * 100;
		System.out.println("meters : " +meters + " = centimeters : " + centimeters);
	}
	public static void main(String[] args){
		MeterToCentimeter mcobject = new MeterToCentimeter();
		mcobject.conversion();
	}
}
