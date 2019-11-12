package Lounge;

import java.util.Random;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {


		// Choose username
		System.out.println("enter your username: ");
		Scanner nick = new Scanner(System.in);
		String username =nick.nextLine();
		System.out.println("welcome " + username);
		
		// Put in the infinite loop for the next section
		for(;;) {
				
		//scanner on
		Scanner chat = new Scanner(System.in);
		String chatInfo= chat.nextLine();
			
				
		//Command to write
		System.out.println(username + " : " + chatInfo);
				
				
		
		
		
		
		
	}

}
}