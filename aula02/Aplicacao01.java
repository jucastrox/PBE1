package prjCaneta;

import java.util.Scanner; 

public class Aplicacao01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		caneta caneta01 = new caneta();
		caneta01.modelo = "BIC";
        caneta01.cor = "Azul"; 
        caneta01.ponta = 0.5; 
        caneta01.tampada = false;
        
        caneta caneta02 = new caneta(); 
        caneta02.modelo = "Faber";
        caneta02.cor = "Verde";
        caneta02.ponta = 1.0;
        caneta02.tampada = true;
        
        caneta01.status();
        
        System.out.println("Qual a carga da caneta 01?");
        caneta01.carga = sc.nextInt();
        
        System.out.println("Qual a carga da caneta 02?");
        caneta02.carga = sc.nextInt();
        
        caneta01.status();
        caneta02.status();
        
	}

}