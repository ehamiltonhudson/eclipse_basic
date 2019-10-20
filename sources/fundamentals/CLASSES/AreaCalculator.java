package fundamentals.CLASSES;

import java.util.*;
import java.util.Scanner;

public class AreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Shape Area Calculator");
		
		while(true) {
			System.out.println();
			System.out.println("-=-=-=-=-=-=-=-=-=-");
			System.out.println();
			System.out.println("1) Triangle");
			System.out.println("2) Rectangle");
			System.out.println("3) Circle");
			System.out.println("4) Quit");
			System.out.println();
			
			System.out.print("Which shape: ");
			
			int shape = keyboard.nextInt();
			System.out.println();
			
			if (shape == 1) {
				area_triangle(5,6);
			} else if (shape == 2) {
				area_rectangle(4,5);
			} else if (shape == 3) {
				area_circle(4);
			} else if (shape == 4) {
				quit();
				keyboard.close();
				break;
			}
		}

	}
	
	public static double area_triangle(int base, int height) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Base: ");
		base = keyboard.nextInt();
		System.out.print("Height: ");
		height = keyboard.nextInt();
		System.out.println();
		int Area = (base * height) * 2;
		System.out.println("The area of the triangle is " + Area + ".");
		keyboard.close();
		return Area;
	}
	
	public static double area_rectangle(int length, int width) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Length: ");
		length = keyboard.nextInt();
		System.out.print("Width: ");
		width = keyboard.nextInt();
		System.out.println();
		int Area = length * width;
		System.out.println("The area of the rectangle is " + Area + ".");
		keyboard.close();
		return Area;
	}
	
	public static double area_circle(int radius) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Radius: ");
		radius = keyboard.nextInt();
		System.out.println();
		double Area = Math.PI * radius * radius;
		System.out.println("The area of the circle is " + Area + ".");
		keyboard.close();
		keyboard.close();
		return Area;
	}
	
	public static String quit() {
		System.out.println("Goodbye");
		return null;
	}

}

