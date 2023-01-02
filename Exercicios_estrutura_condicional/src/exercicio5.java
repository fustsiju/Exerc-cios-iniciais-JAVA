import java.io.IOException;
import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) throws IOException {
		Scanner num = new Scanner(System.in);
			
		int codigo = num.nextInt();
		int quantidade = num.nextInt();
		double total;
	
		if(codigo == 1) {
			total = quantidade * 4.0;
		}else if(codigo == 2) {
			total = quantidade * 4.5;
		}else if(codigo == 3) {
			total = quantidade * 5.0;
		}else if(codigo == 4) {
			total = quantidade * 2.0;
		}else{
			total = quantidade * 1.5;
		}
		
		System.out.println(total);
		
		num.close();
	}
}
