import java.io.*;
import java.util.*;

public class Azizmahmut {
	
	public static void main(String args[])throws FileNotFoundException {
		
		//amac txt'yi javaya çekme
		
		/*Scanner input = new Scanner(new File("sayilar.txt"));
		String text = null;
		for(int i=0;i<6;i++) {
		if(input.hasNext()) {
			text=input.next();
		}
		System.out.println(text);
		}//for
	*/	
		
		
		Scanner input=new Scanner(new File("weather.txt"));
		double prev=input.nextDouble();
		String line = input.nextLine();
		for(int i=0;i<7;i++) {
			double next=input.nextDouble();
			System.out.println(prev+" to "+next+", change="+(next-prev));
			prev=next;
		}
		System.out.println(line);
	}
	

}
