import java.io.IOException;
import java.util.Scanner;

//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.
//Fórmula da área: area = π . raio2
//Considere o valor de π = 3.14159

public class exercicio2 {
		 
	    public static void main(String[] args) throws IOException {
	        Scanner num = new Scanner(System.in);
	        float raio = num.nextFloat();
	        double n = 3.14159;
	        double area = n * (raio*raio);
	        System.out.printf("A= %.4f", area);
	        
	        num.close();
	    }
	 
	}