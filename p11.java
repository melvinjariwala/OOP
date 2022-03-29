class p11{
	public static void main(String args[]){
		int[][] a = new int[6][6];
		a = randomizeArray(a);
		displayArray(a);
		checkrow(a);
		checkcolumn(a);
	}
	static int[][] randomizeArray(int a[][]){
		for(int i = 0; i<a.length; i++){
			for(int j = 0; j<a[i].length; j++){
				a[i][j] = (int)(Math.random() * 2);
			}
		}
		return a;
	}
	static void displayArray(int a[][]){
		for(int i = 0; i<a.length; i++){
			for(int j = 0; j<a[i].length; j++){
				System.out.print(a[i][j] + (" "));
			}
			System.out.println();
		}
	}
	static void checkrow(int a[][]){
		int i, j;
		for(i = 0; i<a.length; i++){
			int cnt = 0;
			for(j = 0; j<a[i].length; j++){
				if(a[i][j] == 1){
					cnt++;
				}
			}
			if(cnt%2 != 0)
			System.out.println("Row " + (i+1) + " has odd 1's");
		}
	}
	static void checkcolumn(int a[][]){
		int i, j;
		for(i = 0; i<a[i].length; i++){
			int cnt = 0;
			for(j = 0; j<a.length; j++){
				if(a[j][i] == 1){
					cnt++;
				}
			}
			if(cnt%2 != 0)
			System.out.println("Column " + (i+1) + " has odd 1's");
		}
	}
}
