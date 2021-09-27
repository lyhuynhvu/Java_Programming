package hvuh.ct03pm.java.chapter1;

import java.util.Scanner;

public class Cau4 {
	private static Scanner scanner = new Scanner(System.in);
	private static int n;

	public static int nhapSoDong() {
		System.out.print("Nhap so dong: ");
		n = scanner.nextInt();
		return n;
	}
	
	public static void hinhChuNhat() {
		n = nhapSoDong();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void hinhTamGiac() {
		n = nhapSoDong();
		for (int i = n; i >= 1; i--) {
			for (int k = 1; k <= n - i; k++) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void dongHoCat() {
		do {			
			n = nhapSoDong();
			if(n % 2 == 0)
				System.out.println("So dong phai la so le. Moi nhap lai.");
		} while(n % 2 == 0);
		int t1 = n;
		int t2 = 0;
		for (int i = 1; i <= n; i++) {
			if (t1 > 1) {
				for (int j = 1; j < i; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= t1; k++) {
					System.out.print("*");
				}
				System.out.println();
				t1 = t1 - 2;
				t2 = t1;
			} else {
				for (int l = 1; l <= i - t2; l++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= t2; k++) {
					System.out.print("*");
				}
				System.out.println();
				t2 = t2 + 2;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Chuong Trinh Ve Hinh.");
		System.out.println("---------------------");
		System.out.println("1. Hinh chu nhat.");
		System.out.println("2. Hinh tam giac.");
		System.out.println("3. Hinh dong ho cat.");
		System.out.println("*. Thoat chuong trinh.");
		System.out.print("Ban chon: ");
		int chon = scanner.nextInt();
		switch (chon) {
		case 1:
			hinhChuNhat();
			break;
		case 2:
			hinhTamGiac();
			break;
		case 3:
			dongHoCat();
			break;
		default:
			break;
		}
		System.out.println("Ket thuc chuong trinh!");
	}
}
