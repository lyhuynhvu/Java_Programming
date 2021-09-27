package hvuh.ct03pm.java.chapter1;

import java.util.Scanner;
import java.lang.Math;

public class Cau2 {
	private static Scanner scanner = new Scanner(System.in);
	private static double a, b, c;
	private static double delta, x1, x2;
	
	public static void input() {
		System.out.print("Nhap a: ");
		a = scanner.nextInt();
		
		System.out.print("Nhap b: ");
		b = scanner.nextInt();
		
		System.out.print("Nhap c: ");
		c = scanner.nextInt();
	}
	
	public static double deltaCal() {
		return (b * b) - (4 * a * c);
	}
	
	public static void checkInput() {
		if(a == 0) {
			if(b == 0) {
				if(c == 0)
					System.out.println("Phuong trinh vo so nghiem.");
				else
					System.out.println("Loi phuong trinh.");
			}
			else {
				System.out.println("Day la phuong trinh bac nhat (bx + c = 0)");
				System.out.println("Nghiem x = " + (-c/b));
			}
		}
		else
			cal();
	}
	
	public static void cal() {
		if(delta < 0)
			System.out.println("Phuong trinh vo nghiem.");
		else if(delta == 0) {
			x1 = -b/(2 * a);
			System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + x1);			
		}
		else {
			x1 = (- b + Math.sqrt(delta))/(2 * a);
			x2 = (- b - Math.sqrt(delta))/(2 * a);
			
			System.out.println("Phuong trinh co 2 nghiem:");
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}		
	}
	
	public static void main(String[] args) {
		System.out.println("Chuong Trinh Tinh Phuong Trinh Bac 2.");
		System.out.println("-------------------------------------");
		input();
		delta = deltaCal();
		checkInput();
	}
}
