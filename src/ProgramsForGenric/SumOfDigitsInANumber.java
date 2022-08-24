package ProgramsForGenric;

public class SumOfDigitsInANumber {

	public static void main(String[] args) {
int a=12345;
int rev=0;
while(a!=0) {
	int rem=a%10;
	rev=rev+rem;
	a=a/10;
}
System.out.println("sum of numbers "+rev);
	}

}
