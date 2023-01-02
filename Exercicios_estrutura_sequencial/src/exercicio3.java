import java.io.IOException;
import java.util.Scanner;

//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

public class exercicio3 {
	public static void main(String[] args) throws IOException {
		Scanner num = new Scanner(System.in);
		int A = num.nextInt();
		int B = num.nextInt();
		int C = num.nextInt();
		int D = num.nextInt();
	
		int diferenca = (A * B - C * D);
	
		System.out.println("DIFERENCA = " + diferenca);
		num.close();
	}
}