package javaBoiLesson1;

import java.util.Scanner;

public class Exercício_2_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		sc.close();
		
		System.out.printf("DIFERENCA = %d%n", A * B - C * D );
		

	}

}
