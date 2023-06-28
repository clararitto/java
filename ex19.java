package Fundamentos;
import java.util.Scanner;

public class ex19 {
public static void main(String[] args) {

	Scanner  entrada = new Scanner(System.in);
	System.out.println("Digite quantos alunos tem na sua sala de aula? : ");
	int resp = entrada.nextInt();
	
	 int n = 0;
	 int notas=0;
	 int media= 0;
	
	while (n<resp) {
	System.out.println("Digite a nota: ");
	Scanner leia = new Scanner (System.in);
	int R = entrada.nextInt();
	
	notas = notas + R;

}
	media=notas/resp;
	System.out.println(media);
}
}