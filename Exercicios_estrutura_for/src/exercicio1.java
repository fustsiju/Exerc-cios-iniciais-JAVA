import java.io.IOException;
import java.util.Scanner;

//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
//X, se for o caso.

public class exercicio1 {
	public static void main(String[] args) throws IOException {
		try (Scanner num = new Scanner(System.in)) {
			int X = num.nextInt();
			int i;
			
			for (i = 1; i <= X; i++) {
				if(i%2 != 0){
					System.out.println(i);
				}
			}
			
		num.close();
		}
	}
}