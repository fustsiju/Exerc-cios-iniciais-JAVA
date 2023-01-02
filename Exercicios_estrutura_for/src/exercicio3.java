import java.io.IOException;
import java.util.Scanner;

//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
//peso 5.

public class exercicio3 {
	public static void main(String[] args) throws IOException {
		Scanner num = new Scanner(System.in);
		
		int n = num.nextInt();
		
			
			for(int i = 1 ; i <= n ; i++) {
				
				float a = num.nextFloat();
				float b = num.nextFloat();
				float c = num.nextFloat();
				
				float mediap = (a + b + c) / 3;
				
				System.out.printf("%.1f%n",mediap);
			}
			
			
		num.close();
	}
}
