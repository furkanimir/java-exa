import java.io.*;
import java.util.*;


public class txtCekme {

	public static void main(String args[]) throws FileNotFoundException {

		Scanner s = new Scanner(new File("sayilar.txt"));
		String isim = "";
		int id = 0;

		while (s.hasNextLine()) {
			isim = s.next();
			id = s.nextInt();
			double calismaSaati = 0;
			double ortSaat = 0.0;
			int sayac = 0;
			if (s.hasNext()) {
				calismaSaati += s.nextDouble();
				sayac++;
			} // if
			else
				ortSaat = calismaSaati / sayac;

			System.out.println(isim + "ID #" + id + " Ortalama calisma saati :" + ortSaat);
		} // while

	}

}
