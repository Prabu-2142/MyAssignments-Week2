package week2.day1;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {

		int [] arr= {1,2,3,4,7,6,8};

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]+" ");
		}
		for (int j = 0; j < arr.length; j++) {
			
			if(arr[j]!=j+1){
				
				System.out.println("The missing element is :"+(j+1));
				break;
			}
		}

	}

}


