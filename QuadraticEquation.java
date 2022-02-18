//
//	Name:			Mark Barros
//	Course:			CS1400 - Intro to Programming and Problem Solving
//	Description:	This project prompts the user for the coefficients a, b, and c of a quadratic equation
//					ax^2 + bx + c = 0 and prints out the solutions. The discriminant is equal to b^2 - 4ac.
//
//

import java.util.Scanner; // Required  for the Scanner class
import java.lang.Math; // Required for Square Root methods

public class QuadraticEquation
{
	public static void main(String[] args)
	{
		System.out.println("M. Barros's Quadratic Equation Solver\n");

		double a, b, c; // The quadratic equation's three coefficients
		double x1 = 0, x2 = 0; // The quadratic equation's two roots

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter values for a b c?\n");

		a = keyboard.nextDouble();
		b = keyboard.nextDouble();
		c = keyboard.nextDouble();

		keyboard.close();

		if (a == 0) {
			System.out.println("Not a quadratic equation.");
			return;
		}
	
		if( ((b*b) - (4*a*c)) < 0 ) {
			System.out.println("Roots are imaginary.");
		}
		else {
			x1 = (-b + Math.sqrt((b*b) - 4*a*c)) / (2*a);
			x2 = (-b - Math.sqrt((b*b) - 4*a*c)) / (2*a);
			System.out.println("x1 = " + x1 + "\n" + "x2 = " + x2);
		}
	}
}
