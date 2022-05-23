import java.util.Scanner;
class ninth{
	public static void main(String args[]){
		int a, b, ans;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number-1 : ");
		a = sc.nextInt();
		System.out.println("Enter Number-2 : ");
		b = sc.nextInt();
		ans = gcd(a, b);
		System.out.println("GCD = " + ans);
	}
	static int gcd(int num1, int num2){
		int val=0;
		for(int i = 2; i <= num1 && i <= num2; i++){
			if(num1 % i == 0 && num2 % i == 0){
				val = i;			
			}
		}
		return val;
	}
}
