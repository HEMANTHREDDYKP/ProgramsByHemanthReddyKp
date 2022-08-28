package g;

public class PrintingPrimNoFRom1To100ScondWay {

	public static void main(String[] args) {

		for(int i=2;i<=10;i++) {
			boolean iamPrime=true;
			
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					iamPrime=false;
					break;
				}
			}
			if(iamPrime) {
				System.out.println(i);
			}	
		}
		
		
	
	}

}
