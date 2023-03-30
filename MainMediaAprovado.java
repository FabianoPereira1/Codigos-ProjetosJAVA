import java.util.Scanner;

public class MainMediaAprovado{

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		double n1 = teclado.nextInt();
		System.out.println("Digite a segunda nota");
		double n2 = teclado.nextInt();
		System.out.println("Digite a terceira nota");
		double n3 = teclado.nextInt();
		
		double media=n1+n2+n3/3;
		
		if(media >= 7.0)
			System.out.println("aprovado");
		else if(media >= 5.0)
			System.out.println("prova final");
		else
			System.out.println("reprovou");

    }
}