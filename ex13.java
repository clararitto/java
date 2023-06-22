package Fundamentos;

import java.util.Scanner;

public class ex13 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero ");
		int resp = entrada.nextInt();
		System.out.println(resp==0? "numero neutro":resp>0? "numero positivo":"numero  negativo");
		
	}
}
