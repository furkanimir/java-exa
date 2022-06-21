import java.util.ArrayList;

public class direk {
	
	public static void main(String args[]) {
		
		int sayi=12345678;
		int a=0;
		int sayac=0;
		
		
		ArrayList<Integer> dick = new ArrayList<Integer>();
		
		while((sayi%10)>0) {
			a=sayi%10;
			sayi=sayi/10;
			dick.add(a);
			sayac++;
		}
		System.out.print("deneme : ");
		System.out.println(dick);
		
		
		/*int k=dick.size()-2;
		
		for(int i =0;i<sayac/2;i++) {
			System.out.print(dick.get(k)+" ");
			k=k+1;
			System.out.print(dick.get(k)+" ");
			k=k-3;
		}
		*/
		
		
		
	}

}
