package PrimeirosTestes;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products:");
		System.out.println(product1 + " which price is $: " + price1);
		System.out.println(product2 + " which price is $: " + price2);

		System.out.println("Record: " + age + " years old, code " + code + " gender " + gender);

		System.out.printf("Measue with eight decimal places: %.8f\n", measure);
		System.out.printf("Rouded (three decimal places %.3f\n", measure);

		Locale.setDefault(Locale.US);
		System.out.print("Rouded (three decimal places" + measure);

	}

}
