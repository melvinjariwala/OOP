import java.util.Scanner;
//import java.lang.Math;
class u1e6{
	public static void main(String args[]){
		double a, b, c, D, r1, r2;
		System.out.println("Inupt format : ax^2 + bx + c = 0");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a = ");
		a = sc.nextDouble();
		System.out.println("Enter b = ");
		b = sc.nextDouble();
		System.out.println("Enter c = ");
		c = sc.nextDouble();
 		D = ((b*b)-(4*a*c));
		D = Math.sqrt(D);	//Determinant
		System.out.println("D = " + D);
		r1 = (-b+D)/(2*a);	//Root-1
		r2 = (-b-D)/(2*a);	//Root-2
		System.out.println("Root 1 = " + r1 + "\nRoot 2 = " + r2);
	}
}
