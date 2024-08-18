package Section6;

import java.util.Scanner;

public class exe08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What's factorial do you wanna find out?");
		int x = sc.nextInt();
		
		int fat = 1;
		for (int i=1; i<=x; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		
		
		
		
		
		sc.close();
	}

}
