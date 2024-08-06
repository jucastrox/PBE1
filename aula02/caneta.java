package prjCaneta;

public class caneta {
	String modelo;
	String cor;
	double ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("cor: " + this.cor);
		System.out.println("Carga: " + carga);
	}
	
	void rabiscar () {
		
	}
	
	void tampar () {
		this.tampada = true;
	}
	
	void destampar () {
		this.tampada = false; 
	}
	
}
