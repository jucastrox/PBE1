package programacao_backend;

import java.util.Scanner;

public class atividade_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		
		System.out.print("Digite o valor do raio: ");
		double raio= sc.nextDouble();
		System.out.printf("A área deste círculo é igual a: %.4f", pi*raio*raio );
	}

}
