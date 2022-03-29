import java.util.Random;
class p12{
	public static void main(String args[]){
		Random random = new Random(1000);
		for(int i = 0; i < 49; i++){
			System.out.print(random.nextInt(49) + "\t");
		}
		System.out.println();
	}
}
