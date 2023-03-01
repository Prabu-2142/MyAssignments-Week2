package week2.day1;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		
		int input[]= {2,5,3,1,4,5,7,6,3,2};
		
		for (int i = 0; i < input.length-1; i++) {
			
			for (int j = i+1; j < input.length; j++) {
				
				if(input[i]==input[j]) {
					
					System.out.println(input[i]);
				}
			}
		}
	}

}
