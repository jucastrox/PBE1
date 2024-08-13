package programacao_backend;

import java.util.Scanner;

public class atividade_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Digite um número: ");
		int numero1= sc.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int numero2= sc.nextInt();
		
		System.out.println("A soma dos algoritmos é igual a: " + (numero1 + numero2));
		sc.close();

	}

}