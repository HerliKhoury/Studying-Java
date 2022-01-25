package javaBoiLesson1;

import java.util.Scanner;
import java.util.Locale;

public class Exercício_2_6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, aTriangulo, aCirculo, aTrapezio, aQuadrado, aRetangulo, pi = 3.14159;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		sc.close();
		
		aTriangulo = (A * C) / 2;
		aCirculo = pi * Math.pow(C, 2);
		aTrapezio = ((A + B) / 2) * C;
		aQuadrado = Math.pow(B, 2);
		aRetangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", aTriangulo);
		System.out.printf("CIRCULO: %.3f%n", aCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", aTrapezio);
		System.out.printf("QUADRADO: %.3f%n", aQuadrado);
		System.out.printf("RETANGULO: %.3f%n", aRetangulo);

	}

}
