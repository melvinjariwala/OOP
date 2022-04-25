import java.util.Scanner;

class occurence{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string : ");
		String str = sc.nextLine();
		int[] occurence = new int[str.length()];
		System.out.println("Number of occurences of :");
		for (int i = 0; i < str.length(); i++) {
			if(occurence[i] == 0){
				occurence[i] = numberOfOccurences(str, str.charAt(i), occurence);
				System.out.println(str.charAt(i) + " = " + occurence[i]);
			}
			else{
				continue;
			}
		}
	}
	public static int numberOfOccurences(String str, char key, int[] occurence) {
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == key) {
				result++;
				occurence[i] = result;
			}
		}
		return result;	
	}
}