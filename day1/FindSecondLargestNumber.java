package week2.day1;

import java.util.Arrays;

public class FindSecondLargestNumber {

	public static void main(String[] args) {

		int []data= {3,2,11,4,6,9};

		Arrays.sort(data);

		System.out.println("The Second largest number is : "+data[data.length-2]);

	}

}
