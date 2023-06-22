
package Fundamentos;

import java.util.Scanner;

public class ex14 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o 1° numero:"); 
		int n1 = leia.nextInt();
		System.out.println("Digite o 2° numero:");
		int n2 = leia.nextInt();
		System.out.println("Digite o 3° Numero:");
		int n3 = leia.nextInt();
		System.out.println(n1>n2 && n1>n3? "n1 é maior":n2>n1 && n2>n3?"n2 é maior":"n3 é o maior");
	
		
	}
}
