package Fundamentos;
import java.util.Scanner;

public class ex15 {
	public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	System.out.println("Digite um numero");
	int n = entrada.nextInt();
	System.out.println(n==1?"Domingo":n==2? "Segunda":n==3? "Terça":n==4?"Quarta":n==5?"Quinta":n==6?"Sexta":n==7?"Sábado":"não existe");
		
	}
}
