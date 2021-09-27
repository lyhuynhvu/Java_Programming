package hvuh.ct03pm.java.chapter1;

import java.util.Scanner;

public class Cau5 {
	private static Scanner scanner = new Scanner(System.in);
	private static int a, b, a1, b1;
	
	public static void input() {
		System.out.print("Nhap so nguyen duong a: ");
		a = scanner.nextInt();
		System.out.print("Nhap so nguyen duong b: ");
		b = scanner.nextInt();		
	}
	
	public static void main(String[] args) {
		System.out.println("Chuong Trinh Tinh UCLN & BCNN.");
		System.out.println("------------------------------");
		input();
		a1 = a;
		b1 = b;
		while(b!=0)
		{
			int r = a % b;
			a = b;
			b = r;
		}
		System.out.println("USCLN = " + a);
		System.out.println("BSCLN = " + a1 * b1 /a);
	}
}
