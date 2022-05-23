import java.util.Scanner;
class tenth{
	public static void main(String args[]){
		int[] a = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < a.length; i++){
			System.out.print("Enter Number-" + (i+1) + " : ");
			a[i] = sc.nextInt();
		}
		System.out.println("Before : ");
		printArray(a);
		a = reverse(a);
		System.out.println("\nAfter : ");
		printArray(a);
	}
	static int[] reverse(int[] a){
		int[] b = new int[a.length];
		for(int i = a.length-1, j = 0;  j < a.length; i--, j++){
			b[j] = a[i];
		}
		return b;
	}
	static void printArray(int[] a){
		for(int i : a){
			System.out.print(i + "\t");
		}
		System.out.println();
	}
}
