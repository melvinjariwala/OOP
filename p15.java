import java.util.Scanner;

public class p15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter binary string : ");
		String str = sc.nextLine();
		try {
			System.out.println("Value = " + bin2Dec(str));
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
	}
	public static int bin2Dec(String str) throws NumberFormatException{
		int dec = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) < '0' || str.charAt(i) > '1') {
				throw new NumberFormatException("String is not a binary string.");
			}
			dec += (str.charAt(i) - '0') * Math.pow(2, str.length()-1-i);
		}
		return dec;
	}
}
