package javaBoiLesson1;

//import java.util.Locale;//Biblioteca importada para usar Locale

public class helloGitHub {

	public static void main(String[] args) {
		/*
		double x = 23.1549334;
		int p = 39;
		
		//Limita o n�mero de casas decimais e
		//arredonda pra cima
		System.out.printf("%.2f%n", x);
		System.out.printf("%.3f%n", x);
		//Locale.setDefault(Locale.US);//Utiliza '.' no lugar de ',' como � nos US
		System.out.printf("%.3f%n", x);//Apenas depois de chamar a biblioteca � que funciona
		
		//Concatenando v�rios elementos em um comando de escrita
		System.out.println("O meu pinto tem " + p + " metros.");
		
		
		//Concatenando v�rios elementos utilizando printf
		System.out.printf("Eu tenho %d frangos, cada um pesando %.2f kg %n",p,x);
		
		//Concatenando elementos de natureza diferente (printf)
		
		String mago = "Gandalf the Grey";
		int idade = 5000;
		double fumoEstocado = 35.234345;
		System.out.printf("%s � um mago de %d anos, ele tem %.3f kg de fumo guardado. %n"
				,mago, idade, fumoEstocado);
		*/
		
		//"Casting" --> Uma vari�vel de um tipo recebe uma opera��o entre vari�veis de 
		// tipo igual por�m difrentes da sua. A vari�vel receptora ir� mudar seu tipo
		// para o das vari�veis da opera��o. 
		
		int k,z;
		double result;
		
		k = 5;
		z = 2;
		
		result = (double) k/z;//(double)-->Impede o casting e mantem a vari�vel em seu tipo original
		                      //Na verdade a corre���o que � chamada Casting
		
		System.out.println(result);
		
	}

}
