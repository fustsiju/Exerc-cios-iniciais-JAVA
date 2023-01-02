import java.io.IOException;
import java.util.Scanner;

//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

public class exercicio2 {
	public static void main(String[] args) throws IOException {
		Scanner num = new Scanner(System.in);
		
		int n = num.nextInt();
		int in = 0;
		int out = 0;
		
		for (int i = 1 ; i <= n; i ++) {
			int x = num.nextInt();
				if(x >= 10 && x <= 20) {
					in++;
				}else {
					out++;
				}
		}
		System.out.println("In: " + in);
		System.out.println("Out: " + out);
		
		num.close();
	}
}
