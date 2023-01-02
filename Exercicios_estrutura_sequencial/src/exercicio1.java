import java.io.IOException;
import java.util.Scanner;

//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.

public class exercicio1 {
	
	public static void main(String[] args) throws IOException {
	Scanner num = new Scanner(System.in);
	
	int a = num.nextInt();
	int b = num.nextInt();
	
	int soma = a + b;
	
		System.out.println("A soma dos inteiros e: " + soma);
		num.close();
	}
}
