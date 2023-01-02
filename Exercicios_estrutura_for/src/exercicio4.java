import java.io.IOException;
import java.util.Scanner;

//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

public class exercicio4 {
	public static void main(String[] args) throws IOException {
		Scanner num = new Scanner(System.in);
		
		int n = num.nextInt();
		
		for(int i = 1 ; i <= n; i++) {
			
			float a = num.nextFloat();
			float b = num.nextFloat();
			
			float div = (float) a / b;
			
			if(b == 0) {
				System.out.println("Divisão impossivel");
			}else {
				System.out.println(div);
			}
		}
		
		num.close();
	}
}
