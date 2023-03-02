package LAB_3;

import java.util.Scanner;

import homework.ifElse_2;


public class exercise_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[101];
		int i, count=0;
		
		System.out.println("Enter the integer between 1 to 100 : ");
		for (i = 1; i < 100; i++) {
			array[i] = input.nextInt();	

			if(array[i]==0) {
				break;
			}		
		}	
		
//			while(count!=0) {
//		if(count > 0 && count < 100) {
//			array[count]++;
//		
//			}
//		
//		}
//			
			for (i = 0; i < 100; i++) {
				if (array[i] ==  i) {
					count++;
				}
			System.out.println(array[i] +" occurs " + count + " times");
						}
	} 
}
