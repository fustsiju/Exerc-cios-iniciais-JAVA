import java.io.IOException;
import java.util.Scanner;

//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
public class exercicio4 {
	public static void main(String[] args) throws IOException {
		Scanner num = new Scanner(System.in);
		
				int ini = num.nextInt();
				int fin = num.nextInt();
				int dur;
				
				if(ini < fin) {
					dur = fin - ini;
				}else{
					dur = 24 - ini + fin;
				}
		
				System.out.println(dur);
				
		num.close();
	}
}
