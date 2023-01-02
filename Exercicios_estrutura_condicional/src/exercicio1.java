import java.io.IOException;
import java.util.Scanner;

//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
public class exercicio1 {
	public static void main(String[] args) throws IOException {
		Scanner num = new Scanner(System.in);
		
			int n = num.nextInt();
		
			if(n>=0) {
				System.out.println("Positivo!");
			}else {
				System.out.println("Negativo!");
			}
		
		num.close();
	}
}
