package Section5;

import java.util.Scanner;

public class exe04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter what time you started the game:");
		int started = sc.nextInt();
		System.out.println("now, what time you fineshed: ");
		int fineshed = sc.nextInt();
		
		int gameDuration;
		
		if(started < fineshed) {
			gameDuration = fineshed - started;
		}
		
		else if(started > fineshed) {
			gameDuration = 24 - started + fineshed;
		}
		
		else {
			gameDuration = 24;
		}
		
		
		System.out.println("The duration of your game was: " +  gameDuration + "hs");
		
		sc.close();
		

	}

}
