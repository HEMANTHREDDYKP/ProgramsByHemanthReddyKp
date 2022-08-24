package ProgramsForGenric;

public class ReversAnumber {

	public static void main(String[] args) {
int a=12345;
int rev=0;
System.out.println("before reversing number "+a);
while(a!=0) {
	int rem=a%10;
	rev=rev*10+rem;
	a=a/10;
}
System.out.println("reversed number "+rev);
	}

}
