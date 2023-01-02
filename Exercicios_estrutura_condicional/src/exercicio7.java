import java.io.IOException;
import java.util.Scanner;

//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//Se o ponto estiver na origem, escreva a mensagem “Origem”.
//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
//situação.

public class exercicio7 {
	public static void main(String[] args) throws IOException {
		Scanner num = new Scanner(System.in);
		
		int x = num.nextInt();
		int y = num.nextInt();
		
		if (x > 0 && y > 0) {
			System.out.println("Pertence ao primeiro quadrante");
		} else if (x < 0 && y > 0) {
			System.out.println("Pertence ao segundo quadrante");
		} else if (x < 0 && y < 0) {
			System.out.println("Pertence ao terceiro quadrante");
		} else if (x > 0 && y < 0){
			System.out.println("Pertence ao quarto quadrante");
		} else {
			System.out.println("Origem");
		}
		num.close();
	}
}
