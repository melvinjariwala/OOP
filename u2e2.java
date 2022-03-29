

//Warning : Incomplete Code


import java.util.Scanner;
class u2e2{
	public static void main(String args[]){
		int marks, total = 0, result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks out of 100 : \n");
		do{
			System.out.print("Enter marks of Subject-1 : ");
			marks = sc.nextInt();
			total = total + marks;
			
		}while(marks>100 || marks<0);
	}
}
