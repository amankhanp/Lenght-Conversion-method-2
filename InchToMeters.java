package etoday;
import java.util.*;
public class InchToMeters implements LengthConversion{
	/*
	 * While implementing an interface first we need to check package,
	 * whether it is in same package or not.
	 */
	public void conversion() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value in Inch : ");
		double inch = input.nextDouble();
		double meters = inch * 0.0254;
		System.out.println("inch : " +inch + " = meters : " + meters);
	}
	public static void main(String[] args){
		InchToMeters imobject = new InchToMeters();
		imobject.conversion();
	}
}

