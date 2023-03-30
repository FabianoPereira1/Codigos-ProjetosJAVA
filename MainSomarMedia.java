import java.util.Scanner;

public class MainSomarMedia {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
		String nota1 = teclado.next();
		double n1 = Double.parseDouble(nota1);
		System.out.println("Digite a segunda nota: ");
		String nota2 = teclado.next();
		double n2 = Double.parseDouble(nota2);
		System.out.println("Digite a terceira nota: ");
		String nota3 = teclado.next();
		double n3 = Double.parseDouble(nota3);
		
			System.out.println("A media e" + (n1+n2+n3)/3);
    }
}