
//Summing all elements

package homework_2_Array;

import java.util.Scanner;

public class TwoD3_sum_elements_arr {

	public static void main(String[] args) {
		double[][] arr = new double[100][100];
		Scanner input = new Scanner(System.in);
		int index ;
		System.out.println("Enter number of index : ");
		index = input.nextInt();
		System.out.println("Enter values");
		for (int row = 0; row < index; row++) {
			for (int col = 0; col < index; col++) {
			System.out.print("arr["+ row +"]["+col+"] = ");
			arr[row][col] = input.nextDouble();
		}
			}
		double sum = 0;
		for (int row = 0; row < index; row++) {
			sum=0;
			for (int col = 0; col < index; col++) {
				
			sum = sum + arr[row][col];
		}
			System.out.println("The sum of the row no "+(row+1)+" is : "+sum);

		}

	}

}
