package week2.day1;

import java.util.Arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {

		int [] arr= {14,12,13,11,15,14,18,12,16,17,19,18,17,20};
		Arrays.sort(arr);

		System.out.println("The duplicate Elements in the Array are: ");
		for (int i = 0; i < arr.length; i++) {

			for (int j =i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}
}
