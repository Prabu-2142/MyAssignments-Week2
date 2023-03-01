package week2.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		String test = "Changeme";

		char[] ch = test.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if(i%2!=0) {
				char upperCase = Character.toUpperCase(ch[i]);
				System.out.print(upperCase+" ");
			}
			else {
				System.out.print(ch[i]+" ");
			}
		}

	}

}
