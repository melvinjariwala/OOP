import java.util.Scanner;

public class p13 {
	public static void main(String[] args) {
		System.out.print("Enter the expression : ");
		Scanner sc = new Scanner(System.in);
		String expr = sc.nextLine();
		expr = expr.replaceAll(" ", "");
		int result = 0, i = 0;
		while (expr.charAt(i) != '+' && expr.charAt(i) != '-' && expr.charAt(i) != '*' && expr.charAt(i) != '/') {
			i++;
		}
		char operator = expr.charAt(i);
		switch(operator){
			case '+':
				result = Integer.parseInt(expr.substring(0, i)) + Integer.parseInt(expr.substring(i+1, expr.length()));
				break;
			case '-':
				result = Integer.parseInt(expr.substring(0, i)) - Integer.parseInt(expr.substring(i+1, expr.length()));
				break;
			case '*':
				result = Integer.parseInt(expr.substring(0, i)) * Integer.parseInt(expr.substring(i+1, expr.length()));
				break;
			case '/':
				result = Integer.parseInt(expr.substring(0, i)) / Integer.parseInt(expr.substring(i+1, expr.length()));
				break;
			 
		}
		System.out.println(expr.substring(0, i) + ' ' + operator + ' ' + expr.substring(i+1, expr.length()) + " = " + result);
	}
}
