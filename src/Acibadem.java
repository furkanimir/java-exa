import java.io.FileNotFoundException;
import java.util.*;
import java.util.ArrayList;

//import java.util.Scanner;

public class Acibadem {

	public static void main(String args[])throws FileNotFoundException {

		System.out.println("calisiyor");
		// printFibonacciNumbers();
		//printPattern();
		// primeNumbers();//calismadi
		// asal();
		// amstrong();
		//amstrongfati();
		//geometrik(2 , 3);
		//tersCevir(547);
		//System.out.println(isAllPairsSum10(184629));
		powDeneme();
		
		buyukharf();
		
		/*Daire d=new Daire();
		d.alan(4);*/
		
		//SifirileYuzArasindaYediveUceBolunen();
		
		System.out.println("bitti");

	}
	
	public static void SifirileYuzArasindaYediveUceBolunen() {
		
		ArrayList<Integer> a = new ArrayList<>();
		
		
		for(int i=1;i<100;i++) {
			if(i%3 == 0 && i%7 == 0) {
				a.add(i);
			}
			
		}//for
		
		for(int j=0;j<a.size();j++){
			
			System.out.println(a.get(j));
		}//for
	
	}

	public static void buyukharf() {
	
		System.out.print("buraya yazacaginiz harfler buyuk olacaktir ---> ");
		Scanner sc = new Scanner(System.in);
		String a=sc.nextLine();
		a=a.toUpperCase();
		System.out.println(a);
		
	}
	
	public static void powDeneme() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("hangi sayinin ussunu alacaksiniz ?");
		int a=sc.nextInt();
		
		System.out.println("kacinci dereceden ussunu alacaksiniz ?");
		int b=sc.nextInt();
		
		
		double k=Math.pow(a, b);
		System.out.println(k);
		
	}
	
	public static boolean isAllPairsSum10(int n) {
		
		int fakeN=n;
		int tersi=0;
		int ram;
		int r=n;
		int sayac=0;
		int x;
		int y;
		
		
		while(fakeN !=0) {
			fakeN=fakeN/10;
			sayac++;
		}
		
		while(r!=0) {
			ram=r%10;
			r=r/10;
			tersi=tersi*10+ram;
		}
		
		for(int i=0;i<(sayac/2);i++) {
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
	
	public static void tersCevir(int n) {
		
		int r=n;
		int rem;
		int sum=0;
		while(r!=0) {
			rem=r%10;
			r=r/10;
			sum=sum*10+rem;		
		}
		System.out.println(sum);
		
	}

	public static void geometrik(double r,double n) {

		double k = r;
		double sum = 1;
		for (int j = 0; j < n; j++) {
			for (int i = 1; i < (n - j); i++) {
				k *= r;
			}
			sum = sum + k;
			k = r;
		}
		System.out.println(sum);
	}

	public static void amstrongfati() {
		int sayi, x, a, sum;

		// kanka else kýsmýný sil sadece amstronglarý göstercek, bana böle biþiyi
		// yaptýrdýðýn için tþk

		for (sayi = 0; sayi < 1000; sayi++) {
			x = sayi;
			sum = 0;
			while (x != 0) {
				a = x % 10;
				sum += a * a * a;
				x = x / 10;
			}
			if (sum == sayi)
				System.out.println(sayi + "Amstrong sayisi");
			// else
			// System.out.println(sayi+"Amstrong sayisi degil");
		}
	}

	public static void primeNumbers() {
		int z = 8;
		if (z == 1) {
			System.out.println("Asal degildir");
		} else if (z == 2) {
			System.out.println("Asaldir");
		} else {
			for (int i = 2; i < z; i++) {
				int q = z % i;
				if (q == 0) {
					System.out.println("Asal degildir");
				}
				else {
					System.out.println("Asaldir");
				}

			} // for
		}

	}

	public static void asal() {
		int x = 18;
		int sayac = 0;
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				sayac++;
			}
		}
		if (sayac == 0) {
			System.out.println("Asaldir");
		} else {
			System.out.println("Asal degildir");
		}
	}

	public static void printFibonacciNumbers() {
		int x1 = 0;
		int x2 = 1;
		int sayi = 12;
		int k = 1;

		System.out.print(k + " ");
		for (int i = 2; i <= sayi; i++) {
			k = x1 + x2;
			x1 = x2;
			x2 = k;

			System.out.print(k + " ");

		}
		System.out.println();
	}

	public static void printPattern() {
		 Scanner sc = new Scanner(System.in);
		 int h = sc.nextInt();
		//int h = 5;
		int x = (2 * h - 1);

		for (int a = 0; a < h; a++) {

			for (int r = 0; r < a * 2; r++) {
				System.out.print("\\");
			}
			for (int i = 1; i <= x; i++) {
				System.out.print("!");
			}
			for (int j = 1; j <= x; j++) {
				System.out.print("!");
			}
			for (int r = 0; r < a * 2; r++) {
				System.out.print("/");

			}
			System.out.println();
			x = x - 2;

		} // son for bitti

	}

}