package ProgramsForGenric;

public class SwappingOfNumbers {

	public static void main(String[] args) {

	/*	int a=2;
		int b=3;
		System.out.println("before swapping a:"+a+" b:"+b );
		int t=a;
		a=b;
		b=t;
		System.out.println("after swapping a:"+a+" b:"+b ); */
		
//second way
		/* int a=10;
		int b=20;
		System.out.println("before swapping a:"+a+" b:"+b );
		a=a+b; //30
		b=a-b;//30-20
		a=a-b; //30-10
		System.out.println("after swapping a:"+a+" b:"+b ); */
//third way
		
		int a=10;
		int b=20;
		System.out.println("before swapping a:"+a+" b:"+b );
		 b=a+b-(a=b);
		 System.out.println("after swapping a:"+a+" b:"+b );
	}

}
