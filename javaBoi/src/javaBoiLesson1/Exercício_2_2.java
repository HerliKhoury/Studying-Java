package javaBoiLesson1;

import java.util.Scanner;
import java.util.Locale;

public class Exercício_2_2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double pi =  3.14159;
		double raio;
		
		
		raio = sc.nextDouble();
		sc.close();
		
		double area = pi * (Math.pow(raio, 2));
		System.out.printf("Area total = %.4f %n", area);
	}
}
