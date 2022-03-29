import java.util.*;
class sixth{
	public static void main(String args[]){
		char a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character : ");
		a = sc.next().charAt(0);
		if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U'){
			System.out.println("Entered character is vowel.");
		}
		else{
			System.out.println("Entered character is consonant.");
		}
	}
}
