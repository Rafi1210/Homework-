package LAB_3;

import java.util.Scanner;


public class exercise_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double[] array = new double[100];
		int i ;
		double max, best;
		
		System.out.println("Enter number of students :");
		int index = input.nextInt();
		System.out.println("Enter "+index+" scores : ");
		for( i =0 ;i<index ; i++) {	
			System.out.print("arr["+i+"] = ");
			array[i] = input.nextDouble();
			}
		
		 max = array[0];
		
		for( i =0 ;i<index ; i++) {	
			if(array[i]>max) {
				max = array[i];	
			}
			}
		
		best = max;
		for( i =0 ;i<index ; i++) {
		if (array[i]>=(best-10)) {
			System.out.println("Student "+i+" is "+max+" and grade is A");
		}
		else if (array[i]>=(best-20)) {
			System.out.println("Student "+i+" is "+array[i]+" and grade is B");
		}
		else if (array[i]>=(best-30)) {
			System.out.println("Student "+i+" is "+array[i]+" and grade is C");
		}
		
		else if (array[i]>=(best-40)) {
			System.out.println("Student "+i+" is "+array[i]+" and grade is D");
		}
		else {
			System.out.println("Student "+i+" is "+array[i]+" and grade is F");
		}
	}
	}
}
