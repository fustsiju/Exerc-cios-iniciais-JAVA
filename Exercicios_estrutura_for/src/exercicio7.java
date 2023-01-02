import java.io.IOException;
import java.util.Scanner;

//Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
//exemplo.

public class exercicio7 {
	public static void main(String[] args) throws IOException {
		Scanner num = new Scanner(System.in);
		
		int n = num.nextInt();
		
		for(int i = 1 ; i <= n ; i++) {
			
			int q = i * i;
			int c = i * i * i;
			
			System.out.println(i + " " + q + " " + c);
			
		}
		num.close();
	}
}
