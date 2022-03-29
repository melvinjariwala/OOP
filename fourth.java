import java.util.*;
class fourth{
	public static void main(String args[]){	
		double pounds, inches, bmi;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight in pounds = ");
		pounds = sc.nextDouble();
		pounds = pounds/0.45359237;
		System.out.println("Enter height in inches = ");
		inches = sc.nextDouble();
		inches = inches/0.0254;
		bmi = pounds/(inches*inches);
		System.out.println("BMI = " + bmi);	
	}
}
