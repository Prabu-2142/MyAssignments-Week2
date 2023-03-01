package week2.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester";
		String[] split = test.split(" ");
		for (int i = 0; i < split.length; i++) {
			if(i%2!=0) {
				char[] ch = split[i].toCharArray();
				String rev="";
				for (int j = ch.length-1; j >=0; j--) {
					rev = rev + ch[j];
				}
				
				System.out.print(rev+" ");
			}
			else {
				System.out.print(split[i]+" ");
			}
		}

	}

}
