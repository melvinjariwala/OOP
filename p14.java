import java.util.ArrayList;
import java.util.Date;

public class p14 {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(new Loan(10000));
		list.add(new Date());
		list.add(new String ("Practical 14"));
		list.add(new Circle(3.14));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
}


class Loan {
	double amount;
	Loan(double amount){
		this.amount = amount;
	}
	public String toString() {
		return "Loan amount = "+this.amount;
	}
	
}

class Circle {
	double radius;
	Circle(double radius){
		this.radius = radius;
	}
	public String toString(){
		return "Radius of circle = "+this.radius;
	}
}