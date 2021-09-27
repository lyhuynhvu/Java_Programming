package hvuh.ct03pm.java.chapter1;

import java.util.Scanner;

public class Cau6 {
	private static Scanner scanner = new Scanner(System.in);
	private static int n;
	
	public static void input() {
		System.out.print("Nhap 1 so nguyen: ");
		n = scanner.nextInt();		
	}
	
	public static void timUocSo() {
		for(int i = 1; i <= n; i++)
			if(n % i == 0)
				System.out.print(i + " ");		
	}
	
	public static void main(String[] args) {
		System.out.println("Chuong Trinh Tinh Cac Uoc So.");
		System.out.println("-----------------------------");
		input();
	    System.out.print("Cac uoc so cua " + n + " la: ");
	    timUocSo();
	}
}
