import java.util.Scanner;
class eight{
	public static void main(String args[]){
		int a, i = 2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		a = sc.nextInt();
		do{
			if(a%i == 0){
				a = a / i;
				System.out.print(i+" ");
			}
			else{

				i++;
				continue;
			}
		}while(a/i!=0);
		System.out.println();
	}
}
