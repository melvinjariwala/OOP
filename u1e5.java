import java.util.Scanner;
class u1e5{
	public static void main(String args[]){
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		a = sc.nextInt();
		if(a>0){
			System.out.println("Number is Positive");
		}
		else if(a < 0){
			System.out.println("Number is Negative");
		}
		else{
			System.out.println("Zero");
		}
	}
}
