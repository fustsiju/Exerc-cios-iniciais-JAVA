import java.io.IOException;
import java.util.Scanner;

//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.

public class exercicio3 {
	public static void main(String[] args) throws IOException {
		Scanner num = new Scanner(System.in);
		
			int n1 = num.nextInt();
			int n2 = num.nextInt();
		
			if(n2 % n1 == 0) {
				System.out.println("São multiplos!");
			} else {
				System.out.println("Não são multiplos!");
			}
		
		num.close();
	}
}
