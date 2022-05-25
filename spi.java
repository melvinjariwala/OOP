
import java.util.Scanner;

public class spi {
	public static void main(String[] args) {
		int id_no, grades_obtained;
		double spi;
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of students : ");
		int n = sc.nextInt();
		student s[] = new student[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Student-" + (i+1) + " : \n" + "Enter id : ");
			id_no = sc.nextInt();
			System.out.print("Enter grades obtained : ");
			grades_obtained = sc.nextInt();
			s[i] = new student(id_no, grades_obtained);
			spi = s[i].calculate_spi(grades_obtained);
			s[i].display(spi);
		}
	}
}
class student{
	int id_no, grades_obtained, credits;
	double spi;
	student(int id_no, int grades_obtained){
		this.id_no = id_no;
		this.grades_obtained = grades_obtained;
	}
	public double calculate_spi(int grades_obtained){
		int credits = 5;
		double spi = (double)grades_obtained/(double)credits;
		return spi;
	}
	public void display(double spi) {
		System.out.println("spi : " + spi);
	}
}