import java.util.Scanner;

public class MainNumeroPositivoOuNegativo{

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		double num = teclado.nextInt();
		
		if(num > 0)
			System.out.println("positivo");
		else if(num == 0)
			System.out.println("numero igual 0");
		else
			System.out.println("negativo");
        
    }

}
