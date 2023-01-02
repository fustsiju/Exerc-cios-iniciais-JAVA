import java.io.IOException;
import java.util.Scanner;

//Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//Lembrando que, por definição, fatorial de 0 é 1.

public class exercicio5 {
	public static void main(String[] args) throws IOException {
		Scanner num = new Scanner(System.in);
		
		int n = num.nextInt();
		int fatorial = 1;
		
		for(int i = 1; i <= n; i++) {
			fatorial = fatorial * i;
		}
		
		System.out.println(fatorial);
		
		num.close();
	}
}
