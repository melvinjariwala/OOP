import java.util.Scanner;
class u1e3{
	public static void main(String args[]){
		double rupees;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Rupees = ");
		rupees = sc.nextDouble();
		System.out.println("Dollars = " + (rupees/80));
	}
}
