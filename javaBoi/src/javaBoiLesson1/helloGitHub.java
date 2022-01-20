package javaBoiLesson1;

//import java.util.Locale;//Biblioteca importada para usar Locale

public class helloGitHub {

	public static void main(String[] args) {
		/*
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
		System.out.printf("Eu tenho %d frangos, cada um pesando %.2f kg %n",p,x);
		
		//Concatenando elementos de natureza diferente (printf)
		
		String mago = "Gandalf the Grey";
		int idade = 5000;
		double fumoEstocado = 35.234345;
		System.out.printf("%s é um mago de %d anos, ele tem %.3f kg de fumo guardado. %n"
				,mago, idade, fumoEstocado);
		*/
		
		//"Casting" --> Uma variável de um tipo recebe uma operação entre variáveis de 
		// tipo igual porém difrentes da sua. A variável receptora irá mudar seu tipo
		// para o das variáveis da operação. 
		
		int k,z;
		double result;
		
		k = 5;
		z = 2;
		
		result = (double) k/z;//(double)-->Impede o casting e mantem a variável em seu tipo original
		                      //Na verdade a correçãão que é chamada Casting
		
		System.out.println(result);
		
	}

}
