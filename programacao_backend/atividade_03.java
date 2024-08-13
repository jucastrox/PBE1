package programacao_backend;

public class atividade_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual é o número do funcionário : ");
		int numero = sc.nextInt();
		
		System.out.println("Quantas horas foram trabalhadas: ");
		int hora = sc.nextInt();
		
		System.out.println("Quanto recebe: ");
		int recebe = sc.nextInt();
		
		System.out.printf("Funcionario " + numero + " O seu salario é de :" + hora*recebe + ".00");
        
		sc.close();
	}

}
