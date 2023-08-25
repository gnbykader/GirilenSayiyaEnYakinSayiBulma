import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int[] dizi = {12,-32,-2,21,13,67,33};
		Arrays.sort(dizi);
		System.out.println(Arrays.toString(dizi));
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Bir Sayi Giriniz: ");
		int sayi = inp.nextInt();
		
		int hedefKucuk = sayi;
		int hedefBuyuk = sayi;
		
		
		for (int i : dizi) {
			if (sayi < i) {
				hedefBuyuk = i;
				break;
				
			}
		}
		for (int i = dizi.length -1 ; i  >= 0 ; i--) {
			if (sayi > dizi[i]) {
				hedefKucuk = dizi[i];
				break;			
			}
		}
		System.out.println("Girilen sayidan buyuk en yakin sayi: "+hedefBuyuk);
		System.out.println("Girilen sayidan kucuk en yakin sayi: "+hedefKucuk);

		

	}

}
