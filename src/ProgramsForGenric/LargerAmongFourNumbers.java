package ProgramsForGenric;

public class LargerAmongFourNumbers {

	
	public static void main(String[] args) {
		
		int a=0;
		int b=10;
		int c=90;
		int d=860;
		
		if(a>b) {
			if(a>c) {
				if(a>d) {
					System.out.println("a");
				}
				else {
					System.out.println("d");
				}
			}
			else if(c>a) {
				if(c>d) {
					System.out.println("c");
				}
				else {
					System.out.println("d");
				}
			}
			
		}
		else if(b>c) {
			if(b>d) {
				System.out.println("b");
			}
			else {
				System.out.println("d");
			}
		}
		else if (c>d) {
			System.out.println("c");
			
		}
		else {
			System.out.println("d");
		}
		
		
		
		}
		
		
	}

