package prjCarro;

import java.util.Scanner;

public class NovoCarro {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Carro carro01 = new Carro();
		Carro carro02 = new Carro("VW","GOL", 0);
		
		System.out.println("Qual a marca?: ");
		carro01.setMarca (sc.nextLine());
		
		System.out.println("Qual o modelo?: ");
		carro01.setModelo (sc.nextLine());
		
		System.out.println("Qual a velocidade?: ");
		carro01.setVelocidade (sc.nextInt());
		
		System.out.println("Opções: ");
		System.out.println("1. Acelerar");
		System.out.println("2. Frear");
		System.out.println("3. Buzinar");
		System.out.println("Escolha uma opção:");
		int escolha = sc.nextInt();
		
		if (escolha == 1) {
			System.out.println("Quanto você quer acelerar?");
			carro01.acelerar(sc.nextInt());
		}
		
		else if (escolha == 2) {
			System.out.println("Quanto você quer desacelerar?");
			carro01.frear(sc.nextInt());
		}
		
		else if (escolha == 3) {
			carro01.buzinar();
		}
		
		else {
			System.out.println("Opção inválida");
		}
		System.out.println("Marca: "+ carro01.getMarca());
		System.out.println("Modelo: "+ carro01.getModelo());
		System.out.println("Velocidade: "+ carro01.getVelocidade());
		sc.close();
	}

}
