import java.io.IOException;
import java.util.Scanner;

//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

public class exercicio5 {
	public static void main(String[] args) throws IOException {
		Scanner num = new Scanner(System.in);
		
		//int cod1 = num.nextInt();
		
		int quant1 = num.nextInt();
		float valor1 = num.nextFloat();
		
		//int cod2 = num.nextInt();
		
		int quant2 = num.nextInt();
		float valor2 = num.nextFloat();
		
		float total = (quant1 * valor1) + (quant2 * valor2);
		
		System.out.println("Valor a pagar: R$ " + total);
		num.close();
	}
}
