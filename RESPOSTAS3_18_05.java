import java.util.Scanner;

public class RESPOSTAS3_18_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner leitor = new Scanner (System.in);
		
		float salario;
		
			System.out.println("Digite seu antigo sal�rio :");
		salario=leitor.nextFloat();
				
		if (salario>=0 && salario<=1000)
			System.out.println("Seu sal�rio ter� 15% de aumento, agora ser� de "+ (salario+(salario/100*15)));	
		
		if (salario>=1000.01 && salario<=2500)
			
			System.out.println("Seu sal�rio ter� 7% de aumento, agora ser� de "+ (salario+(salario/100*7)));	
			
		if (salario>2500)
				System.out.println("Seu sal�rio continuar� o mesmo.");	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
