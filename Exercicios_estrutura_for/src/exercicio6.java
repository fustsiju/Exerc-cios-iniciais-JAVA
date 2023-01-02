import java.io.IOException;
import java.util.Scanner;

//Ler um número inteiro N e calcular todos os seus divisores.

public class exercicio6 {
	public static void main(String[] args) throws IOException {
		Scanner num = new Scanner(System.in);
		
		int n = num.nextInt();
		
		for(int i = 1; i <= n ; i++) {
			
			if (n%i == 0) {
				System.out.println(i);
			}
		}
		
		num.close();
	}
}
