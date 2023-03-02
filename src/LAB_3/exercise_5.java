package LAB_3;

public class exercise_5 {

	public static void main(String[] args) {
		int[] arr = new int[100];
		int i, tempLarge = 0, tempSmall=0;
	  
		//
		for (i=0; i<arr.length ;i++)   
		{  
			arr[i] = (int) (1 + Math.random()*100); 
		    System.out.println("array["+i+"] = "+arr[i]);  
		}
		
		
		double max =arr[0];
		for ( i = 0; i < arr.length; i++) {
			if (arr[i]>max) {  
				 max = arr[i];
			}
			if (arr[i] == max) {
				tempLarge = i;
			}
			

		}
//		for (i = 0; i < arr.length; i++) {
			
		System.out.println("The largest element is "+max+" and index number is "+ tempLarge);
		
		double min = arr[0];
		for ( i = 0; i < arr.length; i++) {
			if (arr[i]<min) {  
				min = arr[i];
				if (arr[i] == min) {
					tempSmall = i;
				}
				
			}

		}
		System.out.println("The smallest element is : "+min+" and index number is "+ tempSmall);
		
		
}
}
