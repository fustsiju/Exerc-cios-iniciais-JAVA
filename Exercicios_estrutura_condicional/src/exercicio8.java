import java.io.IOException;
import java.util.Scanner;

//Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
//que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
//qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
//Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
//mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

public class exercicio8 {
	public static void main(String[] args) throws IOException {
		Scanner num = new Scanner(System.in);
		
		double salario = num.nextDouble();
		double imposto;
		
		if (salario <= 2000.00) {
			imposto = 0.00;
		} else if (salario <= 3000.00) {
			imposto = (salario - 2000) * 0.08;
		} else if (salario <= 4500.00) {
			imposto = (salario - 3000) * 0.18 + 1000 * 0.08;
		} else {
			imposto = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
		}
		
		System.out.printf("R$ %.2f%n",imposto);
		
		num.close();
	}
}
