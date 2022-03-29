import java.util.Scanner;
class u1e4{
	public static void main(String args[]){
		double c, f;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Temperature in Celsius : ");
		c = sc.nextDouble();
		f = ((1.8*c)+32);
		System.out.println("Temperature in Farenheit : " + f);
	}
}
