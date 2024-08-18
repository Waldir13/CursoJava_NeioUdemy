package Section6;

import java.util.Scanner;


public class exe10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("How many rows do you wanna print?");
		int x = sc.nextInt();
		
		for(int i = 1; i <= x; i++) {
			
			int first = i;
			int second = i * i;
			int third = i * i * i;
			
			System.out.println("row - square - cube");
			System.out.printf("%d      %d        %d\n",first,second,third);
		}
		
		
		
		
		sc.close();

	}

}
