import java.io.IOException;
import java.util.Scanner;

//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//exemplo.

public class exercicio3 {
	public static void main(String[] args) throws IOException {
		Scanner num = new Scanner(System.in);
		
		int codigo = num.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		
		while(codigo >= 1 || codigo <= 4) {
			if(codigo == 1) {
				alcool++;
			} else if (codigo == 2) {
				gasolina++;
			} else if (codigo == 3) {
				diesel++;
			} else if (codigo == 4){
				break;
			}
			codigo = num.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		num.close();
	}
}
