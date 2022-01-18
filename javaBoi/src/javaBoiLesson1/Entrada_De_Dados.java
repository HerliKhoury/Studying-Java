package javaBoiLesson1;

import java.util.Scanner;

public class Entrada_De_Dados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//Inicia o objeto de armazenamento de dados 
		                                   //do teclado
		
		String palavras;
		palavras = sc.next();//Armazena os dados recebidos pelo teclado na variável
		System.out.println("Voce digitou: " + palavras);
		
		sc.close();//Finaliza o armazenamento de dados do teclado
	}

}
