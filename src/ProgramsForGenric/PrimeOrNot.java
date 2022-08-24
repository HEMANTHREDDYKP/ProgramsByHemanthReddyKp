package ProgramsForGenric;

public class PrimeOrNot {

	public static void main(String[] args) {
        
		int count =0;
		int a=14;
		if(a>1) {
			for(int i=1;i<=a;i++) {
				if(a%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("prime");
			}
			else {
				System.out.println("not a prime");
			}
		}
	}

}
