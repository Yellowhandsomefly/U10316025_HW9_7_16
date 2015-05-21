public class TestSort{
	public static void main(String[] args){
		System.out.println("the origin: ");
		int[][] array = {{4, 2},{1, 7},{4, 5}, {1, 2}, {1, 1}, {4, 1}};
		print(array);
		System.out.println("the process of sort: ");
		sort(array);
		System.out.println("the result: ");
		print(array);
		
	}
	
	public static void sort(int[][] m){
		for(int counter = 0; counter < 5; counter++){
			for(int i = 0; i < 5 - counter; i++){
				if(m[i][0] > m[i + 1][0]){
					int tempRow1[] = m[i];
					m[i] = m[i + 1];
					m[i + 1] = tempRow1;
					print(m);
				}
				if(m[i][0] >= m[i + 1][0] && m[i][1] >= m[i + 1][1]){
					int tempRow2[] = m[i];
					m[i] = m[i + 1];
					m[i + 1] = tempRow2;
					print(m);
				}
			}
		}
	}
	
	public static void print(int n[][]){
		for(int i = 0; i < 6; i++){
			System.out.print("{" + n[i][0] + ", " + n[i][1] + "} ");
		}
		System.out.println();
	}
}
		
	
