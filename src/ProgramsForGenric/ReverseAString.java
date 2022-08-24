package ProgramsForGenric;

public class ReverseAString {

	public static void main(String[] args) {

		String name="hemanth";
		String rev=" ";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println("reversed string "+rev);
	}

}
