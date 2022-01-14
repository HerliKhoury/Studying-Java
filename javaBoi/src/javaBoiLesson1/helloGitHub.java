package javaBoiLesson1;

import java.util.Locale;//Biblioteca importada para usar Locale

public class helloGitHub {

	public static void main(String[] args) {
		double x = 23.1549334;
		int p = 39;
		
		//Limita o número de casas decimais e
		//arredonda pra cima
		System.out.printf("%.2f%n", x);
		System.out.printf("%.3f%n", x);
		//Locale.setDefault(Locale.US);//Utiliza '.' no lugar de ',' como é nos US
		System.out.printf("%.3f%n", x);//Apenas depois de chamar a biblioteca é que funciona
		
		//Concatenando vários elementos em um comando de escrita
		System.out.println("O meu pinto tem " + p + " metros.");
		
		
		//Concatenando vários elementos utilizando printf
		System.out.printf("Eu tenho %d frangos, cada um pesando %.2f kg",p,x);
	}

}
