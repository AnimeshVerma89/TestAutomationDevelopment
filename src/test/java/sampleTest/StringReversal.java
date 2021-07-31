package sampleTest;

public class StringReversal {

	public static void main(String[] args) {
		
		String s = "My name is Abhishek Kumar";
		
		String str[] = s.split(" ");
		String s1 = "";
		
		for(int i= str.length-1; i>=0; i--) {
			
			s1 = s1 + str[i] + " ";
		}
		
		System.out.println(s1);

	}

}
