package javaBoiLesson1;

import java.util.Scanner;

public class newScaner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String s1, s2, s3;

		s1 = sc.nextLine();// Armazena tudo que foi escrito antes de apertar "Enter"
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();// Finaliza o armazenamento de dados do teclado

	}

}
