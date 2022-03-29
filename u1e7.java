import java.util.Scanner;
class u1e7{
	public static void main(String args[]){
		int marks;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.print("Enter marks (out of 100) = ");
			marks = sc.nextInt();
			
		}while(marks>100 || marks<0);
		if(marks >= 35){
			System.out.println("Pass");
		}
		else{
			System.out.println("Fail");
		}
	}
}
