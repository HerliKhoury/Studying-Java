package javaBoiLesson1;

import java.util.Scanner;
import java.util.Locale;

public class Exercício_2_4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int funcionarioId, horasTrabalhadas;
		float precoHora;
		
		funcionarioId = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		sc.nextLine();
		precoHora = sc.nextFloat();
		sc.close();
		
		System.out.printf("NUMBER = %d%n", funcionarioId);
		System.out.printf("SALARY = U$ %.2f%n", horasTrabalhadas * precoHora);
		
		
	}

}
