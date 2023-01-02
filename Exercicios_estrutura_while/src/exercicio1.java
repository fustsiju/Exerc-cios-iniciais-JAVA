import java.io.IOException;
import java.util.Scanner;

//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

public class exercicio1 {
	public static void main(String[] args) throws IOException {
		Scanner num = new Scanner(System.in);
		
		int senha = num.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha incorreta!");
			senha = num.nextInt();
		}
		
		System.out.println("Acesso Permitido!");
		
		num.close();
	}
}
