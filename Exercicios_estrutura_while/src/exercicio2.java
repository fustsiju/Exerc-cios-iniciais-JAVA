import java.io.IOException;
import java.util.Scanner;

//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

public class exercicio2 {
	public static void main(String[] args) throws IOException {
		Scanner num = new Scanner(System.in);
		
		int x = num.nextInt();
		int y = num.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro quadrante");
			} else if ( x < 0 && y > 0 ) {
				System.out.println("Segundo quadrante");
			} else if ( x < 0 && y < 0) {
				System.out.println("Terceiro quadrante");
			} else {
				System.out.println("Quarto quadrante");
			}
			x = num.nextInt();
			y = num.nextInt();
		}
		
		num.close();
	}
}
