package controlFlow;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		/*
		 * System.out.println("Hello World!"); AsciiChars.printNumbers();
		 * AsciiChars.printUpperCase(); AsciiChars.printLowerCase();
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = input.nextLine();
		System.out.printf("Hello %s! This program will generate some lottery numbers.\n", name);
		System.out.println("Do you wish to continue?");
		String answer = input.nextLine();		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			System.out.println("What is the name of your favorite pet?");
			String petName = input.nextLine();
			System.out.println("What is the age of your favorite pet in human years?");			
			int petAge = Integer.parseInt(input.nextLine());
			System.out.println("What is your favorite number between 1 and 20?");
			int luckyNumb = Integer.parseInt(input.nextLine());
			System.out.println("What is your favorite quarerback's jersey number?");
			int quartNumb = Integer.parseInt(input.nextLine());
			System.out.println("What is the two-digit model year of your car?");
			int carYear = Integer.parseInt(input.nextLine());
			System.out.println("What is the first name of your favorite singer?");			
			String singer = input.nextLine();
			System.out.println("Now, enter a random number between 1 and 50.");
			int randoInput = Integer.parseInt(input.nextLine());	
			
			Random random = new Random();
			int randoNumb1 = random.nextInt(65) + 1;
			int randoNumb2 = random.nextInt(65) + 1;
			int randoNumb3 = random.nextInt(65) + 1;
			
			int magicBall = luckyNumb + randoNumb1 - randoNumb2 + randoNumb3;			
			if (magicBall > 75) {
				magicBall = magicBall - 75;
			}
			char petNameChar = petName.charAt(2);
			int lotto1 = petNameChar;
			if (lotto1 > 75) {				
				lotto1 = lotto1 - 75;
			}
			int lotto2 = randoInput + randoNumb2;
			if (lotto2 > 75) {				
				lotto2 = lotto2 - 75;
			}
			char singerChar = singer.charAt(0);
			int lotto3 = singerChar;
			if (lotto3 > 75) {
				lotto3 = lotto3 - 75;
			}
			int lotto4 = singer.charAt(singer.length() - 1);
			if (lotto4 > 75) {
				lotto4 = lotto4 - 75;
			}
			int lotto5 = petAge + carYear;
			if (lotto5 > 75) {
				lotto5 = lotto5 - 75;
			}
			int lotto6 = quartNumb;
			if (lotto6 > 75) {
				lotto6 = lotto6 - 75;
			}
			
			System.out.printf("Here are your lottery numbers: %d, %d, %d, %d, %d, %d. Magicball: %d", lotto1, lotto2, lotto3, lotto4, lotto5, lotto6, magicBall);	
			
		} else {
			System.out.printf("No problem %s, maybe another day!", name);
			input.close();
		
		} 
		input.close();
	}
}
