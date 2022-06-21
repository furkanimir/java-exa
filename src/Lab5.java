
public class Lab5 {

	public static void main(String[] args) {

		System.out.println(isAllPairsSum10(1));			// true, because one digit
		
		System.out.println(isAllPairsSum10(614));		// true, because 6+4=10 
		
		System.out.println(isAllPairsSum10(3557));		// true, because 3+7=10 and 5+5=10
		
		System.out.println(isAllPairsSum10(184629));	// true, because 1+9=10, 8+2=10, and 4+6=10
		
		System.out.println(isAllPairsSum10(247398));	// false, because 4+9 is not equal to 10, even though 2+8=10 and 7+3=10
		
	}

	public static boolean isAllPairsSum10(int n) {
		
		int fake=n;
		int tersi=0;
		int ram;
		int r=n;
		int basamak=0;
		int x;
		int y;
		
		
		while(fake !=0) {
			fake=fake/10;
			basamak++;
		}
		
		while(r!=0) {
			ram=r%10;
			r=r/10;
			tersi=tersi*10+ram;
		}
		
		for(int i=0;i<(basamak/2);i++) {
			x=n%10;
			y=tersi%10;
			if((x+y)!=10) {
				return false;
			}
			else {
				n=n/10;
				tersi=tersi/10;
			}
		}//for
		
		return true;
	
	}//method
	
}
