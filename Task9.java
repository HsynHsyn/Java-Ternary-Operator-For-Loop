/* Write a Java program to create pattern
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5 */


package Day10_Ternary_Operator_For_Loop;

public class Task9 {

	public static void main(String[] args) {

		for (int i=1; i<=5; i+=1) {
			
			for (int j=1; j<=i; j+=1) {
				
				System.out.print(j+ " ");
			
						}
			System.out.println();

		}
		
	}

}
