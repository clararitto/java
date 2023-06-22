package Fundamentos;
import java.util.Scanner;

public class ex16 {
	private static final int M = 0;
	private static final int F = 0;

	public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	System.out.println("Digite F para feminino e M para masculino");
	char n=entrada.next().charAt(0);
	System.out.println(n == 'F'?"Feminino":n == 'M'?"Masculino":"Não existe");
	
		
	}
}
