import java.io.IOException;
import java.util.Scanner;

//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
//nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

public class exercicio6 {
	public static void main(String[] args) throws IOException {
		Scanner num = new Scanner(System.in);
		
		int n = num.nextInt();
		
		if(n >= 0 && n <=25) {
			System.out.println("O valor está entre 0 e 25");
		} else if (n > 25 && n < 50) {
			System.out.println("O valor está entre 25 e 50");
		} else if (n > 50 && n < 75) {
			System.out.println("O valor está entre 50 e 75");
		} else if (n > 75 && n < 100) {
			System.out.println("O valor está entre 75 e 100");
		} else {
			System.out.println("Fora de alcance");
		}
		
		num.close();
	}
}
