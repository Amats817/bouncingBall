package intro_II;

import java.util.Scanner;

public class BouncingBall {

	public static void main(String[] args) {
		// Mark Joshua Sto Domingo
		// COSC 2430
		// Project#1
		// Feb 5
		// program that simulates a bouncing ball by computing its height in feet at
		// each second as time passes on a simulated clock.

		Scanner velocity = new Scanner(System.in);

		// declare variables
		System.out.println("Enter the initial velocity of the ball: ");
		double Velocity = velocity.nextDouble();
		double height = 0;
		int bounce = 0;

		//this loop acts as a timer
		for (int t = 0; t > -1; t++) {

			//prints the output
			System.out.println("Time " + t + " Height:" + height + "ft. ");

			//Bouncing Equation
			if (t >= 0) {
				height = height + Velocity;
				Velocity = Velocity - 32.0;
			}

			//Simulates bounce when height hits 0
			//counts how many bounces have occurred
			if (height < 0) {
				height = height * -0.5;
				Velocity = Velocity * -0.5;
				System.out.println("Bounce!!");
				bounce++;
			}

			//stops the loop at 5th bounce
			if (bounce == 5) {
				break;
			}

		}
		System.out.println("Press any key to continue...");
	}

}
