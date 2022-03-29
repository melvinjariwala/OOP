import java.util.Scanner;
class second{
	public static void main(String args[]){
		double a, b, c, d, e, f, x, y;
		System.out.println("Input will be taken in the format of ax+by=e and cx+dy=f");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a = ");
		a = sc.nextDouble();
		System.out.println("Enter b = ");
		b = sc.nextDouble();
		System.out.println("Enter e = ");
		e = sc.nextDouble();
		System.out.println("Enter c = ");
		c = sc.nextDouble();
		System.out.println("Enter d = ");
		d = sc.nextDouble();
		System.out.println("Enter f = ");
		f = sc.nextDouble();
		x = ((e*d)-(b*f))/((a*d)-(b*c));
		y = ((a*f)-(e*c))/((a*d)-(b*c));
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
	}
}
