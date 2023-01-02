import java.io.IOException;
import java.util.Scanner;

//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.

public class exercicio4 {
	public static void main(String[] args) throws IOException {
		
		Scanner num = new Scanner(System.in);
		
		int numero = num.nextInt();
		float horas = num.nextFloat();
		float valorhora = num.nextFloat();
		float total = horas * valorhora;
		
		System.out.println("Numero do funcionario: " +numero);
		System.out.printf("Salario: R$ %.2f", total);
		
	num.close();
	}
}