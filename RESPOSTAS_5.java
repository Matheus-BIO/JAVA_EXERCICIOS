import java.util.Scanner;

public class RESPOSTAS_5 {
	
	
public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		float x,y,z,c,m;
		int mat;
		
		System.out.println("Digite sua matr�cula e suas notas de f�sica:");
		mat=leitor.nextInt();
		System.out.println(" Digite sua primeira nota:");
		x=leitor.nextFloat();
		System.out.println(" Digite sua segunda nota:");
		y=leitor.nextFloat();
		System.out.println(" Digite sua terceira nota:");
		z=leitor.nextFloat();
		System.out.println(" Digite sua quarta nota:");
		c=leitor.nextFloat();
		m=((x+y+z+c)/4);
		System.out.println("Sua m�dia foi de "+m);
		
		if (m>=7)
		    System.out.println("Sua matricula �: "+mat+" e voc� foi aprovado.");
		if (m>=3.5&&m<=7)
			System.out.println("Sua matricula �: "+mat+" e voc� est� de recupera��o.");
		if (m<3.5)
			System.out.println("Sua matr�cula "+mat+" e voc� foi reprovado.");
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

