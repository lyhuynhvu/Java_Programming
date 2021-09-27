package hvuh.ct03pm.java.chapter1;

import java.util.Scanner;

public class Cau3 {
	private static Scanner scanner = new Scanner(System.in);
	private static int n;
	
	public static void input() {
		System.out.print("Nhap so thang: ");
		n = scanner.nextInt();
	}
	
	public static void checkAndShow() {
		switch (n) {
		case 1:
			System.out.println("Thang mot - January");
			break;
		case 2:
			System.out.println("Thang hai - February");
			break;
		case 3:
			System.out.println("Thang ba - March");
			break;
		case 4:
			System.out.println("Thang tu - April");
			break;
		case 5:
			System.out.println("Thang nam - May");
			break;
		case 6:
			System.out.println("Thang sau - June");
			break;
		case 7:
			System.out.println("Thang bay - July");
			break;
		case 8:
			System.out.println("Thang tam - August");
			break;
		case 9:
			System.out.println("Thang chin - September");
			break;
		case 10:
			System.out.println("Thang muoi - Ortober");
			break;
		case 11:
			System.out.println("Thang muoi mot - November");
			break;
		case 12:
			System.out.println("Thang muoi hai- December");
			break;
		default:
			System.out.println("Thang nhap vao khong hop le!");
			break;
		}		
	}
	
	public static void main(String[] args) {
		System.out.println("Chuong Trinh Hien Thi Ten Thang.");
		System.out.println("--------------------------------");
		input();
		checkAndShow();
	}
}
