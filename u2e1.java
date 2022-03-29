import java.util.Scanner;
class u2e1{
	public static void main(String args[]){
		int a, b;
		char op;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a : ");
		a = sc.nextInt();
		System.out.print("Operator : ");
		op = sc.next().charAt(0);
		System.out.print("Enter b : ");
		b = sc.nextInt();
		switch(op){
			case '+':
				System.out.println("Sum = " + (a+b));
				break;
			case '-':
				System.out.println("Subtraction = " + (a-b));
				break;
			case '*':
				System.out.println("Product = " + (a*b));
				break;
			case '/':
				System.out.println("Division = " + (a/b));
				break;
			case '^':
				System.out.println("Result = " + (int)Math.pow((double)a,(double)b));
				break;
			default:
				System.out.println("Invalid operator");
				break;
		}
	}
}
