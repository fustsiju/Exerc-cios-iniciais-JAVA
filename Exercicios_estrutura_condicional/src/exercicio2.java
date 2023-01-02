import java.io.IOException;
import java.util.Scanner;

//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

public class exercicio2 {
	public static void main(String[] args) throws IOException {
		Scanner num = new Scanner(System.in);
		
			int n = num.nextInt();
		
			if(n%2 == 0) {
				System.out.println("Par");
			}else {
				System.out.println("Impar");
			}
		
		num.close();
	}
}
