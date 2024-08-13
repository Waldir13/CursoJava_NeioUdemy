package Section6;

import java.util.Scanner;

public class exe01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int correctPassword = 2002;
		
		
		int password = sc.nextInt();
		
		while(password != correctPassword) {
						
			System.out.println("Incorrect password!");
			password = sc.nextInt();
			
			
		}
		
		System.out.println("Correct password");

		
		sc.close();		
	}

}
