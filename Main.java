package Java;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String islemler = "1- TOPLAMA\n"
							+"2- CIKARMA\n"
						  	+"3- CARPMA\n"
						  	+"4- BOLME\n";

			System.out.println(islemler);
			System.out.println("ISLEMI SECIN: ");
			String islem = sc.nextLine();
			
			
			switch (islem) {
				case "1":
					System.out.print("1. Sayiyi Girin: ");
					int a = sc.nextInt();
					System.out.print("2. Sayiyi Girin: ");
					int b = sc.nextInt();
					System.out.print("Sonuc: "+ (a+b));
					break;
				case "2":
					System.out.print("1. Sayiyi Girin: ");
					int a1 = sc.nextInt();
					System.out.print("2. Sayiyi Girin: ");
					int b1 = sc.nextInt();
					System.out.print("Sonuc: "+ (a1-b1));
					break;
				case "3":
					System.out.print("1. Sayiyi Girin: ");
					int a2 = sc.nextInt();
					System.out.print("2. Sayiyi Girin: ");
					int b2 = sc.nextInt();
					System.out.print("Sonuc: "+ (a2*b2));
					break;
				case "4":
					System.out.print("1. Sayiyi Girin: ");
					int a3 = sc.nextInt();
					System.out.print("2. Sayiyi Girin: ");
					int b3 = sc.nextInt();
					System.out.print("Sonuc: "+ ((double)a3/b3));
					break;
				default:
					System.out.print("Lutfen gecerli bir deger giriniz!");
					break;
			}

		}
		
	}

}
