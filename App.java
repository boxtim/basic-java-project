import java.util.Scanner;
import java.util.Arrays;

public class App{

	static Shop shop = new Shop();
	static Scanner read = new Scanner(System.in); 

	public static void main(String[] args) {

		boolean isOpen = true;

		System.out.println("APP | Tienda");
		printLine();
		showStock();
		printLine();

		while (isOpen) {
			System.out.println("1 - comprar | 2 - vender | >2 - bodega | 9 - salir");
			int ans = read.nextInt();

			if (ans == 1) {
				makeBuy();
			} else if (ans == 2) {
				makeSell();
			} else {
				showStock();
			}

			if (ans == 9) {
				isOpen = false;
			}

			printLine();
		}


	}

	private static void makeBuy() {
		System.out.println("¿Cuantos tipos de producto desea COMPRAR? (Digite cantidad)");
		int aux = read.nextInt();

		String[] vec = new String[aux];

		for (int i = 1; i <= aux; i++) {
			System.out.println("¿Qué producto desea COMPRAR? (Digite código)");
			int id = read.nextInt();

			System.out.println("¿Qué cantidad desea COMPRAR? (Digite cantidad)");
			int amount = read.nextInt();

			vec[i - 1] = shop.buy(id, amount);

			printLine();
		}

		System.out.println("INFORME DE COMPRA");

		for (int j = 0; j < vec.length ; j++ ) {
			System.out.println(vec[j]);
		}
	}

	private static void makeSell() {
		System.out.println("¿Cuantos tipos de producto tiene en caja? (Digite cantidad)");
		int aux = read.nextInt();

		String[] vec = new String[aux];

		for (int i = 1; i <= aux; i++) {
			System.out.println("¿Qué producto desea VENDER? (Digite código)");
			int id = read.nextInt();

			System.out.println("¿Qué cantidad desea VENDER? (Digite cantidad)");
			int amount = read.nextInt();

			vec[i - 1] = shop.sell(id, amount);

			printLine();
		}

		System.out.println("FACTURA");

		for (int j = 0; j < vec.length ; j++ ) {
			System.out.println(vec[j]);
		}
	}

	private static void showStock() {
		printLine();

		for (Product product : shop.getProducts()) {
			System.out.println(
				product.toString()
			);
		}
	}

	private static void printLine() {
		System.out.println("---------------------------------------------------------");
	}


}