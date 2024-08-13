package prjCarro;

import java.util.Scanner;

public class AndarDeCarro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual a marca do carro?: ");
		String marca = sc.next();
		System.out.println("Qual o modelo do carro?: ");
		String modelo = sc.next();
		System.out.println("Qual a velocidade do carro?: ");
		int velocidade = sc.nextInt();
		
		System.out.println("Digite 1 para acelerar ou 2 para frear: ");
		int escolha = sc.nextInt();
		
		if (escolha == 1) {
			System.out.println("Quanto deseja acelerar?: ");
			int valor = sc.nextInt();
			velocidade+=valor;
		}
		else if (escolha == 2) {
			System.out.println("Quanto deseja frear?: ");
			int valor= sc.nextInt();
			velocidade-=valor;
		}
		
		else {
			System.out.println("Opção inválida");
		}
		
		System.out.println("Marca: "+marca);
		System.out.println("Modelo: "+modelo);
		System.out.println("Velocidade: "+ velocidade);
			
		sc.close();
	}

}
