package hvuh.ct03pm.java.chapter1;

import java.util.Scanner;

public class Cau1 {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Chuong Trinh Kiem Tra So Nguyen");
		System.out.println("-------------------------------");
		System.out.print("Nhap so nguyen: ");
		int n = scanner.nextInt();
		if(n > 0)
			System.out.println("So vua nhap la so duong.");
		else if(n == 0)
			System.out.println("So vua nhap bang 0.");
		else
			System.out.println("So vua nhap la so am.");
	}
}
