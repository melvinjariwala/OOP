import java.util.Scanner;
class third{
	public static void main(String args[]){
		double meters;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value in meters = ");
		meters = sc.nextDouble();
		System.out.println("Value in feet = " + meters*3.28);
	}
}
