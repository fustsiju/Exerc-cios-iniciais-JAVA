import java.io.IOException;
import java.util.Scanner;

//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B

public class exercicio6 {
	public static void main(String[] args) throws IOException {
		Scanner num = new Scanner(System.in);
		double pi = 3.14159;
		float A = num.nextFloat();
		float B = num.nextFloat();
		float C = num.nextFloat();
		
		float areat = (A * C)/2;
		double areac = pi * (C * C);
		float trapezio = ((A + B) * C) / 2;
		float areaq = (B * B);
		float arear = (A * B);
		
		System.out.printf("TRIANGULO: %.3f\n",areat);
		System.out.printf("CIRCULO: %.3f\n",areac);
		System.out.printf("TRAPEZIO: %.3f\n",trapezio);
		System.out.printf("QUADRADO: %.3f\n",areaq);
		System.out.printf("RETANGULO: %.3f\n",arear);
		
		num.close();
	}
}
