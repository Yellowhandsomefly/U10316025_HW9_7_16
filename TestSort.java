public class TestSort{
	/**Main method*/
	public static void main(String[] args){
		System.out.println("the origin: ");
		
		/**Declare a two-dimensional array*/
		int[][] array = {{4, 2},{1, 7},{4, 5}, {1, 2}, {1, 1}, {4, 1}};
		print(array);
		System.out.println("the process of sort: ");
		
		/**Invoke sort method to sort the array*/
		sort(array);
		
		/**Print the sorting result*/
		System.out.println("the result: ");
		print(array);
		
	}
	/**Sort method to sort array*/
	public static void sort(int[][] m){
		
		/**bubble sorting*/
		for(int counter = 0; counter < 5; counter++){
			for(int i = 0; i < 5 - counter; i++){
				
				/**if the number in this row and the first column is more than 
				*the number in next row and the first column, exchange their rows. 
				*/
				if(m[i][0] > m[i + 1][0]){
					int tempRow1[] = m[i];
					m[i] = m[i + 1];
					m[i + 1] = tempRow1;
					print(m);
				}
				
				/**if the number in this row and the second column is more than 
				*the number in next row and the second column and 
				*the number in this row and the first column is more than 
				*the number in next row and the first column, exchange their rows. 
				*/
				if(m[i][0] >= m[i + 1][0] && m[i][1] >= m[i + 1][1]){
					int tempRow2[] = m[i];
					m[i] = m[i + 1];
					m[i + 1] = tempRow2;
					print(m);
				}
			}
		}
	}
	/**Print method to print array*/
	public static void print(int n[][]){
		
		/**print a pair of elements*/
		for(int i = 0; i < 6; i++){
			System.out.print("{" + n[i][0] + ", " + n[i][1] + "} ");
		}
		/**Change line*/
		System.out.println();
	}
}
