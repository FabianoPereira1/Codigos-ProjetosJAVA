import java.util.Scanner;

public class MainNumeroMenor {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("informe o 1º numero:");
		double n = teclado.nextDouble();
		System.out.println("informe o 2º numero:");
		double n2 = teclado.nextDouble();
		System.out.println("informe o 3º numero:");
		double n3 = teclado.nextDouble();
		
		double Auxiliar = (n<n2)? n:n2; 
		double Menor = (n<n3)? n:n3;
		
		System.out.println(Menor + "e o menor numero");
    }
}